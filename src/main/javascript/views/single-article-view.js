function start(arrArticle) {
    $("#contacts-body-112").hide();
    $("#main-section").hide();
    renderArticle(arrArticle);

}

function clear() {
    $('#article-body').empty();
    $('#register-body').empty();
    
}

function renderArticle(arr) {
    /* eslint-disable no-param-reassign */

    for (let i = 1; i <= 3; i++) {
        html += `<div class="cell small-4"><h2>${arr[i].title}</h2>`;
        html += `<p>${arr[i].content}</p></div>`;
    }

    $('#article-body').append(html);

}

export default {
    start,
    clear
};
