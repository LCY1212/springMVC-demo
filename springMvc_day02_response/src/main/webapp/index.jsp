<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/2/19
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <h1>ModelAndView请求</h1>
    <a href="user/1">发送请求</a>
    <h1>ModelAttribute请求</h1>
    <form action="/user" method="post">
        <input type="text" name="name">
        <input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
