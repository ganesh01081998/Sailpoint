package com.example.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Department;

public interface DeptJPA extends CrudRepository<Department, Integer>{

		
	}


