/* eslint-disable no-console */
import homeView from '../views/home-view.js';
import articleService from '../services/article-service.js';


export default {
    async start() {
        
        const articles = await articleService.getArticle();
        homeView.start(articles);

    },
    hash: 'home',
    unload() {
        homeView.clear();
    }
};
