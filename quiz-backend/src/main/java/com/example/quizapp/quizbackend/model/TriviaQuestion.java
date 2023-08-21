package com.example.quizapp.quizbackend.model;
import lombok.Data;

import java.util.List;

@Data
public class TriviaQuestion {
    private String question;
    private List<String> incorrect_answers;
    private String correct_answer;
}
