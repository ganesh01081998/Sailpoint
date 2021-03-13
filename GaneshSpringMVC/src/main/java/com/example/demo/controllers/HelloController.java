package com.example.demo.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/show")
    public String showPage(@RequestParam(name = "user",  required = false) String user, ModelMap model) {
        if (user == null)  // if no parameter is passed
            model.put("user","Guest");
        else
            model.put("user", user);
        
        model.put("now", LocalDateTime.now().toString());
        return "welcome";
    }
}
