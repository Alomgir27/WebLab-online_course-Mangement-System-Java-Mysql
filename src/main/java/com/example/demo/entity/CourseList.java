package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courselist")
public class CourseList {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "course_name")
    private String courseName;
    
    
    public CourseList() {
        
    }

    public CourseList(String courseName) {
        super();
        this.courseName = courseName;
    }

    public void setCourseID(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCourseId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }


    

    
}
