package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ParametrosURL
 */
public class ParametrosURL extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color = request.getParameter("color");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
        try {
            out.println("<html><head><title>Parametros GET no URL</title></head><body>");
            out.println("<style> body { background-color:" + color + "; } </style>");
            out.println("<h1>Hola Mundo</h1>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
	}

}
