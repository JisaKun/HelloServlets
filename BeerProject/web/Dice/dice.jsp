<%--
  Created by IntelliJ IDEA.
  User: 11002322
  Date: 2016/1/21
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="DiceFunctions" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:include page="/common/Header.jsp">
    <jsp:param name="subTitle" value="Let's roll dice !"/>
</jsp:include>
<br>
${mine:rollIt()}
</body>
</html>
