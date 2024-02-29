package com.springbootcrud.example.springbootcrud.repository;

import com.springbootcrud.example.springbootcrud.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
