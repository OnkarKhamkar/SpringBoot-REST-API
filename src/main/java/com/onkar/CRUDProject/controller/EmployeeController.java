package com.onkar.CRUDProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onkar.CRUDProject.model.Employee;
import com.onkar.CRUDProject.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//REST API crud
	//create user API- POST
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee emp) {
		Employee emp1=employeeService.createEmployee(emp);
		return emp1;
	}
	
	//get user API- GET
	@GetMapping("/all")
	public List<Employee> getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
	
	//get user by id- GET
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") long id)
	{
		return this.employeeService.getEmployeeById(id);
	}
	
	//delete user API- DELETE
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") long id)
	{
		this.employeeService.deleteEmployee(id);
	}
	
	//update user API- PUT
	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable("id") long id)
	{
		return this.employeeService.updateEmployee(emp,id);
		
	}
	
	

}
