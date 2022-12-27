package com.asb.expbaseservice.service;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> getAllAddressList();
    Address getAddressByUserId(String userId) throws ResourceNotFoundException;
    String deleteAddressById(String addressId, String userId) throws ResourceNotFoundException;
    Address getAddressByAddressId(String addressId) throws ResourceNotFoundException;
}
