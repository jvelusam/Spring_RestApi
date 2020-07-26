package com.code.spring.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.spring.boot.entity.Employee;
import com.code.spring.boot.services.EmployeeSerice;

@RequestMapping("employee")
@RestController
public class EmployeeController
{

	@Autowired
	private EmployeeSerice employeeservice;
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee){
		return employeeservice.saveEmployee(employee);
		}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee){
		return employeeservice.updateEmployee(employee);
		}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployeelist();
	}
	@GetMapping("/by/{employeeid}")
	public Employee getEmployee(@PathVariable(name = "employeeid")Long employeeid)
	{
		return  employeeservice.getEmployee(employeeid);
	}
@DeleteMapping("/delete/{employeeid}")
	public void deleteEmployee(@PathVariable(name = "employeeid")Long employeeid)
	{
		  employeeservice.getEmployee(employeeid);
	}
	
	
}