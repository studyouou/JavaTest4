package org.ougen.exam1.service;

import org.ougen.exam1.model.Customer;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:09 2019/7/26
 */
public interface CustomerService {
    public boolean isAuthUser(String firstName,String lastName);

    void addCustomer(Customer customer);
}
