package com.code.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.spring.boot.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>  {

}
