package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.EmployeeService;

@Controller
public class Employee_controller {
@Autowired
private EmployeeRepository emprepo;
@Autowired
private UserRepository userRepo;
@Autowired
private EmployeeService employeeService;

@GetMapping("/employee/login")
public String EmployeeLogin() {
	   return "employee/employee_login";
}

@GetMapping("/employee/home")
public String EmployeeHome(Model model) {
	model.addAttribute("id",1);
	   return "employee/employee_home";
}

//@PreAuthorize("hasRole('EMPLOYEE')")
//@GetMapping("/employee/{id}")
//public String viewEmployeeProfile(@PathVariable("id") int id, Model model) {
//  Employee employee = employeeService.getEmployeeById(id);
//  model.addAttribute("employee", employee);
//  return "employee/employeeProfile";
//}
}
