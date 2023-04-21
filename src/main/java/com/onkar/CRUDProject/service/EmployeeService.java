package com.onkar.CRUDProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onkar.CRUDProject.model.Employee;

@Service
public interface EmployeeService {
	
	//create employee
	public Employee createEmployee(Employee emp);
	
	//read employee
	public List<Employee> getAllEmployee();
	
	//read employees by ID
	public Employee getEmployeeById(long id);
	
	//delete employee by id
	public void deleteEmployee(long id);
	
	//update employee by id
	public Employee updateEmployee(Employee employee, long id);
	

}
