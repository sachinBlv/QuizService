package com.question.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="Question_Table")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionId;
    private String question;
    private long quizId;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", quizId=" + quizId +
                '}';
    }

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }

    public long getQuizId() {
        return quizId;
    }


    public Question() {
    }

    public Question(long questionId, String question, long quizId) {
        this.questionId = questionId;
        this.question = question;
        this.quizId = quizId;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
