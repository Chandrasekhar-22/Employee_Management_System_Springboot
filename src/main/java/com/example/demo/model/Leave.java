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
	private int id;
	
	@Column(name="empid")
	private int empid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;
	
	@Column(name="count")
	private int count;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="status")
	private String status;

	
	public Leave() 
	{
		super();
	}

	public Leave(int id, int empid, String email, String startDate, String endDate, int count, String reason,
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
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
