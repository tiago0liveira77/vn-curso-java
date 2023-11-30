package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Entrada
 */
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user");
		LocalDate fecha = (LocalDate) request.getAttribute("data");
	
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Entrada</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h2> Bienvenid@ "+ usuario +"</h2>");
		out.println("<h2> Has accedido el " + fecha + "</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
