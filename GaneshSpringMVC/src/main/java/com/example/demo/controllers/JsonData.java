package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class JsonData {
	@GetMapping("/list")
	public List<Customer> disp() {
		List<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer(1,"Ganesh Adapa"));
		custList.add(new Customer(2,"stephen Anand"));
		custList.add(new Customer(3,"Mahesh"));
		custList.add(new Customer(4,"kishore"));
		custList.add(new Customer(5,"Veera Raghavulu"));
		return custList;
		
	}
}
