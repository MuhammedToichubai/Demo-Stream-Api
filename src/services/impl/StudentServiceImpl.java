package services.impl;

import dao.StudentDao;
import exceptions.NotFoundException;
import models.Student;
import services.StudentService;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> foundStudent = studentDao.findById(id);
        if (foundStudent.isPresent()){
            return foundStudent.get();
        }
        throw new NotFoundException();
    }

    @Override
    public List<Student> sortByAge(String argument) {
        if (argument.equalsIgnoreCase("asc") || argument.equalsIgnoreCase("desc")) {
           return studentDao.findAll().stream().sorted(
                    argument.equalsIgnoreCase("asc") ? Comparator.comparing(Student::getAge)
                            : Comparator.comparing(Student::getAge).reversed()).toList();
        }
        return studentDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
       studentDao.findAll().stream().filter(s -> s.getId().equals(id))
               .findFirst()
               .ifPresentOrElse(studentDao::delete,
                       () -> System.out.printf("Student with id : %d not found%n", id));
    }
}
