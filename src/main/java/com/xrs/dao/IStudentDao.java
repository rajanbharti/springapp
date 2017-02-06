package com.xrs.dao;

import com.xrs.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rajan on 30/1/17.
 */
@Transactional
public interface IStudentDao extends CrudRepository<Student,String> {


}
