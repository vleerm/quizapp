package com.example.quizapp.quizbackend.controller;

import com.example.quizapp.quizbackend.dto.TriviaQuestionDTO;
import com.example.quizapp.quizbackend.service.TriviaQuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class QuizController {
    private final TriviaQuestionService triviaQuestionService;

    @Autowired
    public QuizController(TriviaQuestionService triviaQuestionService) {
        this.triviaQuestionService = triviaQuestionService;
    }

    @GetMapping("/questions")
    public List<TriviaQuestionDTO> getTriviaQuestions() {
        return triviaQuestionService.getTriviaQuestions(5);
    }
}
