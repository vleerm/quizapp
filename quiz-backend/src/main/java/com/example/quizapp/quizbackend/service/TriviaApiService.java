package com.example.quizapp.quizbackend.service;

import com.example.quizapp.quizbackend.dto.TriviaQuestionDTO;
import com.example.quizapp.quizbackend.model.TriviaApiResponse;
import com.example.quizapp.quizbackend.model.TriviaQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TriviaApiService {
    private final RestTemplate restTemplate;
    private final String API_URL = "https://opentdb.com/api.php";

    @Autowired
    public TriviaApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<TriviaQuestion> fetchTriviaQuestions(int amount) {
        String apiUrl = API_URL + "?amount=" + amount;
        TriviaApiResponse response = restTemplate.getForObject(apiUrl, TriviaApiResponse.class);
        return response.getResults(); // Assuming TriviaApiResponse has a getResults() method
    }


//    public List<TriviaQuestionDTO> fetchTriviaQuestions(int amount) {
//        String apiUrl = API_URL + "?amount=" + amount;
//        TriviaApiResponse response = restTemplate.getForObject(apiUrl, TriviaApiResponse.class);
//        List<TriviaQuestionDTO> triviaQuestionDTOs = new ArrayList<>();
//        for (TriviaQuestion question : response.getResults()) {
//            TriviaQuestionDTO dto = new TriviaQuestionDTO();
//            dto.setCategory(question.getCategory());
//            dto.setType(question.getType());
//            dto.setDifficulty(question.getDifficulty());
//            dto.setQuestion(question.getQuestion());
//            triviaQuestionDTOs.add(dto);
//        }
//        return triviaQuestionDTOs;
//    }
}
