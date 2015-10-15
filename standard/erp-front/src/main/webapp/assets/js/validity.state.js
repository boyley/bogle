$(function ($) {

    $('form.form-horizontal input').on('invalid', function () {
        oninvalid(this);
    });

    $('form.form-horizontal input').on('keyup', function () {
        var validityState = this.validity;
        oninvalid(this, validityState.valid);
    });

    function oninvalid(obj, valid) {
        var divGroup = $(obj).closest('.form-group');
        if (valid) {
            divGroup.removeClass('has-error');
            $(obj).next().removeClass('fa-times-circle');
            if (!divGroup.hasClass('has-success')) {
                divGroup.addClass('has-success');
                $(obj).next().addClass('fa-check-circle');
                $(obj).next().removeClass('hide');
            }
        } else {
            divGroup.removeClass('has-success');
            $(obj).next().removeClass('fa-check-circle');
            if (!divGroup.hasClass('has-error')) {
                divGroup.addClass('has-error');
                $(obj).next().addClass('fa-times-circle');
                $(obj).next().removeClass('hide');
            }
        }
    }
});

