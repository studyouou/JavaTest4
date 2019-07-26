package org.ougen.exam1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ougen.exam1.mapper.CustomerMapper;
import org.ougen.exam1.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Exam1ApplicationTests {
    @Autowired
    private CustomerMapper customerMapper;
    @Test
    public void contextLoads() {

//        Customer customer = customerMapper.getCustomerById(602);
//        customer.setFirstName("ouou");
//
//        customerMapper.updateCustomer(customer);
        customerMapper.deleteCustomer(602);
    }
}
