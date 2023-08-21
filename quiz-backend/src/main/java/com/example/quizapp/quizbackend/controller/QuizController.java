package com.example.quizapp.quizbackend.controller;

import com.example.quizapp.quizbackend.model.Answer;
import com.example.quizapp.quizbackend.model.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuizController {

    @GetMapping("/questions")
    public Question getQuestions() {
        String[] sampleOptions = {"Option 1", "Option 2", "Option 3", "Option 4"};
        return new Question("Sample question?", sampleOptions);
    }

    @PostMapping("/answers")
    public Answer checkAnswers(@RequestBody Answer answer) {
        boolean[] sampleCorrect = {true, false, true, false}; // Replace with actual correct answers
        return new Answer(sampleCorrect);
    }
}
