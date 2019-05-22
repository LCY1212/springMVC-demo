<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/2/19
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>文件上传</h1>
<form action="user/uploadFile" method="post" enctype="multipart/form-data">
    上传： <input type="file" name="myFile">
    <input type="submit" value="提交">
</form>
</body>
</html>
