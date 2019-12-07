package org.academiadecodigo.hackathon.womanizer.persistence.dao.jpa;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.QuestionDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.QuizQuestion;
import org.springframework.stereotype.Repository;

@Repository
public class JPAQuestionDao extends GenericJpaDao<QuizQuestion> implements QuestionDao {

    public JPAQuestionDao() {
        super(QuizQuestion.class);
    }
}
