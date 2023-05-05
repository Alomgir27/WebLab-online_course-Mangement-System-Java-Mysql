package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CourseList;


public interface CourseListService {

    List <CourseList> getAllCourseLists();

    CourseList saveCourseList(CourseList courseList);

    

}
