package com.springbootcrud.example.springbootcrud.controller;

import com.springbootcrud.example.springbootcrud.entity.Student;
import com.springbootcrud.example.springbootcrud.service.StudentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log
public class StudentController {

    @Autowired
    private StudentService studentService;

    //save operation
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return  studentService.saveStudent(student);
    }

    //read operation
    @GetMapping("/students")
    public List<Student> fetchStudentList() {
        return studentService.fetchStudentList();
    }

    //update operation
    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") Long studentId) {

        return studentService.updateStudent(student,studentId);
    }

    //delete operation
    @DeleteMapping("students/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId) {
        studentService.deleteStudentById(studentId);
        log.info("Student record deleted successfully");
        return "Student record deleted successfully";
    }
}
