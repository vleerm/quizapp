package com.example.quizapp.quizbackend.service;

import com.example.quizapp.quizbackend.dto.TriviaQuestionDTO;
import com.example.quizapp.quizbackend.model.TriviaQuestion;

import java.util.List;

public interface TriviaQuestionService {
    List<TriviaQuestionDTO> getTriviaQuestions(int amount);
}

