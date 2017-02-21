package com.xrs.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Rajan on 2/21/2017.
 */
@Embeddable
public class QuestionId implements Serializable {

    private int qId;

    private String courseId;

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public QuestionId(){}

    public QuestionId(int qId, String courseId) {
        this.qId = qId;
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionId that = (QuestionId) o;

        if (qId != that.qId) return false;
        return courseId.equals(that.courseId);
    }

    @Override
    public int hashCode() {
        int result = qId;
        result = 31 * result + courseId.hashCode();
        return result;
    }
}
