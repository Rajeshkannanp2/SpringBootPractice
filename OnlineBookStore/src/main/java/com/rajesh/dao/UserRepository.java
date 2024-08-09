package com.rajesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	Users findByUsername(String username);
}
