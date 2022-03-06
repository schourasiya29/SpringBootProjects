package com.sac.demo.services;

import java.util.List;

import com.sac.demo.entities.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getAnEmployee(long empId);

	public Employee updateEmployee(Employee employee);

	public void deleteAnEmployee(long empId);

}
