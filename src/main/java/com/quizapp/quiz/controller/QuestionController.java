package com.quizapp.quiz.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @GetMapping("/")
    public List<String> allQuestions()
    {
        return new List<String>() {
        }
    }
}
