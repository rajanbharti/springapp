package com.xrs.dao;

import com.xrs.models.Admin;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by rajan on 31/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminDaoTest {

    @Autowired
    AdminDao adminDao;

    @Before
    public void setup(){
        Admin a1=new Admin("a1","a1","AD");
        Admin a2= new Admin("a2","a2","IN");
        Admin a3=new Admin("a3","a3","AI");
        adminDao.addAdmin(a1);
        adminDao.addAdmin(a2);
        adminDao.addAdmin(a3);
    }

    @Test
    public void authenticateTest(){
        Admin a1=new Admin("a1","a1");
        Admin a2= new Admin("a2","a2");
        Admin a3=new Admin("a3","a3");
        Admin a4=new Admin("a3","a4");

        Assert.assertEquals("AD",adminDao.autheticate(a1));
        Assert.assertEquals("AI",adminDao.autheticate(a3));
        Assert.assertEquals("IN",adminDao.autheticate(a2));
        Assert.assertEquals("NA",adminDao.autheticate(a4));
    }


    @After
    public void cleanUp(){
        adminDao.clearAll();
    }
}
