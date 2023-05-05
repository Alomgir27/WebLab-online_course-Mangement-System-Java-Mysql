package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.CourseList;
import com.example.demo.service.CourseListService;


@Controller
public class CourseController {

    private CourseListService courseService;

    public CourseController(CourseListService courseService) {
        super();
        this.courseService = courseService;
    }

    

    @PostMapping("/add_course")
    public String saveCourse(@ModelAttribute("course") CourseList courseList) {
        courseService.saveCourseList(courseList);
        return "redirect:/add_course";
    }
    
    



}