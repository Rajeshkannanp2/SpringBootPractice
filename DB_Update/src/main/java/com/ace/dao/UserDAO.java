package com.ace.dao;

import org.springframework.data.repository.CrudRepository;

import com.ace.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{

}
