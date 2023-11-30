<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<select name="numero">
<% for(int i=0;i<7;i++){ %>
	<option value"<%=i %>"><%=i %></option>
<%} %>
</select>
</body>
</html>