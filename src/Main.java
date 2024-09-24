import dao.impl.StudentDaoImpl;
import database.Database;
import services.StudentService;
import services.impl.StudentServiceImpl;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl(new StudentDaoImpl(new Database()));
        

    }
}