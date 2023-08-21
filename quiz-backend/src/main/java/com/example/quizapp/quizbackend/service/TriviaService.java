package com.example.quizapp.quizbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TriviaService {

    private final String API_URL = "https://opentdb.com/api.php/";

    private final RestTemplate restTemplate;

    public TriviaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getTriviaQuestions(int amount) {
        String url = API_URL + "?amount=" + amount;
        return restTemplate.getForObject(url, String.class);
    }
}
