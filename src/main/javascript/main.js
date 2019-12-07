$(document).on('click', '.answer', function (e) {
    e.preventDefault();
    var color = $(this).data('color');
    var item = $(this).parent().parent().parent();
    $('.answer-comment').css('display', 'none');
    $('.answer-comment[data-color=' + color + ']', item).css('display', 'block');
});