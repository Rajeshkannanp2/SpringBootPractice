package com.rajesh.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rajesh.entity.Employee;
import com.rajesh.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService=theEmployeeService;
	}
	
	@GetMapping("/employees/delete")
	public String showFormForDelete(@RequestParam("employeeId") int theId) {
		//remove the user by id
		employeeService.deleteById(theId);
		
		//return the employee list
		return ("redirect:/employees/list");
	}
	@GetMapping("/employees/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		//get the employee from the service
		Employee theEmployee = employeeService.findById(theId);
		
		//set employee in the model to prepopulate the form
		theModel.addAttribute("employee",theEmployee);
		
		//send over to form
		return "/employees/employee-form";
	}
	@GetMapping("/employees/list")
	public String listEmployees(Model theModel) {
		//get the employee from the db
		List<Employee> theEmployees = employeeService.findAll();
		
		//added to the Spring model object
		theModel.addAttribute("employees", theEmployees);
		
		//send over to form
		return "/employees/list-employees";
	}
	@GetMapping("/employees/showFormForAdd")
	public String showFormToAdd(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return("/employees/employee-form");
	}
	@PostMapping("/employees/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		employeeService.save(theEmployee);
		return ("redirect:/employees/list");
	}
	@GetMapping("/")
	public String showHomePage() {
		return ("redirect:/employees/list");
	}
}
