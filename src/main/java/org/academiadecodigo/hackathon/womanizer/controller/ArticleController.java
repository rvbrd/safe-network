package org.academiadecodigo.hackathon.womanizer.controller;

import org.academiadecodigo.hackathon.womanizer.service.ArticleService;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    private ArticleService articleService;

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Article>> listArticles() {
        return new ResponseEntity<>(articleService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<HttpHeaders> addArticle(@RequestBody Article article, UriComponentsBuilder uriComponentsBuilder) {

        Article savedArticle = articleService.save(article);

        UriComponents uriComponents = uriComponentsBuilder.path("/api/article/" + savedArticle.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getArticle(@PathVariable Integer id) {
        Article article = articleService.get(id);

        if(article == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(article, HttpStatus.OK);
    }
}
