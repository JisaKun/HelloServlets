<%--
  Created by IntelliJ IDEA.
  User: 11002322
  Date: 2016/1/8
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 align="center">Beer Top JSP</h1>
<p></p>
<%
  List style = (List)request.getAttribute("styles");
  for (Object aStyle : style) {
    out.print("<br> try: " + aStyle);
  }
  out.println("<br>"+application.getInitParameter("adminMail"));  // 获取ServletContext
%>
</body>
</html>
