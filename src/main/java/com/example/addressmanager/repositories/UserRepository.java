package com.example.addressmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressmanager.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
