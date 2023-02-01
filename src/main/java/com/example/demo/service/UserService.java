package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepo;


public void deleteEmployeeById(int id) {
	userRepo.deleteById(id);
	
}

}
