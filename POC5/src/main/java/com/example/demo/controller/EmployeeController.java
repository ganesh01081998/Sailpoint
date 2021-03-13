package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.CustomException;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(EmployeeController.class.getName());
	
	@PostMapping("/addEmployee")
	public Employee addEmployees(@RequestBody Employee employee) {
		
		
		String str="";
		str+=employee.getPhone();
		
		if(employee.getName().length() <=2 || employee.getName().equals(null)) {
			log.warn(employee.getName()+" is null or length is <=  2");
			throw new CustomException("Name Must be more than 2 characters");
		}
		else if(employee.getSal() == 0) {
			log.warn(employee.getSal()+" is null");
			throw new CustomException("enter valid salary");
		}
		else if(employee.getCity().length() <=1 || employee.getCity().equals(null)) {
			log.warn(employee.getCity()+" is null or length is <=  1");
			throw new CustomException("City name Must be more than 1 characters");
		}
		else if(str.startsWith("0") || str.startsWith("1") || str.startsWith("2") || str.startsWith("3") || str.startsWith("4") || str.startsWith("5") || str.length() > 10 || str.length() < 10 || str.equals("0")) {
			log.warn(str+" is null or length is > or <  10");
			throw new CustomException("enter valid Mobile Number(10 digits)");
		}
		else {
			log.info(employee + " created");
			return employeeService.addEmployee(employee );
		
		}
	}
}
