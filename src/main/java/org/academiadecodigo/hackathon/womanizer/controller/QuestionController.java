package org.academiadecodigo.hackathon.womanizer.controller;

import org.academiadecodigo.hackathon.womanizer.persistence.model.QuizQuestion;
import org.academiadecodigo.hackathon.womanizer.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/question")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<QuizQuestion>> listQuestions() {
        return new ResponseEntity<>(questionService.list(), HttpStatus.OK);
    }
}
