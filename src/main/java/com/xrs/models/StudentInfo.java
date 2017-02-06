package com.xrs.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by rajan on 31/1/17.
 */
@Entity
@Table(name = "studentinfo")
public class StudentInfo {

    @Id
    private String id;
    private String address;
    private Date doj;


}
