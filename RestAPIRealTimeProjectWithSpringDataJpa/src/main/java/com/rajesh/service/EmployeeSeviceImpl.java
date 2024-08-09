package com.rajesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rajesh.dao.EmployeeRepository;
import com.rajesh.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeSeviceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeSeviceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		
		Employee theEmployee = null;
		if (result.isPresent()) {
			theEmployee = result.get();
		}else {
			throw new RuntimeException("Did not find employee: "+ theId);
		}
		return theEmployee;
	}
	@Override
	public Employee save(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}
	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}
