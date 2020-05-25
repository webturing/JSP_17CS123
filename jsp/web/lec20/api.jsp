<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/25 0025
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="zj.util.Tools" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>
    1+2+3+.....+100=<%
    int s = 0;
    for (int i = 1; i <= 100; i++) {
        s += i;
    }
    out.println(s);
%>
</h3>

<h3>

    1+2+3+.....+100=<%=Tools.add(1, 100)%>

</h3>

</body>
</html>
