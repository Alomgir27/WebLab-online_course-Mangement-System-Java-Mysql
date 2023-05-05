package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.entity.CourseList;
import com.example.demo.repository.CourseListRepository;
import com.example.demo.service.CourseListService;



@Service
public class CourseListImpl implements CourseListService{

    private CourseListRepository courseListRepository;
    
    public CourseListImpl(CourseListRepository courseListRepository) {
        super();
        this.courseListRepository = courseListRepository;
    }

    @Override
    public List<CourseList> getAllCourseLists() {
        return courseListRepository.findAll();
    }

    @Override
    public CourseList saveCourseList(CourseList courseList) {
        return courseListRepository.save(courseList);
    }

    
   

}