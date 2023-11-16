package com.curso.controller;

import java.io.IOException;

import com.curso.service.ProdutosService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyProduto
 */
public class ModifyProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String produtoId = request.getParameter("id");
	     request.setAttribute("produto2Modify", produtoId);
	     
	     RequestDispatcher dispatcher = request.getRequestDispatcher("editproductform.jsp");
	     dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodIndex = Integer.parseInt(request.getParameter("productIndex"));
		double prodPrice = Double.parseDouble(request.getParameter("prodPrice"));
		
		ProdutosService.produtos.get(prodIndex).setPrecio(prodPrice);
		response.sendRedirect("main.jsp");
	}

}
