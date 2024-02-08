package com.example.jpaproject.jpaproject.repository;

import com.example.jpaproject.jpaproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
