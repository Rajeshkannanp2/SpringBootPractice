package com.rajesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
