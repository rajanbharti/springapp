package com.xrs.dao;

import com.xrs.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rajan on 31/1/17.
 */
@Transactional
public interface IAdminDao extends CrudRepository<Admin,String> {
}
