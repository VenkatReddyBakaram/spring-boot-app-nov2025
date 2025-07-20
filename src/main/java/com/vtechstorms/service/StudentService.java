package com.vtechstorms.service;

import com.vtechstorms.entities.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

}
