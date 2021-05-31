package com.student.service;

import com.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent (Student student);

    Student getStudentById(int id);

    Student updateStudent (Student student);
    void deleteStudentById(int id);

}
