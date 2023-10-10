package com.micro.services.service;

import com.micro.services.entity.Address;
import com.micro.services.model.AddressRequest;
import com.micro.services.model.AddressResponse;
import org.springframework.stereotype.Service;
@Service
public class AddressService {
    public AddressRequest registerAddress(Address address) {
        return AddressRequest.builder()
                .id(address.getId())
                .street(address.getStreet())
                .landMark(address.getLandMark())
                .city(address.getCity())
                .zip(address.getZip())
                .country(address.getCountry())
                .build();
    }


    public AddressResponse getById(Address address) {
        return AddressResponse.builder()
                .id(address.getId())
                .street(address.getStreet())
                .landMark(address.getLandMark())
                .city(address.getCity())
                .zip(address.getZip())
                .country(address.getCountry())
                .build();
    }
}
