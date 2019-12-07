/* eslint-disable no-console */
import registerView from '../views/register-view.js';
import registerService from '../services/register-service.js';
// import videoService from '../services/video-service.js';

export default {
    async start() {
        registerView.start();
        registerService.submit();
    },
    hash: 'psychologist',
    unload() {
        registerView.clear();
    }
};