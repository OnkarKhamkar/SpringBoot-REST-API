package com.onkar.CRUDProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onkar.CRUDProject.model.Employee;
import com.onkar.CRUDProject.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplement implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return this.employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return this.employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee emp, long id) {
		// TODO Auto-generated method stub
		Employee emp1=employeeRepository.findById(id).get();
		emp1.setName(emp.getName());
		emp1.setEmail(emp.getEmail());
		emp1.setPhone(emp.getPhone());
		emp1.setAddress(emp.getAddress());
		
		return employeeRepository.save(emp1);
	}

}
