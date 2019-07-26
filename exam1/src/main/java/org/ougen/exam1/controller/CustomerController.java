package org.ougen.exam1.controller;

import org.ougen.exam1.model.Address;
import org.ougen.exam1.model.Customer;
import org.ougen.exam1.model.Model;
import org.ougen.exam1.service.AddressService;
import org.ougen.exam1.service.CustomerService;
import org.ougen.exam1.util.ModelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:17 2019/7/26
 */
@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/customer/login")
    public Model login(String firstName,String lastName){
        if (firstName==null ||"".equals(firstName) ||"".equals(lastName) || lastName==null){
            logger.info("该用户传入参数部分为空");
            return ModelUtil.getModel("fail",-1, "fisrtName或lastName不能为空");
        }
        boolean isAuth = customerService.isAuthUser(firstName,lastName);
        if (isAuth){
            logger.info("登录成功：{}",firstName);
            return ModelUtil.getModel("success",1, "你已经登录成功");
        }else {
            logger.info("登录失败，密码错误：{}",firstName);
            return ModelUtil.getModel("fail",-1, "登录失败，请重新登录");
        }
    }
    @PutMapping("/customer/addCustomer")
    public Model putCustomer(@Validated Customer customer, BindingResult result, @RequestParam("address")String address){
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            StringBuilder builder = new StringBuilder();
            for (ObjectError error:allErrors){
                builder.append(error.getDefaultMessage()).append(":").append("不能未空");
                logger.info("绑定参数不对:{}为空",error.getDefaultMessage());
            }
            return ModelUtil.getModel("fail",-1,builder.toString());
        }
        if (address==null||"".equals(address)){
            logger.info("地址为空");
            return ModelUtil.getModel("fail",-1,"地址不能为空");
        }
        Address address1 = addressService.getAddressByName(address);
        if (address1 == null){
            logger.info("地址填写错误");
            return ModelUtil.getModel("fail",-1,"地址填写错误");
        }
        customer.setAddressId(address1.getAddressId());
        customerService.addCustomer(customer);
        logger.info("添加成功：{}",customer.toString());
        return ModelUtil.getModel("success",1,customer.getCustomerId());
    }
    @PostMapping("/customer/{customerId}/update")
    public Model updateCustomer(@PathVariable("customerId")int customerId ,Customer customer){
        Customer newCustomer = customerService.updateCustomerById(customerId,customer);
        logger.info("成功修改用户{}",newCustomer);
        return ModelUtil.getModel("success",1,newCustomer);
    }

    @DeleteMapping("/customer/{customerId}/delete")
    public Model deleteCustomer(@PathVariable("customerId")int customerId){
        customerService.deleteCustomerById(customerId);
        logger.info("成功删除{}",customerId);
        return ModelUtil.getModel("success",1,"删除成功");
    }
}
