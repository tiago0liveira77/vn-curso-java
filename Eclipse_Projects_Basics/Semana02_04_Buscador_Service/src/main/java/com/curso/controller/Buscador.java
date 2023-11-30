package com.curso.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.curso.model.Pagina;
import com.curso.service.BuscadorService;

/**
 * Servlet implementation class Buscador2
 */
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BuscadorService service;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tematica = request.getParameter("tematica");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Buscador</title>");
		out.println("</head>");
		out.println("<body>");
		
		service = new BuscadorService();
		List<Pagina> paginas = service.buscador(tematica);
		
		if(!paginas.isEmpty()) {
			for(Pagina pag:paginas) {
				out.println("<a href=http://"+ pag.getDireccion()+ ">"+pag.getDireccion() + "</a><br>");
				out.println("<h3>"+ pag.getDescripcion()+"</h3>" );
				out.println("<hr>");
			}
		}else {
			out.println("<h2> No hay datos de esa temática</h2>");
		}
		
	

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
