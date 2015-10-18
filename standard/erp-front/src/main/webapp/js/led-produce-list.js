var scripts = [
    null,
    "../../assets/js/dataTables/jquery.dataTables.js",
    "../../assets/js/dataTables/jquery.dataTables.bootstrap.js",
    "../../assets/js/dataTables/extensions/TableTools/js/dataTables.tableTools.js",
    "../../assets/js/dataTables/extensions/ColVis/js/dataTables.colVis.js",
    "../../assets/js/jquery-ui.custom.js",
    "../../assets/js/jquery.ui.touch-punch.js",
    "../../assets/js/bootbox.js",
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

        var language = {
            "sProcessing": "处理中...",
            "sLengthMenu": "每页显示 _MENU_ 条结果",
            "sZeroRecords": "没有匹配结果",
            "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
            "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
            "sInfoPostFix": "",
            "sSearch": "搜索:",
            "sUrl": "",
            "sEmptyTable": "表中数据为空",
            "sLoadingRecords": "载入中...",
            "sInfoThousands": ",",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "上一页",
                "sNext": "下一页",
                "sLast": "末页"
            },
            "oAria": {
                "sSortAscending": ": 以升序排列此列",
                "sSortDescending": ": 以降序排列此列"
            }
        };

        $('#dynamic-table').dataTable({
            'language': language,
            "dom": '<"top">rt<"bottom"ip><"clear">'
        });
    });
});

