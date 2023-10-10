package com.micro.services.repository;

import com.micro.services.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface AddressRepo extends JpaRepository<Address, Serializable> {
    Address findById(int id);

}
