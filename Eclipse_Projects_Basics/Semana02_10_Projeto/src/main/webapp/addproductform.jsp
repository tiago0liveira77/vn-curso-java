<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	if (user != null){%>
	<div id="main">
 		<div class="registerForm"> 
			<form method="post" action="AddProduto">
				Nombre Produto: <input type="text" name="prodName"> <br>
				Precio: <input type="text" name="prodPrice"> <br>
				Stock: <input type="number" name="prodStock"> <br>
				<input type="submit">
			</form>
		</div>
	</div>
	<%} %>
</body>
</html>