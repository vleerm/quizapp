package com.example.quizapp.quizbackend.model;

import lombok.Data;

import java.util.List;

@Data
public class TriviaApiResponse {
    private List<TriviaQuestion> results;
}

