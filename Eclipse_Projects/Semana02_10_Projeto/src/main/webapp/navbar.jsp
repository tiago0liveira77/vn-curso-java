<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<div id="navBar" class="navBar">     
		
		<%
		/**
		 * Verifica si hay session activa y saca el username
		 * Si no hay session solo mostra el button e login
		 */
		HttpSession mHttpSession = request.getSession();
		String user = (String) mHttpSession.getAttribute("userLogged");
		//user = "admin";
		if(user != null){ %>
		<a href="main.jsp">Ver Produtos</a>
		<div class="rightContent">
            <!-- Conteúdo que vai à direita -->
            <a href="#"> <%= user%></a>
            <a href="./Logout">Logout</a>
        </div>
		<%} else { %>
		<div class="rightContent">
            <!-- Conteúdo que vai à direita -->
            <a href="./index.jsp">Login</a>
        </div>
		<%} %>

	
	 	
		
		
		
        
    </div>