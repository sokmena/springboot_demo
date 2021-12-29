package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Ali", "ali@ali.com", 23, LocalDate.of(2000, 12, 3)));
    }
}
