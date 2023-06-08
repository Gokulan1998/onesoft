package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empser;

	@PostMapping(value = "/add")
	public String addEmployee(@RequestBody Employee emp) {
		return empser.addEmployee(emp);
	}

	@GetMapping(value = "/Findid/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return empser.getEmployee(id);
	}

	@DeleteMapping(value = "/deleteid/{id}")
	public String delEmployee(@PathVariable int id) {
		return empser.delEmployee(id);
	}

	@PostMapping(value = "/updateid")
	public String updateEmployee(@RequestBody Employee emp) {
		return empser.updateEmployee(emp);
	}

	@GetMapping(value = "/FindListid")
	public List<Employee> getListEmp() {
		return empser.getListEmp();
	}

	@PostMapping(value = "/updateListid")
	public String updateListid(@RequestBody Employee emp) {
		return empser.updateListid(emp);
	}

	@GetMapping(value = "/getEmployeebygender/{gender}")
	public List<Employee> getByGender(@PathVariable String gender) {
		return empser.getByGender(gender);

	}

	@GetMapping(value = "/getMaxsalary")
	public Employee getMaxSal() {
		return empser.getMaxSal();

	}

	@GetMapping(value = "/getMinage")
	public Employee getMinage() {
		return empser.getMinage();
	}

	@GetMapping(value = "/Getrangeofage/{age1}/{age2}")
	public List<String> getRangeofage(@PathVariable int age1, @PathVariable int age2) {
		return empser.getRangeofage(age1, age2);
	}

//	@GetMapping(value = "/getrangesal/{sal1}/{sal2}")
//	public List<String> getRangesal(@PathVariable int sal1,int sal2){
//		return empser.getRangesal(sal1,sal2);
//	}
	@GetMapping(value = "/Getbysal/{sal1}/{sal2}")
	public List<Employee> getbysal(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getbysal(sal1, sal2);
	}

	@CrossOrigin(origins = "http:\\localhost:8080")

	@GetMapping(value = "/getEmployee")
	public String getEmployee(@PathParam("name") String name) {
		return empser.getEmployee(name);
	}
//	@GetMapping(value = "/getAll")
//	public School getBike() {
//
//		School c1 = WebClient.builder().build().get().uri("http://localhost:8087/getsecondminBike").retrieve()
//				.bodyToMono(School.class).block();
//		return c1;
//	}
	
}
