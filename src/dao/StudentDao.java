package dao;

import models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {
    Optional<Student> findById(Long id);

    List<Student> findAll();

     void delete(Student student);

}
