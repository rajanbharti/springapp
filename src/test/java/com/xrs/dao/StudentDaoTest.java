package com.xrs.dao;

import com.xrs.models.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

/**
 * Created by rajan on 31/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Before
    public void setup() {
        Student s1 = new Student("s01", "s01");
        Student s2 = new Student("s02", "s02");
        Student s3 = new Student("s03", "s03");

        studentDao.addStudent(s1);
        studentDao.addStudent(s2);
        studentDao.addStudent(s3);
    }

    @Test
    public void autheticateTest() {
        Student s1 = new Student("s01", "s01");
        Student s2 = new Student("s02", "s02");
        Student s3 = new Student("s03", "s02");
        Assert.assertEquals(true, studentDao.authenticate(s1));
        Assert.assertEquals(true, studentDao.authenticate(s2));
        Assert.assertEquals(false, studentDao.authenticate(s3));
    }

    @After
    public void clearDB() {
        studentDao.removeAll();
    }

}
