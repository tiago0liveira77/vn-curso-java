package com.curso.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.curso.models.Persona;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionPersona
 */
public class SessionPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombrePersona = request.getParameter("nombrePersona");
		
		List<String> cursos = new ArrayList();
		Persona p = new Persona(nombrePersona, cursos);
		
		HttpSession mHttpSession = request.getSession(true);
		mHttpSession.setAttribute("persona", p);
		
		PrintWriter out = response.getWriter();
		out.println("Persona registrada: " + p.getNome());
		out.println("<h1> Ir al formulario de regitro en cursos");
		out.println("<a href='./curso.html'>Formulario Curso</a>");
	}

}
