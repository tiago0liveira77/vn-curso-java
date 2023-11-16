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
	mHttpSession.setAttribute("userLogged", null);
	mHttpSession.invalidate();
	 %>
	<div id="main">
 		<div class="registerForm"> 
			<form method="post" action="Login">
				User: <input type="text" name="user"> <br>
				Password: <input type="password" name="pass"> <br>
				<input type="submit">
			</form>
		</div>
	</div>
</body>
</html>