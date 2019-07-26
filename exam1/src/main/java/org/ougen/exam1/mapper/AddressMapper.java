package org.ougen.exam1.mapper;

import org.ougen.exam1.model.Address;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 11:33 2019/7/26
 */
public interface AddressMapper {
    List<Address> getAddressById(int addressId);
}
