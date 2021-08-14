package com.article.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.article.exceptions.ResourceNotFoundException;
import com.article.model.Employee;

@Service
public interface EmployeeDetailsService {

	public List<Employee> getAllEmployees();

	public ResponseEntity<Employee> getEmployeeById(Long employeeId) throws ResourceNotFoundException;

	public Employee createEmployee(Employee employee);
	

	public ResponseEntity<Employee> updateEmployee(Long employeeId,Employee employeeDetails) throws ResourceNotFoundException;
	
	public Map<String, Boolean> deleteEmployee(Long employeeId) throws ResourceNotFoundException;

	public List<Employee> getEmployeeByCountry(String country);

	public List<Employee> getEmployeeByState(String state);

	public List<Employee> getEmployeeByCity(String city);

}
