
function submit() {

$("#edit-form").submit(function(e) {
    e.preventDefault();

    var form = $(this);
    var url = form.attr('action');
    var verb = 'POST';
    var formData = {};
    var json;

    $.each(form.serializeArray(), function() {
        formData[this.name] = this.value;
    });

    json = JSON.stringify(formData);

    //if (formData.id) verb = 'POST';
console.log(url);
console.log(json);
    $.ajax({
        type: verb,
        url: url,
        contentType: 'application/json',
        //dataType: 'text json',
        data: json,
        success: function(data) {
            window.location.hash = 'home';
            console.log('ok');
        },
        error: function(err) {
            console.log('err');
        }
    });
});

}

export default {
    submit
}