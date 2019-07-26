package org.ougen.exam1.mapper;

import org.apache.ibatis.annotations.Param;
import org.ougen.exam1.model.Address;
import org.ougen.exam1.model.Customer;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 11:33 2019/7/26
 */
public interface AddressMapper {
    public List<Address> getAddressByName(String address);

}
