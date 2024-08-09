package com.ace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ace.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
