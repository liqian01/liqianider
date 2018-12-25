<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <%@include file="commons/basepath.jsp"%>
</head>
<body>
<form method="post" action="user/login">
    <p>用户名<input name="userName"></p>
    <p>密码<input type="password" name="password"></p>
    <p><input type="submit"value="登录"></p>
    <p style="color:red">${msg}</p>
</form>

</body>
</html>
