package com.example.ups_class.service;

import com.example.ups_class.repository.TeacherRepository;
import com.example.ups_class.studententity.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public List<Teachers> getteachers(){
        return teacherRepository.findAll();
    }
    public Teachers addTeachers(Teachers t){
        return teacherRepository.save(t);
    }

}
