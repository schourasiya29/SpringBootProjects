package com.sac.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sac.practice.entity.Employee;
import com.sac.practice.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepository empRepository;
	
	public List<Employee> getAllEmployees() {
		
		System.out.println("Printing all employees");
		List<Employee> empListAll = empRepository.findAll(); 
		return empListAll;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("Employee object added successfully");
		Employee empAdded =empRepository.save(employee);
		return empAdded;
	}

	@Override
	public Employee getEmployeeByID(long empid) {
		Employee empById = empRepository.findById(empid).get();
		return empById;
	}

	@Override
	public void deleteEmployeeByID(long empid) {
		empRepository.deleteById(empid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee empUpdated =empRepository.save(employee);
		return empUpdated;
	} 

}
