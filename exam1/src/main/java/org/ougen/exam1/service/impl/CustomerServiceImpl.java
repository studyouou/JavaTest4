package org.ougen.exam1.service.impl;

import org.ougen.exam1.mapper.CustomerMapper;
import org.ougen.exam1.model.Customer;
import org.ougen.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:10 2019/7/26
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public boolean isAuthUser(String firstName,String lastName) {
        List<Customer> customerList = customerMapper.getCustomer(firstName);
        if (customerList.size()==0){
            return false;
        }
        for (Customer customer:customerList){
            if (firstName.equals(customer.getFirstName())&&lastName.equals(customer.getLastName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
    }


}
