package com.example.demo.controller;


import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/api/controller1")
public class Controller1 {
	
	static Logger logger = LogManager.getLogger(Controller1.class);
	
	
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		logger.info(" getAll hit ..........");
		return empservice.getAllEmployee();
	}
	
	@PostMapping("/employee/add")
	public void addEmployee(@RequestBody Employee employee) {
		logger.info(" add hit ..........");
		empservice.addEmployee(employee);
	}
	
	@DeleteMapping("employee/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		logger.info(" delete hit ..........");
		empservice.deleteemployee(id);
	}
	
	
}
