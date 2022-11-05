package com.asb.expbaseservice.service;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Address;

import java.util.List;

public interface IAddressService {
    List<Address> getAllAddressList();
    Address getAddressById(Long userId);
    String deleteAddressById(Long addressId, Long userId) throws ResourceNotFoundException;
}
