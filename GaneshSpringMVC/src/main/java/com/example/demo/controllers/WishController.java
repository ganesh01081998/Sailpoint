package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
@RestController
public class WishController {
	//@ResponseBody
//	@RequestMapping("/")
	@GetMapping("/")
	public String disp() {
		return "Welcome to Ojas Ganesh Adapa";
	}
}
