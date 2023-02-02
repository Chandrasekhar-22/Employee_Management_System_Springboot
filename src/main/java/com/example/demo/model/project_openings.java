package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_openings")
public class project_openings {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name="empid")
private int empid;

@Column(name="description")
private String description;
@Column(name="date")
private Date date;
public project_openings(int id, int empid, String description, Date date) {
	super();
	this.id = id;
	this.empid = empid;
	this.description = description;
	this.date = date;
}
public project_openings() {
	super();
	// TODO Auto-generated constructor stub
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}
