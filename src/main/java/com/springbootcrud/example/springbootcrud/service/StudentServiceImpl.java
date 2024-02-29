package com.springbootcrud.example.springbootcrud.service;

import com.springbootcrud.example.springbootcrud.entity.Student;
import com.springbootcrud.example.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read operation
    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    // Update operation
    @Override
    public Student updateStudent(Student student, Long studentId) {
        Student studentDB = studentRepository.findById(studentId).get();

        if (Objects.nonNull(student.getStudentName()) &&
                !"".equalsIgnoreCase(student.getStudentName())) {
            studentDB.setStudentName(student.getStudentName());
        }

        if (Objects.nonNull(student.getStudentCourse()) &&
                !"".equalsIgnoreCase(student.getStudentCourse())) {
            studentDB.setStudentCourse(student.getStudentCourse());
        }

        return studentRepository.save(studentDB);
    }

    // Delete operation
    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

}
