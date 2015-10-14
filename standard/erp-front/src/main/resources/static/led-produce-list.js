var scripts = [
    null,
    "../../assets/js/dataTables/jquery.dataTables.js",
    "../../assets/js/dataTables/jquery.dataTables.bootstrap.js",
    "../../assets/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js",
    "../../assets/js/dataTables/extensions/ColVis/js/dataTables.colVis.js",
    "../../assets/js/jquery-ui.custom.js",
    "../../assets/js/jquery.ui.touch-punch.js",
    "../../assets/js/bootbox.js",
    "../../assets/js/jquery.easypiechart.js",
    "../../assets/js/jquery.gritter.js",
    "../../assets/js/spin.js",
    null]
$('.page-content-area').ace_ajax('loadScripts', scripts, function () {
    //inline scripts related to this page
    $(function ($) {

        $('[data-rel=tooltip]').tooltip();

        $(".bootbox-confirm-edit").on(ace.click_event, function () {
            bootbox.confirm("<h1>确定修改吗?</h1>", function (result) {
                if (result) {
                    //
                }
            });
        });

        $(".bootbox-confirm-delete").on(ace.click_event, function () {
            bootbox.confirm("<h1>确定删除吗?</h1>", function (result) {
                if (result) {
                    //
                }
            });
        });

        $('#dynamic-table').dataTable({
            'language': language,
            "dom": '<"top">rt<"bottom"ip><"clear">'
        });
    });
});

