package com.example.demo.service;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
EmployeeRepository empRepo;

public void save(Employee employee) {
	empRepo.save(employee);
	
}



  

//    public Employee getEmployeeById(int id) {
//        return employeeRepository.findById(id).orElse(null);
//      }

//    private List<Employee_details> readEmployeesFromExcel(MultipartFile file) throws IOException {
//        // Create a new list to store the employee objects
//        List<Employee_details> employees = new ArrayList();
//         
//
//
//        return employees;
    }

