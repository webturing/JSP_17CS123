<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

a=<%=request.getParameter("a")%>
b=<%=request.getParameter("b")%>
c=<%
    int a=0,b=0;
    try {
         a = Integer.parseInt(request.getParameter("a"));
         b = Integer.parseInt(request.getParameter("b"));
    }catch (Exception e){

    }
    out.println(a + b);
%>
<a href="ab.html">返回接着算</a>