package com.curso.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (user.equals("admin") && pass.equals("admin")) {
			LocalDate data = LocalDate.now();
			request.setAttribute("data", data);
			RequestDispatcher dispatcher = request.getRequestDispatcher("entrada.jsp");
			dispatcher.forward(request, response);
		} else {
			out.println("<h1>Los datos son incorrectos.</h1> ");
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.include(request, response);
		}
	}

}
