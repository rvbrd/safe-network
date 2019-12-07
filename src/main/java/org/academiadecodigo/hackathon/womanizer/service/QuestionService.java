package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.model.QuizQuestion;

import java.util.List;

public interface QuestionService {

    List<QuizQuestion> list();
}
