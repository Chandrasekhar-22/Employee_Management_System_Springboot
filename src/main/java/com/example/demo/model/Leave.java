package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leave")
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="empid",nullable = false, unique = true)
	private Long empid;
	
	@Column(name="email",nullable = false, unique = true, length = 40)
	private String email;
	
	@Column(name="start_date",nullable = false)
	private String startDate;
	
	@Column(name="end_date",nullable = false)
	private String endDate;
	
	@Column(name="count")
	private Integer count;
	
	@Column(name="reason",nullable = false)
	private String reason;
	
	@Column(name="status")
	private String status;

	
	public Leave() {
		super();
	}

	public Leave(Long id, Long empid, String email, String startDate, String endDate, Integer count, String reason,
			String status) {
		super();
		this.id = id;
		this.empid = empid;
		this.email = email;
		this.startDate = startDate;
		this.endDate = endDate;
		this.count = count;
		this.reason = reason;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
	
	
	
	
}
