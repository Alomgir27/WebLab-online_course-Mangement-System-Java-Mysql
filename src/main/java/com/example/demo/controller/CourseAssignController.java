package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.entity.CourseAssign;
import com.example.demo.service.CourseAssignService;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

import com.example.demo.entity.CourseList;
import com.example.demo.service.CourseListService;

@Controller
public class CourseAssignController {

    private CourseAssignService courseAssignService;
    private UserService userService;
    private CourseListService courseService;

    public CourseAssignController(CourseAssignService courseAssignService, UserService userService, CourseListService courseService) {
        super();
        this.courseAssignService = courseAssignService;
        this.userService = userService;
        this.courseService = courseService;
    }

    @GetMapping("/course_assign")
    public String listCourseAssigns(Model model) {
       CourseAssign courseAssign = new CourseAssign();
        model.addAttribute("course", courseAssign);
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("courses", courseService.getAllCourseLists());
        return "course_assign";
    }

    @PostMapping("/course_assign")
    public String saveCourseAssign(@ModelAttribute("course_assign") CourseAssign courseAssign) {
        // User user1 = (User) session.getAttribute("user");
        // // System.out.println(user1);
        // User user2 = userService.getUserByEmail(user1.getEmail());
        // CourseAssign courseAssign1 = courseAssign;
        // System.out.println(courseAssign1);
        // // System.out.println(user);
        // System.out.println(user1);
        // System.out.println(courseAssign);
        // System.out.println("Hello world");

        // if(user2.getType() == "admin"){
        //     // courseAssignService.saveCourseAssign(courseAssign);
        //     return "redirect:/course_assign?success";
        // }
        // else{
        //     return "redirect:/course_assign?error";
        // }
        courseAssignService.saveCourseAssign(courseAssign);
        return "redirect:/lists?success";
    }
    
    

}
