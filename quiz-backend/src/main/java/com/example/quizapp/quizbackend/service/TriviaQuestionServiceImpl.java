package com.example.quizapp.quizbackend.service;

import com.example.quizapp.quizbackend.model.TriviaQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriviaQuestionServiceImpl implements TriviaQuestionService {
    private final TriviaApiService triviaApiService;

    @Autowired
    public TriviaQuestionServiceImpl(TriviaApiService triviaApiService) {
        this.triviaApiService = triviaApiService;
    }

    @Override
    public List<TriviaQuestion> getTriviaQuestions(int amount) {
        return triviaApiService.fetchTriviaQuestions(amount);
    }
}
