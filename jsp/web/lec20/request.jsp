<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/25 0025
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request对象的方法</title>
</head>
<body>
<form action="request.jsp" method="post">
    留言<input type="text" name="words">
    <input type="submit"value="提交">

</form>
获取客户端的对象 request对象的常用方法
<p>用户协议<%=request.getProtocol()%></p>
<p>提交数据的方法<%=request.getMethod()%></p>
<p>客户机的IP地址<%=request.getRemoteAddr()%></p>
<p></p>
<p></p>
</body>
</html>
