package com.onkar.CRUDProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onkar.CRUDProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
