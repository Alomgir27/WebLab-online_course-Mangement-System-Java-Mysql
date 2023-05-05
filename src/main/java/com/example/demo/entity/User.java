package com.example.demo.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_name", nullable = false)
    private String userName;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;

    @Column(name = "type")
    private String type;

    
    public User() {
        
    }
    
    public User(String userName, String password, String email, String type) {
        super();
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.type = type;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public String getType() {
        return type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setPassword(String password) {
        this.password = password;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ", type=" + type + "]";
    }






   
}
