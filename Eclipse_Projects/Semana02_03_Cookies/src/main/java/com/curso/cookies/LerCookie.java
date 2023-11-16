package com.curso.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LerCookie
 */
public class LerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Cookie[] listaCookies = request.getCookies();
         PrintWriter out = response.getWriter();
         if (listaCookies != null) {
                 for ( Cookie c:listaCookies) {
                 out.println(c.getName()+"------"+ c.getValue());
                 }
         }
         out.close();
	}



}
