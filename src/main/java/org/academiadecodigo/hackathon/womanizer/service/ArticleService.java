package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> list();
    Article get(Integer id);
    Article save(Article article);
    void delete(Integer id);

}
