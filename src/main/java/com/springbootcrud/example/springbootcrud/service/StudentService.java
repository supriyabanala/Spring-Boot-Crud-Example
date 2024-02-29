package com.springbootcrud.example.springbootcrud.service;

import com.springbootcrud.example.springbootcrud.entity.Student;

import java.util.List;

public interface StudentService {
    //save operation
    Student saveStudent(Student student);

    //read operation
    List<Student> fetchStudentList();

    //update operation
    Student updateStudent(Student student, Long studentId);

    //delete operation
    void deleteStudentById(Long studentId);
}
