package com.crio.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.lms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
