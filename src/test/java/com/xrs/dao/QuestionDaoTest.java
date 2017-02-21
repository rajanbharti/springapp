package com.xrs.dao;

import com.xrs.models.Question;
import com.xrs.models.QuestionId;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Rajan on 2/21/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionDaoTest {

    @Autowired
    IQuestionDao questionDao;

    Question q1=new Question();
    Question q2=new Question();


    @Before
    public void setup(){

        q1.setqId(1);
        q1.setCourseId("CS123");
        q1.setQuestion("hello");
        q1.setAnswer("world");
        q2.setqId(1);
        q2.setCourseId("EC123");
        q2.setQuestion("Yellow");
        q2.setAnswer("Fellow");

    }

    @Test
    public void storeAndFetchTest(){
        questionDao.save(q1);
        questionDao.save(q2);
        QuestionId id1=new QuestionId(1,"CS123");
        QuestionId id2=new QuestionId(1,"EC123");
        Question q3=questionDao.findOne(id1);
        Question q4=questionDao.findOne(id2);
        Assert.assertEquals(true,q1.equals(q3));
        Assert.assertEquals(true,q2.equals(q4));
    }
}
