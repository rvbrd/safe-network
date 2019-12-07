/* eslint-disable no-console */
import controllers from './controllers/main.js';

const defaultRoute = 'home';
let firstFlag = false;

function unloadController(url) {
    const controllerHash = url.split('#')[1];

    const controller = controllers[
        Object.keys(controllers).find(key => controllers[key].hash === controllerHash)
    ];

    if (controller) {
        controller.unload();
    }
}

function start() {



    window.onhashchange = window.onhashchange || function(event) {
        if (event.newURL !== event.oldURL) {
            unloadController(event.oldURL);
        }

        const controllerName = Object.keys(controllers).find(
            key => `#${controllers[key].hash}` === window.location.hash
        );

        if (!controllerName) {
            window.location.hash = defaultRoute;
            return;
        }

        controllers[controllerName].start();  
    };

    if (!window.location.hash) {
        window.location.hash = `#${defaultRoute}`;
    }

}

export default {
    start
};
