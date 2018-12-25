<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/17
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="commons/basepath.jsp"%>
</head>
<body>
<hr>
<input type="button" value="查所有" id="btn1">
<ul id="articles">

</ul>
<script>
    $(function () {
        $("#btn1").click(function () {
            $.ajax({
                url:"articles",
                type:"get",
                dataType:"json",
                success:function (data) {
                    $("#articles").empty()
                    $.each(data,function () {
                        var $li=$("<li>"+this.title+"</li>")
                        $("#articles").append($li)
                    })
                }
            })
        })
    })
</script>
</body>
</html>
