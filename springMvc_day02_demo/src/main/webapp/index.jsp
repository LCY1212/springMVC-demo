<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

<button id="btn">点击提交ajax</button>
<script>
    var params = '{"name":"哈哈","money":1000}';
    $("#btn").click(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/demo1/ajax",
            contentType:"application/json;charset=UTF-8",
            data:params,
            type:"post",
            dataType:"json",
            success:function (data) {
                alert(data);
                alert(data.name);
            }
        })
    })
</script>
</body>
</html>
