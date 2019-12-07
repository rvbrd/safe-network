/* eslint-disable no-console */
import quizzView from '../views/quiz-view.js';
//import quizzService from '../services/quizz-service.js';

export default {
    async start() {
        //not needed
        //const contacts = await contactsService.getContacts();
        //parameter maybe not needed
        quizzView.start();
    },
    hash: 'quiz',
    unload() {
        quizzView.clear();
    }
};
