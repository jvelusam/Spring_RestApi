package com.code.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.code.spring.boot.entity.Employee;

public interface EmployeeSerice 
{
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	List<Employee> getAllEmployeelist();
	Employee getEmployee(Long employeeid);
	void deleteEmployee(Long employeeId);
	
	
	
}
