package com.quizapp.quiz.controller;


import com.quizapp.quiz.model.Question;
import com.quizapp.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }
}
