package com.ecom.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecom.service.EcomService;

/**
 * Servlet implementation class ProductDetailServlet
 */
@WebServlet("/productdetail")
public class ProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String productId = request.getParameter("productId");
		request.setAttribute("product", EcomService.getProduct(Integer.parseInt(productId)));
		request.getRequestDispatcher("/productdetail.jsp").forward(request, response);
	}
}
