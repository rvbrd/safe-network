function start(arrContacts) {
    clear();
    $("#main-section").hide();
    $("#contacts-body-112").show();
    $('.footer').css({ "position": "relative" });
    renderContacts(arrContacts);
    console.log(arrContacts);
    
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
    $('#contact-body').empty();
    $('#quiz-body').empty();
    $('.footer').css({ "position": "relative" });
}

function renderContacts(arr) {
    
    /* eslint-disable no-param-reassign */

    let html = arr.reduce((acc, contact) => {
        
        acc += `<div class="counselor-item">
        <div class="counselor-photo">
            <img src="https://via.placeholder.com/100x100">
        </div>
        <div class="counselor-info">
<h2>${contact.name}</h2>`;
        acc += `<strong>Email: </strong><a href="mailto:${contact.email}">${contact.email}</a><br>`;
        acc += `<strong>Phone: </strong><p>${contact.phone}</p>`;
        acc += `<strong>Location: </strong><p>${contact.location}</p></div></div>`;
        return acc;
    }, '');


    /*
    let contactRight = ` 
        <h1>In Case Of an Emergency</h1>
        <h2>call your cousin 112</h2> 
         `;

    $('#contacts-body-112').append(contactRight);
    */

    $('#contact-body').append(html);

    

}

export default {
    start,
    clear
};
