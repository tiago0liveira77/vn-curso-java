<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.curso.services.ServiceCursos" %>
<%@ page import="com.curso.models.Curso" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ServiceCursos sc = new ServiceCursos();
List<Curso> cursos = sc.buscarTodo();
%>
<table border="1">
<tr>
	<th>Curso</th>
	<th>Nivel</th>
</tr>
<%
	for(Curso c: cursos){ %>
		<tr>
			<td> <%=c.getNombre() %> </td>
			<td> <%=c.getNivel() %> </td>
		</tr>
	<%}%>
</table>
</body>
</html>