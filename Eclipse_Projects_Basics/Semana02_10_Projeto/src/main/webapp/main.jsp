<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.curso.service.ProdutosService" %>
<%@ page import="com.curso.model.Produto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<% //String user =  (String)request.getAttribute("userLogged");
		//user = "admin";
		HttpSession mHttpSession = request.getSession();
		String user = (String) mHttpSession.getAttribute("userLogged");
		ProdutosService ps = new ProdutosService();
		List<Produto> produtos = ps.getProdutos();
		if (user != null){%>
			<table border="1">
				<tr>
					<th> Produto </th>
					<th> Precio </th>
					<th> Stock </th>
					<th> Modify </th>
					<th> Delete </th>
				</tr>
				<% for (int i=0; i<produtos.size();i++){ %>
					<tr>
						<td> <%=produtos.get(i).getProductName() %> </td>
						<td> <%=produtos.get(i).getPrecio() %>€ </td>
						<td> <%=produtos.get(i).getStock() %> </td>
						<td> <a href="ModifyProduto?id=<%= i %>">Editar</a></td>
						<td> <form action="DeleteProduto" method="post">
			                    <input type="hidden" name="productIndex" value="<%= i %>" />
			                    <input type="submit" value="Delete" />
			                </form>
			            </td>
				<%} %>
			</table>
	<% } %>
</body>
</html>