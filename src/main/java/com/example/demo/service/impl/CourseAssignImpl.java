package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CourseAssign;
import com.example.demo.repository.CourseAssignRepository;
import com.example.demo.service.CourseAssignService;


@Service
public class CourseAssignImpl implements CourseAssignService{

    private CourseAssignRepository courseAssignRepository;
    
    public CourseAssignImpl(CourseAssignRepository courseAssignRepository) {
        super();
        this.courseAssignRepository = courseAssignRepository;
    }

    @Override
    public List<CourseAssign> getAllCourseAssigns() {
        return courseAssignRepository.findAll();
    }

    @Override
    public CourseAssign saveCourseAssign(CourseAssign courseAssign) {
        return courseAssignRepository.save(courseAssign);
    }

   
   

    @Override
    public CourseAssign getCourseAssignById(Long id) {
        return courseAssignRepository.findById(id).get();
    }

    @Override
    public CourseAssign updateCourseAssign(CourseAssign courseAssign) {
        return courseAssignRepository.save(courseAssign);
    }

    @Override
    public void deleteCourseAssignById(Long id) {
        courseAssignRepository.deleteById(id);   
    }
    
   
}