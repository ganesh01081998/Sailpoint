package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.controllers.HelloController;
import com.example.demo.controllers.PriceDynamic;
import com.example.demo.controllers.RestDeptController;
import com.example.demo.controllers.WishController;

@SpringBootApplication
//@ComponentScan(basePackageClasses=RestDeptController.class)
public class GaneshSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaneshSpringMvcApplication.class, args);
	}

}
