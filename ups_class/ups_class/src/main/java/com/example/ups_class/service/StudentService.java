package com.example.ups_class.service;

import com.example.ups_class.repository.StudentRepository;
import com.example.ups_class.studententity.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public students addstudent(students s){
        return repo.save(s);

    }
    public List<students> getstudent(){
        return repo.findAll();

    }

}
