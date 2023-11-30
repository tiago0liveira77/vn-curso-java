<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String usuario = request.getParameter("user");
LocalDate fecha = (LocalDate) request.getAttribute("data");
%>
<h1>Bienvenid@  <%=usuario %> el <%=fecha %></h1>
</body>
</html>