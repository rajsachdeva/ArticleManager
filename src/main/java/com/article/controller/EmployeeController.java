package com.article.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.article.exceptions.ResourceNotFoundException;
import com.article.model.Employee;
import com.article.service.EmployeeDetailsService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeDetailsService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		return employeeService.getEmployeeById(employeeId);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		return employeeService.updateEmployee(employeeId, employeeDetails);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		return employeeService.deleteEmployee(employeeId);
	}

	@GetMapping("/getEmployeeByCountry/{country}")
	public List<Employee> getEmployeeByCountry(@PathVariable String country) {
		return employeeService.getEmployeeByCountry(country);
	}

	@GetMapping("/getEmployeeByState/{state}")
	public List<Employee> getEmployeeByState(@PathVariable String state) {
		return employeeService.getEmployeeByState(state);
	}

	@GetMapping("/getEmployeeByCity/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable String city) {
		return employeeService.getEmployeeByCity(city);
	}
}
