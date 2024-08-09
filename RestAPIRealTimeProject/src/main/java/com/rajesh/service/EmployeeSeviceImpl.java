package com.rajesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rajesh.dao.EmployeeDAO;
import com.rajesh.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeSeviceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeSeviceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
	@Override
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}
	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		return employeeDAO.save(theEmployee);
	}
	@Override
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}

}
