package com.quizapp.quiz.controller;

import com.quizapp.quiz.model.Question;
import com.quizapp.quiz.model.QuestionWrapper;
import com.quizapp.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  java.util.List;
@RequestMapping("quiz")
@RestController
public class QuizController {

    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public String createQuiz(@RequestParam String category, @RequestParam String title,@RequestParam int noOfQuestion)
    {

        return quizService.createQuiz(category,title,noOfQuestion);

    }

    @GetMapping("getQuiz")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@RequestParam Integer quizId) {

        return quizService.getQuiz(quizId);
    }
}
