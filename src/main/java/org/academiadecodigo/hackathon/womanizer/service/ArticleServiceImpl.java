package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.ArticleDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;

    @Autowired
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Article> list() {
        return articleDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Article get(Integer id) {
        return articleDao.findById(id);
    }

    @Transactional
    @Override
    public Article save(Article article) {
        return articleDao.saveOrUpdate(article);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        articleDao.delete(id);
    }
}
