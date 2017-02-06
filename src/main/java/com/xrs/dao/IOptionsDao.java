package com.xrs.dao;

import com.xrs.models.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rajan on 3/2/17.
 */
@Transactional
public interface IOptionsDao extends CrudRepository<Options,String> {

}
