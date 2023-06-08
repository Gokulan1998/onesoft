package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class EmployeeController_1 {
	@Autowired
	EmployeeService empSer;
	
//	@RequestMapping(value = "/get",method=RequestMethod.GET)
	@GetMapping(value = "/get")
	public String getEmp()
	{
		return "hello.html";
	}
}
