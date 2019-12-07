package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.QuestionDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.QuizQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<QuizQuestion> list() {
        return questionDao.findAll();
    }
}
