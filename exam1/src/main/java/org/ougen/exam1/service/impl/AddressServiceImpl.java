package org.ougen.exam1.service.impl;

import org.ougen.exam1.model.Address;
import org.ougen.exam1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 11:37 2019/7/26
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressService addressService;
    @Override
    public List<Address> getAddress(int addressId) {
        return addressService.getAddress(addressId);
    }
}
