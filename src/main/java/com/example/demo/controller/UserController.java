package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;


import com.example.demo.entity.CourseAssign;
import com.example.demo.service.CourseAssignService;

import com.example.demo.entity.CourseList;
import com.example.demo.service.CourseListService;


@Controller
public class UserController {

    private UserService userService;
    private CourseAssignService courseAssignService;
    private CourseListService courseService;


    public UserController(UserService userService, CourseAssignService courseAssignService, CourseListService courseService) {
        super();
        this.userService = userService;
        this.courseAssignService = courseAssignService;
        this.courseService = courseService;

    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    
   
    @GetMapping("/lists")
    public String home(Model model) {
        model.addAttribute("users", courseAssignService.getAllCourseAssigns());
        System.out.println(courseAssignService.getAllCourseAssigns());
        return "lists";
    }

   @GetMapping("/signup")
    public String signup(Model model) {
         User user = new User();
         model.addAttribute("user", user);
         return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/login?success";
    }

    @GetMapping("/login")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        User existingUser = userService.getUserByEmail(user.getEmail());
        if(existingUser != null) {
            if(existingUser.getPassword().equals(user.getPassword())) {
                System.out.println("Hello world");
                System.out.println(existingUser.getType());
                return "redirect:/users";
            }
            else {
                System.out.println("Hello world");
                return "redirect:/login";
            }
        }
        else {
            System.out.println("Hello world");
            return "redirect:/login";
        }
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        // model.addAttribute("users", userService.getAllUsers());
        System.out.println(userService.getAllUsers());
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/users/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit_user";
    }

    @GetMapping("/course/edit/{id}")
    public String editCourseForm(@PathVariable Long id, Model model) {
        model.addAttribute("course", courseAssignService.getCourseAssignById(id));
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("courses", courseService.getAllCourseLists());
        return "edit_course";
    }

    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, 
            @ModelAttribute("user") User user,
            Model model) {

        // get user from database by id
        User existingUser = userService.getUserById(id);
        existingUser.setId(id);
        existingUser.setUserName(user.getUserName());
        existingUser.setEmail(user.getEmail());
        existingUser.setType(user.getType());
        // save updated user object
        userService.updateUser(existingUser);
        return "redirect:/users";		
    }

    @PostMapping("/course/{id}")
    public String updateCourse(@PathVariable Long id, 
            @ModelAttribute("course") CourseAssign courseAssign,
            Model model) {

        // get user from database by id
        CourseAssign existingCourse = courseAssignService.getCourseAssignById(id);
        existingCourse.setId(id);
        existingCourse.setCourseName(courseAssign.getCourseName());
        existingCourse.setUserName(courseAssign.getUserName());
        existingCourse.setEmail(courseAssign.getEmail());
        existingCourse.setType(courseAssign.getType());
        // save updated user object
        courseAssignService.updateCourseAssign(existingCourse);
        return "redirect:/lists";		
    }

    // handler method to handle delete user request
    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }


    // handler method to handle delete user request
    @GetMapping("/course/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseAssignService.deleteCourseAssignById(id);
        return "redirect:/lists";
    }

    




}