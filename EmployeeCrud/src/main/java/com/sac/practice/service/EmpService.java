package com.sac.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sac.practice.entity.Employee;


public interface EmpService {
	
	public List<Employee> getAllEmployees();

	public Employee addEmployee(Employee employee);

	public Employee getEmployeeByID(long empid);

	public void deleteEmployeeByID(long empid);

	public Employee updateEmployee(Employee employee);

}
