function start(arrArticle) {
    clear();
    $("#contacts-body-112").hide();
    $("#main-section").hide();
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

    let html = arr.reduce((acc, article) => {
        acc += `<div class="cell small-4"><h2>${article.title}</h2>`;
        acc += `<p>${article.summary}</p>`;
        acc += `</div>`;
        return acc;
    }, '');

    $('#article-body').append(html);

}

export default {
    start,
    clear
};
