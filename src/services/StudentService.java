package services;

import models.Student;

import java.util.List;

public interface StudentService {
    Student findById(Long id);

    List<Student> sortByAge(String argument);

    void deleteById(Long id);
}
