package com.example.quizapp.quizbackend.controller;

import com.example.quizapp.quizbackend.dto.TriviaQuestionDTO;
import com.example.quizapp.quizbackend.model.TriviaQuestion;
import com.example.quizapp.quizbackend.service.TriviaQuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizController {
    private final TriviaQuestionService triviaQuestionService;

    @Autowired
    public QuizController(TriviaQuestionService triviaQuestionService) {
        this.triviaQuestionService = triviaQuestionService;
    }

    @GetMapping("/questions")
    public List<TriviaQuestion> getTriviaQuestions() {
        return triviaQuestionService.getTriviaQuestions(5);
    }

//    @GetMapping("/questions")
//    public List<TriviaQuestionDTO> getTriviaQuestions() {
//        List<TriviaQuestionDTO> questionDTOs = new ArrayList<>();
//        List<TriviaQuestion> triviaQuestions = triviaQuestionService.getTriviaQuestions(5);
//        for (TriviaQuestion question : triviaQuestions) {
//            TriviaQuestionDTO dto = new TriviaQuestionDTO();
//            dto.setCategory(question.getCategory());
//            dto.setType(question.getType());
//            dto.setDifficulty(question.getDifficulty());
//            dto.setQuestion(question.getQuestion());
//            questionDTOs.add(dto);
//        }
//        return questionDTOs;
//    }
}
