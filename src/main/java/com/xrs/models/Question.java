package com.xrs.models;

import javax.persistence.*;

/**
 * Created by rajan on 24/1/17.
 */
@Entity
@Table(name = "questions")
@IdClass(QuestionId.class)
public class Question {

    @Id
    private int qId;

    @Id
    private String courseId;

    private String question;
    private String answer;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question1 = (Question) o;

        if (qId != question1.qId) return false;
        if (!courseId.equals(question1.courseId)) return false;
        if (!question.equals(question1.question)) return false;
        return answer.equals(question1.answer);
    }

    @Override
    public int hashCode() {
        int result = qId;
        result = 31 * result + courseId.hashCode();
        result = 31 * result + question.hashCode();
        result = 31 * result + answer.hashCode();
        return result;
    }
}
