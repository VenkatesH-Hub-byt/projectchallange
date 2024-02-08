package com.example.jpaproject.jpaproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Vvv_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue
    private  int id;
    @Column(name="student_age")
    private  int age;

    @Column(name="Student_name")
    private String name;
    @Column(name="student_clg")
    private String clg;
    @Column(name="student_branch")
    private String branch;
    @Column(name = "student-ph")
    private Long ph;
     @Column(name = "student_address")
    private String address;
     @Column(name = "student_cgpa")
     private Float cgpa;

}
