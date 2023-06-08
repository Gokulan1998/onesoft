package com.example.employee;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;

	public String addEmployee(Employee emp) {
		return empDao.addEmployee(emp);
	}

	public Employee getEmployee(int id) {
		return empDao.getEmployee(id);

	}
	public String delEmployee(int id) {
		return empDao.delEmployee(id);
		
	}
	public String updateEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}
	public List<Employee> getListEmp() {
		return empDao.getListEmp();
	}
	public String updateListid(Employee emp) {
		return empDao.updateListid(emp);
	}
	public List<Employee>getByGender(String gender){
		List<Employee>allEmp=empDao.getAllEmp();
		List<Employee>result=allEmp.stream().filter(x->x.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
		return result;
	}
	public Employee getMaxSal(){
		List<Employee>allEmp=empDao.getAllEmp();
		
		Employee maxsal=allEmp.get(0);
		for(Employee x:allEmp) {
			if(x.getAge()>maxsal.getAge()) {
				maxsal=x;
			}
		}
		return maxsal;
	}
	public Employee getMinage() {
		List<Employee>allEmp=empDao.getAllEmp();
		Employee minage=allEmp.get(0);
		for(Employee x:allEmp) {
			if(x.getAge()<=minage.getAge()) {
				minage=x;
			}
		}
		return minage;
		
	}
	public List<String> getRangeofage(int  age1,int age2){
		List<Employee>allEmp=empDao.getAllEmp();
		List<Employee>emprange=allEmp.stream().filter(x->(x.getAge()>=age1 && x.getAge()<=age2)).collect(Collectors.toList());
		List<String>empname=emprange.stream().map(x->x.getName()).collect(Collectors.toList());
		return empname;
		}
//	public List<String>getRangesal(int sal1,int sal2) {
//		List<Employee>allEmp=
//	}
	public List<Employee> getbysal(int sal1,int sal2) {
		return empDao.getbysal(sal1,sal2);
	}
	public String getEmployee(String name) {
		String n="";
		if(name.equals(name)) {
			n="correct name";
		}
		return n;
	}
	
}
