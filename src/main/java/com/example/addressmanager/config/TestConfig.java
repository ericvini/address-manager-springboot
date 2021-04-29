package com.example.addressmanager.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.addressmanager.entities.Address;
import com.example.addressmanager.entities.User;
import com.example.addressmanager.repositories.AddressRepository;
import com.example.addressmanager.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "060.196.813-19", "18/04/1995");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "060.196.813-18", "19/04/1995"); 
		
		Address a1 = new Address(null, "rua benedito Martins, 63",63,"casa","Oeiras nova","Oeiras","PI","645000", u1);
		Address a2 = new Address(null, "rua benedito Martins, 63",63,"casa","Oeiras nova","Oeiras","PI","645000", u2);
		Address a3 = new Address(null, "rua benedito Martins, 63",63,"casa","Oeiras nova","Oeiras","PI","645000", u2);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		addressRepository.saveAll(Arrays.asList(a1,a2,a3));
	}
	
}
