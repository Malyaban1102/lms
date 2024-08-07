package com.crio.lms.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private List<Subject> subjects;
    @ManyToMany
    private List<Exam> exams;
    public Student(Long id, String name, List<Subject> subjects, List<Exam> exams) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.exams = exams;
    }
    
}
