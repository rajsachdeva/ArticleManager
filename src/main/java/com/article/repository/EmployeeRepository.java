package com.article.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.article.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
	
	@Query("{'address.country': ?0}")
	List<Employee> getEmployeeByCountry(String country);
	
	@Query("{'address.city': ?0}")
	List<Employee> getEmployeeByCity(String city);
	
	@Query("{'address.state': ?0}")
	List<Employee> getEmployeeByState(String state);
	
}
