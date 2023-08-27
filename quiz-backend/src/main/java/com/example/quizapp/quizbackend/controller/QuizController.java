package com.example.quizapp.quizbackend.controller;

import com.example.quizapp.quizbackend.dto.TriviaAnswerDTO;
import com.example.quizapp.quizbackend.dto.TriviaQuestionDTO;
import com.example.quizapp.quizbackend.service.TriviaApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class QuizController {
    private final TriviaApiService triviaApiService;

    @Autowired
    public QuizController(TriviaApiService triviaApiService) {
        this.triviaApiService = triviaApiService;
    }

    @GetMapping("/questions")
    public List<TriviaQuestionDTO> getTriviaQuestions() {
        return triviaApiService.fetchTriviaQuestions(5);
    }

    @PostMapping("/checkanswers")
    public ResponseEntity<List<TriviaAnswerDTO>> checkAnswers(@RequestBody List<TriviaQuestionDTO> questions) {
        // Assuming you want to check answers for a list of TriviaQuestionDTO objects
        // Here, 'questions' is the list of questions from the frontend

        // Call the checkAnswers() method to map the questions to answers
        List<TriviaAnswerDTO> answers = triviaApiService.checkAnswers(questions.size());

        // Assuming you have some logic to compare user answers with correct answers
        // You can set the 'user_answer' property in TriviaAnswerDTO objects here

        return ResponseEntity.ok(answers);
    }
}
