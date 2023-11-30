package com.curso.controller;

import java.io.IOException;

import com.curso.model.Produto;
import com.curso.service.ProdutosService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduto
 */
public class AddProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodName = request.getParameter("prodName");
		double prodPrice = Double.parseDouble(request.getParameter("prodPrice"));
		int prodStock = Integer.parseInt(request.getParameter("prodStock"));
		
		ProdutosService.produtos.add(new Produto(prodName, prodPrice, prodStock));
		response.sendRedirect("main.jsp");
	}

}
