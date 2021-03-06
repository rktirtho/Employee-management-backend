package com.rktirtho.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rktirtho.employeemanagement.model.Employee;
import com.rktirtho.employeemanagement.repository.EmployeeRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class EmployeeComtroller {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("employees")
	public List<Employee> getAll(){
		return repository.findAll();
	}
	
	@PostMapping("addemployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}

}
