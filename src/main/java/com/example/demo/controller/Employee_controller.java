package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Controller
public class Employee_controller {
@Autowired
UserRepository userRepo;
@GetMapping("/employee/login")
public String EmployeeLogin() {
	   return "employee/employee_login";
}

@GetMapping("/employee/home")
public String EmployeeHome() {
	   return "employee/employee_home";
}

@GetMapping("/employee/viewProfile/{id}")
public String viewProfile(Model model)
{
	List<User> emplist = userRepo.findAll();
	model.addAttribute("emplist", emplist);
	return "employee/employeeProfile";
}
}
