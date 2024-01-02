package com.quizapp.quiz.controller;


import com.quizapp.quiz.model.Question;
import com.quizapp.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category) {

        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/addQuestion")
    public  String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
