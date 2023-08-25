package com.example.quizapp.quizbackend.dto;

import lombok.Data;


@Data
public class TriviaQuestionDTO {
    private String category;
    private String type;
    private String difficulty;
    private String question;
}
