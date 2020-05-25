<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/25 0025
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="index.jsp" method="post">
    用户名<input type="text"name="username"><br>
    密码<input type="password"><br>
    <input type="submit"><br>


</form>

登录状态
当前用户<%
    String username="guest";
    if(request.getParameter("username")!=null){
        username=request.getParameter("username");
    }
    out.println(new String(username.getBytes("ISO-8859-1"),"UTF-8"));
%>
<%
  // response.sendRedirect("https://www.baidu.com");
    if(username.contains("xxxx"))
    {
        response.sendError(404,"非法访问");
    }

%>
</body>
</html>
