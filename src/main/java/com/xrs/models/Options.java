package com.xrs.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "options")
public class Options extends Question {

    String courseId;

    String qustionId;


}
