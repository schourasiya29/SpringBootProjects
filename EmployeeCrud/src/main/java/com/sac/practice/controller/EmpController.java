package com.sac.practice.controller;

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

import com.sac.practice.entity.Employee;
import com.sac.practice.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;

	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee addedEmployee = empService.addEmployee(employee);
		return new ResponseEntity<Employee>(addedEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> empList = empService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}
	
	@GetMapping("/emps/{empid}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("empid") long empid){
		Employee empById = empService.getEmployeeByID(empid);
		return new ResponseEntity<Employee>(empById, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmployeeByID(@PathVariable("empid") long empid){
		          empService.deleteEmployeeByID(empid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee updatedEmployee = empService.updateEmployee(employee);
		return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.CREATED);
	}

}
