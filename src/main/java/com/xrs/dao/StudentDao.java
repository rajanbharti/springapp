package com.xrs.dao;

import com.xrs.models.Student;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by rajan on 30/1/17.
 */
@Repository
@Transactional
public class StudentDao  {

    @Autowired
    private IStudentDao studentDao;

    public boolean authenticate(Student student) {
        Student fetched = studentDao.findOne(student.getID());
     //   String hashed = BCrypt.hashpw(student.getPassword(),"test");
        return (BCrypt.checkpw(student.getPassword(), fetched.getPassword()));
    }

    public void addStudent(Student student) {
        String hashed = BCrypt.hashpw(student.getPassword(), BCrypt.gensalt());
        student.setPassword(hashed);
        studentDao.save(student);
    }

    public void removeAll(){
        studentDao.deleteAll();
    }




}
