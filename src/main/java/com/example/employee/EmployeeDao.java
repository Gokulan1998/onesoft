package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addEmployee(Employee emp) {
		empRepo.save(emp);
		return "successfully saved";
	}
	public Employee getEmployee(int id) {
		return empRepo.findById(id).get();
		
	}
	public String delEmployee(int id) {
		 empRepo.deleteById(id);
		 return "employee deleted successfully";
	}
	public String updateEmployee(Employee emp) {
		empRepo.save(emp);
		return "successfully updated";
	}
	public List<Employee> getListEmp() {
		return empRepo.findAll();
	}
	public String updateListid(Employee emp) {
        empRepo.save(emp);
		return "employee added successfully";
	}
	public List<Employee>getAllEmp(){
		return empRepo.findAll();
	}
	public List<Employee> getMaxSal() {
		return empRepo.findAll();
	}
	public List<Employee> getMax() {
		return empRepo.findAll();
	}
	public List<Employee>getMinage() {
		return empRepo.findAll();
	}
//	public List<String> getRangeofage(){
//		empRepo.findAll();
//	}
	public List<Employee> getbysal(int sal1,int sal2){
		return empRepo.getBysalary(sal1,sal2);
	}
	
}
