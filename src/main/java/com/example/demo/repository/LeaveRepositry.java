package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Leave;

public interface LeaveRepositry extends JpaRepository<Leave, Long> {
	public List<Leave> findAllByEmpid(Long empid);
	public Leave findAllById(Integer id);
}
