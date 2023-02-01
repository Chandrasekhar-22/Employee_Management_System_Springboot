package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	private int id;
	@Column(nullable=false,unique=true)
	private String username;
	@Column(nullable=false,unique=true)
	private String password;
	private String role;
	
    public User() {}
    
    public User(int id,String username, String password, String role) {
    	this.id=id;
        this.username = username;
        this.password = password;
        this.role = role;
    }


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}




}
