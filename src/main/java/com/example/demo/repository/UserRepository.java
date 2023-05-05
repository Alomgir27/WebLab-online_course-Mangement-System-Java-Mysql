package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);

    List<User> findByType(String type);

}