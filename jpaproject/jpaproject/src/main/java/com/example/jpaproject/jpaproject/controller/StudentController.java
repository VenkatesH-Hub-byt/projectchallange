package com.example.jpaproject.jpaproject.controller;

import com.example.jpaproject.jpaproject.entity.Student;
import com.example.jpaproject.jpaproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudents")
    public Student postDetails( @RequestBody Student student){
        return studentService.saveDetails(student);

    }

}
