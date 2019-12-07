function start(arrVideo) {
    clear();
    $("#contacts-body-112").hide();
    $("#main-section").hide();
    renderVideo(arrVideo);
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quiz-body').empty();
}


function renderVideo(arr) {
    /* eslint-disable no-param-reassign */
    let html = arr.reduce((acc, video) => {
        acc += `<div class="cell medium-6"><iframe style="width:100%; height: 300px;" src="https://www.youtube.com/embed/${video.url}" 
        frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></div>`;
        return acc;
    }, '');

    $('#video-body').append(html);
}

export default {
    start,
    clear
};
