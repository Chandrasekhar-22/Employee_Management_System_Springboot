package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepo;


public void deleteEmployeeById(int id) {
	userRepo.deleteById(id);
	
}

//public User getEmployeeById(int id) {
//    Optional<User> optional = userRepo.findByUsername(Username).SecurityContextHolder.getContext().getAuthentication().getName());
//    User user = null;
//    if(optional.isPresent()){
//        user = optional.get();
//    }else{
//        throw new RuntimeException("Employee Not Found for ID ::" + id);
//    }
//    return user;
//}


}
