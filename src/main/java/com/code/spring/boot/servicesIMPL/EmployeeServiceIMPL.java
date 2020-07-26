package com.code.spring.boot.servicesIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.spring.boot.dao.EmployeeDao;
import com.code.spring.boot.entity.Employee;
import com.code.spring.boot.services.EmployeeSerice;
@Service
public class EmployeeServiceIMPL implements EmployeeSerice {
	
	@Autowired
	private EmployeeDao employeedao;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeelist() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public Employee getEmployee(Long employeeid) {
		// TODO Auto-generated method stub
		return employeedao.findOne(employeeid);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
	employeedao.delete(employeeId);
		
	}

}
