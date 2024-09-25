import dao.impl.StudentDaoImpl;
import database.Database;
import models.Student;
import services.StudentService;
import services.impl.StudentServiceImpl;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl(new StudentDaoImpl(new Database()));

       Student student =  studentService.findById(2L);

       String argument = "Desc";


       studentService.deleteById(54L);
        studentService.sortByAge(argument).forEach(System.out::println);


    }
}