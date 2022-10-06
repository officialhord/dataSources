package com.learning.datasources.logic.Service;

import com.learning.datasources.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    List<Student> findAllStudentsLive();
}
