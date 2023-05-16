package com.onesoft.collection3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		Employee[] empdet= { new Employee("Gokul",1122,60000),new Employee("Ashok",1123,62000),
				new Employee("krishna",1140,70000),new Employee("Karthi",1500,55000)};
		List<Employee>emp=Arrays.asList(empdet);
		System.out.println(emp);
		Long salcount=emp.stream().filter(x->x.getSalary()>60000).count();
		System.out.println(salcount);
		List<String>ordered=emp.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
		System.out.println(ordered);
		Employee max=emp.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(max);
		}
	}


