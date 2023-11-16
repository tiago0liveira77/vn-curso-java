<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String curso1="chino";
String curso2="esperanto";
String curso3="japones";

List<String> listaCursos = new ArrayList<String>();

listaCursos.add(curso1);
listaCursos.add(curso2);
listaCursos.add(curso3);
%>

<h2>Cursos usando parrafos</h2>
<%
for(String curso : listaCursos) {
    out.println("<p>" + curso + "</p>");
}
%>

<h2>Cursos en tabla una columna</h2>
<table border=1>
<%
for(String curso : listaCursos) {
	
    out.println("<tr><td>" + curso + "</td></tr>");
}
%>
</table>
<h2>Cursos en tabla una fila</h2>
<table border=1>
<tr>
<%
for(String curso : listaCursos) {
	
    out.println("<td>" + curso + "</td>");
}
%>
</tr>
</table>
<h2>Curses en lista</h2>
<ol>
<%
for(String curso : listaCursos) {
	
    out.println("<li>" + curso + "</li>");
}
%>
</ol>
</body>
</html>