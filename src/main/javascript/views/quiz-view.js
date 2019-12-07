function start() {
    $("#contacts-body-112").hide();
    $("#main-section").hide();
    renderArticle();
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contacts-body').empty();
    $('#quizz-body').empty();
}

function renderArticle() {
    /* eslint-disable no-param-reassign */

    let h1 = `ARE YOU A VICTIM<br> OF DOMESTIC VIOLENCE`;


    let html = `
    
        <section class="page-header">
            <h1>Domestic Violence Screening</h1>
            <p>Use this brief screening measure to help you determine if you might need to see a mental health or other social services professional to help you successfully deal with a domestic violence or abusive relationship situation.</p>        
        </section>
            <section class="make-difference-page grid-container">
                <div class="grid-x grid-margin-x">
                    <div class="cell small-12">
                        <div class="questions-slider">
                            <div class="question-item">
                                <div class="question">Do you avoid doing something in order to not make the other person angry or upset?
                                </div> 
                                <div class="answers flex-container">
                                    <div class="flex-child-grow">
                                        <a href="#quiz" data-color="red" class="answer">CONSTANTLY</a>
                                    </div>
                                    <div class="flex-child-grow">
                                        <a href="#quiz" data-color="red" class="answer">SOMETIMES</a>
                                    </div>
                                    <div class="flex-child-grow">
                                        <a href="#quiz" data-color="green" class="answer">RARELY</a>
                                    </div>
                                    <div class="flex-child-grow">
                                        <a href="#quiz" data-color="green" class="answer">NEVER</a>
                                    </div>
                                </div>
                                <div class="comment">
                                    <div data-color="green" class="answer-comment">
                                        <p>It doesn't seem like you might be in a bad environment.</p>
                                    </div>
                                    <div data-color="red" class="answer-comment">
                                        <p>You are probably in a bad environment... search through our website for advices.</p>
                                    </div>
                                </div>
                            </div>
                                <div class="question-item">
                                    <div class="question">Does the other person insist that he must read your messages?
                                    </div>
                                    <div class="answers flex-container">
                                        <div class="flex-child-grow">
                                            <a href="#quiz" data-color="red" class="answer">CONSTANTLY</a>
                                        </div>
                                        <div class="flex-child-grow">
                                            <a href="#quiz" data-color="red" class="answer">SOMETIMES</a>
                                        </div>
                                        <div class="flex-child-grow">
                                            <a href="#quiz" data-color="green" class="answer">RARELY</a>
                                        </div>
                                        <div class="flex-child-grow">
                                            <a href="#quiz" data-color="green" class="answer">NEVER</a>
                                        </div>
                                    </div>
                                    <div class="comment">
                                        <div data-color="green" class="answer-comment">
                                            <p>It doesn't seem like you are in a bad environment.</p>
                                        </div>
                                        <div data-color="red" class="answer-comment">
                                            <p>You are probably in a bad environment. This is not a healthy behaviour. If you feel you need help, feel free to contact one of our counselors <a href="#contacts">here</a>.</p>
                                        </div>
                                    </div>
                                </div>
                        </div>
                    </div>
                </div>
            </section>
    `


    $('#quiz-body').append(html);
    $('banner-title').text(h1);

    
}

export default {
    start,
    clear
};
