<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/21 0021
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
username=<%=request.getParameter("username")%>
password=<%=request.getParameter("password")%>


<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    //if(username.equals("admin")&&password.equals("123456"))
    if("admin".equals(username)&&"123456".equals(password))
    {
        out.println("welcome "+username);
    }else{
        out.println("登陆失败");
        response.sendRedirect("login.html");
    }
%>
</body>
</html>
