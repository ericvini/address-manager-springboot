package com.example.addressmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressmanager.entities.Address;
import com.example.addressmanager.repositories.AddressRepository;
import com.example.addressmanager.services.exceptions.ResourceNotFoundException;

import java.util.Optional;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public List<Address> findAll(){
		return repository.findAll();
	}
	
	public Address findById(Long id) {
		Optional<Address> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	public Address insert(Address obj) {
		return	repository.save(obj);
		}
}
