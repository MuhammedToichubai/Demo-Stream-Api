package dao.impl;

import dao.StudentDao;
import database.Database;

public class StudentDaoImpl implements StudentDao {
    private final Database database;

    public StudentDaoImpl(Database database) {
        this.database = database;
    }
}
