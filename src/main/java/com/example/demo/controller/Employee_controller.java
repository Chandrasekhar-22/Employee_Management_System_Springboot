package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.model.project_openings;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.project_openingsRepositroy;
import com.example.demo.service.UserService;

@Controller
public class Employee_controller {
@Autowired
UserRepository userRepo;
@Autowired
UserService userService;
@Autowired
project_openingsRepositroy proRepo;

@GetMapping("/employee/login")
public String EmployeeLogin() {
	   return "employee/employee_login";
}

@GetMapping("/employee/home")
public String EmployeeHome() {
	   return "employee/employee_home";
}


@GetMapping("/employee/viewProfile")
public String viewProfile()
{
	return "employee/employeeProfile";
}


@GetMapping("/employee/openingsblog")
public String addopenings(Model model) {
	project_openings proopen= new project_openings();
    model.addAttribute("proopen",proopen);
    return "employee/addopenings";
}


@PostMapping("/employee/saveOpenings")
public String saveOpenings(@ModelAttribute("proopen") project_openings proopen){
	     proRepo.save(proopen);
	     return "redirect:/employee/listofopenings";
}
		 

@GetMapping("/employee/listofopenings")
	public String openingsList(Model model) {
		List<project_openings> projlist = proRepo.findAll();
		model.addAttribute("projlist", projlist);
		return "employee/viewOpeningslist";
	}
}
