package com.example.ups_class.controller;

import com.example.ups_class.service.TeacherService;
import com.example.ups_class.studententity.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @GetMapping("/getteach")
    public List<Teachers> getteachers(){
        return teacherService.getteachers();
    }


    @PostMapping("/addteach")
    public Teachers addteachers(@RequestBody Teachers t){
        return teacherService.addTeachers(t);
    }

}
