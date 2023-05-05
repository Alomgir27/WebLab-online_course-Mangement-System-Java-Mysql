package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CourseList;


public interface CourseListRepository extends JpaRepository<CourseList, Long>{

}