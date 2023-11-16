package com.curso.sessiones;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LerSessao
 */
public class LerSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession mHttpSession = request.getSession();
		String curso = (String) mHttpSession.getAttribute("curso");
		PrintWriter out = response.getWriter();
		out.println("Valor obtido da sessao: " + curso);
		out.close();
	}

}
