package org.ougen.exam1.mapper;

import org.apache.ibatis.annotations.Param;
import org.ougen.exam1.model.Customer;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:01 2019/7/26
 */
public interface CustomerMapper {
    public List<Customer> getCustomer(@Param("firstName") String firstName);

    public void addCustomer(@Param("customer") Customer customer);

    public void deleteCustomer(@Param("customerId")int customerId);

    public void UpdateCustomer(@Param("customer")Customer customer);
}
