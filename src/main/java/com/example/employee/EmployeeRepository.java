package com.example.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(value = "Select * from employee where salary>=? and salary<=?",nativeQuery = true)
	public List<Employee> getBysalary(int sal1,int sal2);
	@Query(value = "Select * from employee",nativeQuery = true)
	public String getEmp();
}
