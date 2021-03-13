package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Department;

public interface DeptRepo extends JpaRepository<Department, Integer>{

	
}
