<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP程序设计</title>
</head>

<body>
    <h3>HTML 静态内容</h3>
    a
    b c
    d
    <p>This is some HTML content,today is 2020/5/18:10:23</p>
    <h3>JSP动态内容，使用JSP表达式</h3>
    <p>
        This is some JSP Content, today is <%=new java.util.Date().toLocaleString()%>

    </p>
    这是一段汉字
    <h3>JSP动态内容，使用JSP程序段</h3>
    <%
        out.println("hello world");
        for(int i=0;i<10;i++)
            out.println(i+"<br>");
    %>
    <a href="99.jsp">99乘法表</a>
</body>

</html>