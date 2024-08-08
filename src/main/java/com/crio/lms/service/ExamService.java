package com.crio.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.lms.entity.Exam;
import com.crio.lms.repository.ExamRepository;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    public Exam getExamById(Long id) {
        return examRepository.findById(id).orElse(null);
    }

    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }

    public Exam updateExam(Long id, Exam examDetails) {
        Exam exam = examRepository.findById(id).orElse(null);
        if (exam != null) {
            exam.setSubject(examDetails.getSubject());
            return examRepository.save(exam);
        }
        return null;
    }

    public void deleteExam(Long id) {
        examRepository.deleteById(id);
    }
}
