package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CourseAssign;


public interface CourseAssignService {

    List<CourseAssign> getAllCourseAssigns();

    CourseAssign saveCourseAssign(CourseAssign courseAssign);


    CourseAssign getCourseAssignById(Long id);

    CourseAssign updateCourseAssign(CourseAssign courseAssign);

    void deleteCourseAssignById(Long id);



}

