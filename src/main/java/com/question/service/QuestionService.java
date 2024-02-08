package com.question.service;

import com.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuestionService {
    Question create(Question Question);
    List<Question>get();
    Question getOne(long id);
    List<Question> getQuestionsOfQuiz(long quizId);
}
