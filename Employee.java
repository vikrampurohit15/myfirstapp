package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employee")	
	 public String viewHomePage(Model model) { 
		 model.addAttribute("listEmployees", employeeService.getAllEmployees());
		 return "index";
	} 
		

}
