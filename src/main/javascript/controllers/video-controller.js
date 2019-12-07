/* eslint-disable no-console */
import videoView from '../views/video-view.js';
import videoService from '../services/video-service.js';

export default {
    async start() {
        const videos = await videoService.getVideo();
        videoView.start(videos);
    },
    hash: 'videos',
    unload() {
        videoView.clear();
    }
};
