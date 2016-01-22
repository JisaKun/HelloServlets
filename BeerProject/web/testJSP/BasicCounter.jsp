<%@ page import="com.hongchuan1992.testJSP.*" %>
<%--
  Created by IntelliJ IDEA.
  User: 11002322
  Date: 2016/1/15
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter</title>
</head>
<body>
The Page Count is
<%
  out.println(Counter.getCounter());
%>
<br>
<%= Counter.getCounter() %>
</body>
</html>
