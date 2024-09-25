package dao.impl;

import dao.StudentDao;
import database.Database;
import models.Student;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {
    private final Database database;

    public StudentDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public Optional<Student> findById(Long id) {
      return  database.studentList.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    @Override
    public List<Student> findAll() {
        return database.studentList;
    }

    @Override
    public void delete(Student student) {
        database.studentList.remove(student);
    }
}
