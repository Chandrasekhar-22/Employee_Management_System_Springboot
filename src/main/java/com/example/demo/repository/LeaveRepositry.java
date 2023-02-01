package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Leave;

public interface LeaveRepositry extends JpaRepository<Leave, Integer> {
	public List<Leave> findAllByEmpid(Integer empid);
	public Leave findAllById(Integer id);
}
