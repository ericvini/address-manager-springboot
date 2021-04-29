package com.example.addressmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressmanager.entities.User;
import com.example.addressmanager.repositories.UserRepository;
import com.example.addressmanager.services.exceptions.ResourceNotFoundException;

import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
		public User insert(User obj) {		
		return	repository.save(obj);
		}
	
}
