/* eslint-disable no-console */
import singleArticleView from '../views/single-article-view.js';
import articleService from '../services/article-service.js';

export default {
    async start() {
        const articles = await articleService.getArticle();
        articleView.start(articles);
    },
    hash: 'article/${id}',
    unload() {
        articleView.clear();
    }
};
