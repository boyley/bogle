var scripts = [null,
    "/assets/js/jquery-ui.custom.js",
    "/assets/js/jquery.ui.touch-punch.js",
    "/assets/js/chosen.jquery.js",
    '/assets/js/bootbox.js',
    {url: "/assets/js/validity.state.js", cache: false},
    {url: "/assets/js/jquery.iframe-post-form.js", cache: false},
    null]
$('.page-content-area').ace_ajax('loadScripts', scripts, function () {

    $('form[role="form"]').iframePostForm({
        json: true,
        post: function () {
            $('.page-content-area').ace_ajax('startLoading');
        },
        complete: function (response) {
            $('.page-content-area').ace_ajax('stopLoading', true);
            if (response.success) {
                bootbox.dialog({
                    closeButton: false,
                    message: "<h5 class='bigger-110'>添加成功</h5>",
                    buttons: {
                        "proceed": {
                            "label": "<i class='ace-icon fa fa-check'></i> 继续添加",
                            "className": "btn-sm btn-success",
                            "callback": function () {
                                var url = '#led/publish';
                                $('.page-content-area[data-ajax-content=true]').ace_ajax('loadUrl', url);
                                window.location.href = url;
                            }
                        },
                        "back": {
                            "label": "<i class='ace-icon fa fa-reply'></i> 返回列表页面",
                            "className": "btn-sm btn-primary",
                            "callback": function () {
                                //Example.show("Primary button");
                                var url = '#page/admin/led/led-produce-list.html';
                                $('.page-content-area[data-ajax-content=true]').ace_ajax('loadUrl', url);
                                window.location.href = url;
                            }
                        }
                    }
                });
            }
        }
    })
});
