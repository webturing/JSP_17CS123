<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>九九乘法表</h3>
<table border="1">
    <%
    for(int i=1;i<=9;i++){
        out.print("<tr>");
        for(int j=1;j<=i;j++){
            out.print(String.format("<td>%2d X %2d = %2d</td>",i,j,i*j));

        }
        out.println("</tr>");
    }
%>

</table>