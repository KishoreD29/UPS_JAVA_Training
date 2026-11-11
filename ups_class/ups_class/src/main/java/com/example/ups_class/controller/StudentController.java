package com.example.ups_class.controller;

import com.example.ups_class.service.StudentService;
import com.example.ups_class.studententity.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String fun(){
        return "Welcome Kishore";


    }
    @PostMapping("/name")
    public void user(@RequestBody String name){
        System.out.println(name);

    }
    @PostMapping("/student")
    public students addstudents(@RequestBody students s){
        return studentService.addstudent(s);

    }
    @GetMapping("/stud")
    public List<students> getstudent(){
        return studentService.getstudent();

    }




}
