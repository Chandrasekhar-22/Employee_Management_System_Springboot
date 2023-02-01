package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Employee;
import com.example.demo.model.User;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.EmployeeService;

@Controller

public class HR_Controller {
 
    @Autowired
    private UserRepository userRepo;
     @Autowired
     private EmployeeRepository empRepo;
   
   
   @GetMapping("/")
   public String viewHomePage() {
       return "Home";
   }
  @GetMapping("/hr/login")
  public String HRLogin() {
	   return "hr/hr_login";
  }
  
  @GetMapping("hr/home")
  public String HRhome()
  {
	   return "hr/hr_home";
  }

  
  @PreAuthorize("hasRole('HR')")
  @GetMapping("/hr/addEmployee")
  public String addEmployee(@RequestParam("id")int id,
		  @RequestParam("username")String username,
		  @RequestParam("password") String password,
		  @RequestParam("role") String role,
		  @RequestParam("firstName")String firstName,
		  @RequestParam("lastName")String lastName,
		  @RequestParam("email") String email,
		  @RequestParam("address") String address,
		  @RequestParam("contact")String contact,
		  Model model)
  {
	  User user=new User();
	  Employee employee=new Employee();
	  user.setId(id);
	  user.setName(username);
	  user.setPassword(password);
	  user.setRole(role);
	  userRepo.save(user);
	  employee.setId(id);
	  employee.setFirstName(firstName);
	  employee.setLastName(lastName);
	  employee.setEmail(email);
	  employee.setContact(address);
	  employee.setAddress(address);
	  employee.setUser(user);
	  empRepo.save(employee);
	  model.addAttribute("id",id);
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		model.addAttribute("role",role);
		model.addAttribute("firstName",firstName);
		model.addAttribute("lastName",lastName);
		model.addAttribute("email", email);
		model.addAttribute("address",address);
		model.addAttribute("contact",contact);
	
	  return "/hr/addemployee";
  }
  
  @GetMapping("/hr/listofusers")
	public String emplist(Model model) {
		List<Employee> emplist = empRepo.findAll();
		model.addAttribute("emplist", emplist);
		return "hr/viewemployeelist";
	}
//  @GetMapping("/deleteEmployee")
// 	public String deleteEmployee(@RequestParam Integer employeeId) {
// 		empRepo.deleteById(employeeId);
// 		return "redirect:hr/home";
// 	}
 
 

//@PreAuthorize("hasRole('HR')")
//@PostMapping("hr/upload")
//   public  ResponseEntity<String> uploadEmployeeDetails(@RequestParam("file") MultipartFile file) {
//       try {
//           employeeService.saveEmployeesFromExcel(file);
//           return new ResponseEntity<>("Employee details uploaded successfully.", HttpStatus.OK);
//       } catch (IOException e) {
//           return new ResponseEntity<>("Error while uploading employee details: " + e.getMessage(), HttpStatus.BAD_REQUEST);
//       }
//   }
 
}
