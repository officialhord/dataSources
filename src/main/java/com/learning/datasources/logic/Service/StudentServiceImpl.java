package com.learning.datasources.logic.Service;

import com.learning.datasources.config.db.DataSourceType;
import com.learning.datasources.config.routing.WithDatabase;
import com.learning.datasources.data.StudentRepo;
import com.learning.datasources.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    @WithDatabase
    public List<Student> findAllStudents() {
        return this.findAll();
    }

    @Override
    @WithDatabase(DataSourceType.LIVE)
    public List<Student> findAllStudentsLive() {
        return this.findAll();
    }

    private List<Student> findAll() {
        return this.studentRepo.findAll();
    }
}
