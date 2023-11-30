package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import com.curso.model.Pagina;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Buscador
 */
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Pagina> paginas = Arrays.asList(new Pagina("www.fnac.es", "libros", "Libros y más cosas"),
			new Pagina("www.gamer.es", "juegos", "Juegos on-line"),
			new Pagina("www.casadellibro.es", "libros", "La Web de los libros"),
			new Pagina("www.agapea.com", "libros", "Libros en la libreria online"),
			new Pagina("www.sounddogs.com", "música", "Efectos de sonido"),
			new Pagina("www.radio.es", "música", "Música de actualidad"));


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Buscador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tema = request.getParameter("tema");
		if (tema != null) {
			PrintWriter out = response.getWriter();
			for(Pagina pag : paginas) {
				if(pag.getTematica().equals(tema)) {
					out.println("<h1> Categoria: " + tema);
					out.println("<h2>" + pag.getDescripcion()+ "</h2>" );
					out.println("<a href='" + pag.getDireccion() + "'>" + pag.getDireccion() + "</a>" );
					out.println("<hr>");
				}
			}
		}
	}

}
