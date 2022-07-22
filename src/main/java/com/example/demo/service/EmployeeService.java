package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;

	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		emprepo.findAll().forEach(employees::add);
		return employees;
	}
	/*
	public void updateEmployee(String id, String employee) {
		emprepo.save(employee);

	}
	*/
	public void addEmployee(Employee employee) {
		emprepo.save(employee);
	}

	public void deleteemployee(int id) {
		emprepo.deleteById(id);
	}

}
