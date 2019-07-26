package org.ougen.exam1.service.impl;

import org.ougen.exam1.mapper.AddressMapper;
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
    private AddressMapper addressMapper;

    @Override
    public Address getAddressByName(String address) {
        List<Address> addresseList = addressMapper.getAddressByName(address);
        if (addresseList.size()==0){
            return null;
        }
        for (Address address1 : addresseList){
            if (address1.getAddress()!=null&&!"".equals(address1.getAddress())){
                return address1;
            }
        }
        Address address2 = addresseList.get(0);
        address2.setAddress(address2.getAddress2());
        return address2;
    }
}
