package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allocation")
public class Project_Allocation {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectid;
	
	@Column(name="project_name" ,nullable=false)
	private String projectName;
	
	@Column(name="client")
	private String Client;
	
	@Column(name="start_date" ,nullable=false)
	private Date start_date;
	
	@Column(name="end_date", nullable=false)
	private Date end_date;

	
	public Project_Allocation() {
		super();

	}

	public Project_Allocation(Long projectid, String projectName, String client, Date start_date, Date end_date) {
		super();
		this.projectid = projectid;
		this.projectName = projectName;
		Client = client;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public Long getProjectid() {
		return projectid;
	}

	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClient() {
		return Client;
	}

	public void setClient(String client) {
		Client = client;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
}
