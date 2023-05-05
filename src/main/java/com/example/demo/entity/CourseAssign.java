package com.example.demo.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "courseassign")
public class CourseAssign {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name="type")
    private String type;
    
    public CourseAssign() {
        
    }

    public CourseAssign(String courseName, String userName, String email, String password, String type) {
        super();
        this.courseName = courseName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

   

    public void setType(String type){
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }

    public String getType(){
        return type;
    }


    
   
}
