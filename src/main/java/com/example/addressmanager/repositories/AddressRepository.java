package com.example.addressmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressmanager.entities.Address;

public interface AddressRepository extends JpaRepository<Address,Long>{

}
