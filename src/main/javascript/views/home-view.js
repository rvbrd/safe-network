function start(arrArticle) {
    clear();
    $("#contacts-body-112").hide();
    $("#main-section").show();
    renderArticle(arrArticle);
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quiz-body').empty();
}

function renderArticle(arr) {
    /* eslint-disable no-param-reassign */
    let html = '';

    for (let i = 0; i <= 2; i++) {
        html += `<div class="cell small-4"><h2>${arr[i].title}</h2>`;
        html += `<p>${arr[i].summary}</p>`;
        html += `</div>`;
    }

    $('#article-body').append(html);
}


export default {
    start,
    clear
};
