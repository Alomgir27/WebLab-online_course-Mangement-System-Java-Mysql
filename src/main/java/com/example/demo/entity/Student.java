package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "course")
	private String course;
	
	public Student() {
		
	}
	
	public Student(String userName, String email, String course) {
		super();
		this.userName = userName;
		this.email = email;
		this.course = course;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public String getCourseName() {
		return course;
	}
	public void setCourseName(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
