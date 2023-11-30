package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GuardarRegisto
 */
public class GuardarRegisto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarRegisto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombreField");
		String email = request.getParameter("emailField");
		String radio = request.getParameter("radioField");
		String select = request.getParameter("selectField");
		String checkboxtField1 = request.getParameter("checkboxField1");
		String checkboxtField2 = request.getParameter("checkboxField2");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
            out.println("<html><head><title>Tabuada</title></head><body>");
            out.println("<p>" + nombre);
            out.println("<p>" + email);
            out.println("<p>" + radio);
            out.println("<p>" + select);
            out.println("<p>" + checkboxtField1);
            out.println("<p>" + checkboxtField2);
            out.println("</body></html>");
        } finally {
            out.close();
        }
	}

}
