package com.example.quizapp.quizbackend.service;

import com.example.quizapp.quizbackend.model.TriviaQuestion;

import java.util.List;

public interface TriviaQuestionService {
    List<TriviaQuestion> getTriviaQuestions(int amount);
}
