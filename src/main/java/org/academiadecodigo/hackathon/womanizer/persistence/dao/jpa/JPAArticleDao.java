package org.academiadecodigo.hackathon.womanizer.persistence.dao.jpa;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.ArticleDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Article;
import org.springframework.stereotype.Repository;

@Repository
public class JPAArticleDao extends GenericJpaDao<Article> implements ArticleDao {

    public JPAArticleDao() {
        super(Article.class);
    }

}
