<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/demo1/save">点击save</a>
<form action="${pageContext.request.contextPath}/demo1/getParams" method="post">
    用户名<input type="text" name="name">
    年  龄<input type="text" name="age">
    金  额<input type="text" name="money"><br/>
    <input type="submit" value="提交">
</form>
<hr/>
<form action="demo1/2" method="post">
    账户id<input type="text" name="id"><br>
    账户名称<input type="text" name="accountName"><br>
    账户密码<input type="text" name="password"><br>
    用户名称<input type="text" name="vipUser.username"><br>
    用户资金<input type="text" name="vipUser.money"><br>
    用户生日<input type="text" name="vipUser.brithday"><br>
    用户房产<input type="text" name="houseList[0].house"><br>
    用户地址<input type="text" name="houseList[0].address"><br>
    用户房产<input type="text" name="houseList[1].house"><br>
    用户地址<input type="text" name="houseList[1].address"><br>
    车辆品牌<input type="text" name="carMap['car1'].car"><br>
    车辆价格<input type="text" name="carMap['car1'].price"><br>
    车辆品牌<input type="text" name="carMap['car2'].car"><br>
    车辆价格<input type="text" name="carMap['car2'].price"><br>
    <input type="submit">
</form>
</body>
</html>
