<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String user = request.getParameter("user");
String pass = request.getParameter("pass");
%>

<h1> User: <%=user %> PASS: <%=pass %> es incorrecto</h1>
</body>
</html>