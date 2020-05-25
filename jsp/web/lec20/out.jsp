<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/25 0025
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out对象</title>
</head>
<body>
<%
    Map<String, String> data = new HashMap<String, String>();
    data.put("tom", "1111");
    data.put("cat", "22222");
    data.put("jerry", "333333");
%>
第一种输出:
<%
    for (String name : data.keySet()) {
        out.println(String.format("<tr><td>%s</td><td>%s</td></tr>", name, data.get(name)));

    }
%>
第二种常见输出:
<table>
    <%for (String name : data.keySet()) {%>
    <tr>
        <td style="font-size: 36px;"><%=name%>
        </td>
        <td><%=data.get(name)%>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
