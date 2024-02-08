package com.example.jpaproject.jpaproject.service;

import com.example.jpaproject.jpaproject.entity.Student;
import com.example.jpaproject.jpaproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
