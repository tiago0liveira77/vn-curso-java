<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.curso.service.ProdutosService" %>
<%@ page import="com.curso.model.Produto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<%
	HttpSession mHttpSession = request.getSession();
	String user = (String) mHttpSession.getAttribute("userLogged");
	String productId = (String)request.getAttribute("produto2Modify");
	Produto p = ProdutosService.produtos.get(Integer.parseInt(productId));
	if (user != null){%>
	<div id="main">
 		<div class="registerForm"> 
			<form method="post" action="ModifyProduto">
				<input type="hidden" name="productIndex" value="<%= productId %>" />
				Nombre Produto: <input type="text" name="prodName" value="<%=p.getProductName()%>" disabled> <br>
				Precio: <input type="text" name="prodPrice" value="<%=p.getPrecio()%>"> <br>
				Stock: <input type="number" name="prodStock" value="<%=p.getStock()%>" disabled> <br>
				<input type="submit">
			</form>
		</div>
	</div>
	<%} %>
</body>
</html>