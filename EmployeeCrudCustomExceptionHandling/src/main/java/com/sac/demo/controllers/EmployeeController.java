package com.sac.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sac.demo.entities.Employee;
import com.sac.demo.services.EmployeeService;

@RestController
@RequestMapping("/empCrud")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee addedEmployee = employeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(addedEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmpList = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmpList, HttpStatus.OK);
	}

	@GetMapping("/emp/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") long empId) {
		Employee emplyeeById = employeeService.getAnEmployee(empId);
		return new ResponseEntity<Employee>(emplyeeById, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(employee);
		return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<Void> deleteAnEmployee(@PathVariable("empId") long empId) {
		employeeService.deleteAnEmployee(empId);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);

	}
}
