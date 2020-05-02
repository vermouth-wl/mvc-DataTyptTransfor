<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-02
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>initBinder数据转换页</title>
</head>
<body>
<h3>数据类型转换请求页</h3>
<form action="../testInitBinder" method="post">
    <div>
        <label for="username">姓名: </label>
        <input type="text" name="username" id="username"/>
    </div>
    <div>
        <label for="birthday">生日:</label>
        <input type="date" name="birthday" id="birthday"/>
    </div>
    <div>
        <input type="submit" value="提交"/>
    </div>
</form>
</body>
</html>
