package com.sac.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sac.demo.custom.exceptions.ServiceExceptions;
import com.sac.demo.entities.Employee;
import com.sac.demo.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		// Validations
		if (employee.getFirstName().isEmpty() || employee.getFirstName().length() == 0) {
			throw new ServiceExceptions("600", "Please Enter a valid Employee name");
		}
		try {
			Employee addedEmployee = employeeRepository.save(employee);
		} catch (IllegalArgumentException e) {
			throw new ServiceExceptions("602", "The Given employee is null");
		}
		return addedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmpList = employeeRepository.findAll();
		return allEmpList;
	}

	@Override
	public Employee getAnEmployee(long empId) {
		Employee employeeById = employeeRepository.findById(empId).get();
		return employeeById;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}

	@Override
	public void deleteAnEmployee(long empId) {
		employeeRepository.deleteById(empId);

	}

}
