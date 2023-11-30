package com.curso;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabuadaEstatica10
 */
public class TabuadaEstatica10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
        try {
            out.println("<html><head><title>Tabuada</title></head><body>");
            out.println("<table border='1'>");
            for (int i = 1; i <= 10; i++) {
                out.println("<tr>");
                for (int j = 1; j <= 10; j++) {
                    out.println("<td>" + i * j + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
		
	}

}
