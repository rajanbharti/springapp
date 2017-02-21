package com.xrs.dao;

import com.xrs.models.Question;
import com.xrs.models.QuestionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rajan on 3/2/17.
 */
@Transactional
public interface IQuestionDao extends CrudRepository<Question,QuestionId>{
}
