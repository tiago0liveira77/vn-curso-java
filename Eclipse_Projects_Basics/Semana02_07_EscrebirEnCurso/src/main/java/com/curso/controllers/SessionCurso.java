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
 * Servlet implementation class SessionCurso
 */
public class SessionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreCurso = request.getParameter("nombreCurso");
		HttpSession mHttpSession = request.getSession(true);
		Persona p = (Persona) mHttpSession.getAttribute("persona");
		List<String> cursos = p.getCursos();
		cursos.add(nombreCurso);
		p.setCursos(cursos);
		
		PrintWriter out = response.getWriter();
		out.println("Persona registrada: " + p.getNome());
		if(!cursos.isEmpty())
			for(String curso: cursos) {
				out.println("<p>" + curso);
			}
		out.println("<p> Puede seguir matricular en: <a href='./curso.html'> Volver al form </a>");
	}

}
