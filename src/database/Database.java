package database;

import enums.Gender;
import models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
   public List<Student> studentList = new ArrayList<>(
           Arrays.asList(
                   new Student("Babakhan", 30, Gender.MALE),
                   new Student("Nuradil", 27, Gender.MALE),
                   new Student("Atai", 19, Gender.MALE),
                   new Student("Asylbek", 24, Gender.MALE),
                   new Student("Adilet", 19, Gender.MALE),
                   new Student("Baisalbek", 18, Gender.MALE),
                   new Student("Akmaral", 18, Gender.FEMALE),
                   new Student("Aiturgan", 22, Gender.FEMALE),
                   new Student("Jarkynai", 25, Gender.FEMALE),
                   new Student("Aijamal", 19, Gender.FEMALE)
           )
   );
}
