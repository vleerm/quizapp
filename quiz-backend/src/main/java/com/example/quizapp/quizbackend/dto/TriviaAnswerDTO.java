package com.example.quizapp.quizbackend.dto;

import lombok.Data;

@Data
public class TriviaAnswerDTO {
    private String question;
    private String correct_answer;
    private String user_answer;
    private boolean isCorrect;
}
