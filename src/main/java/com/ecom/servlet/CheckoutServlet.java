package com.ecom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecom.model.OrderHeader;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderHeader cart = EcomService.getCart(request.getSession(true));
		if(cart == null){
			request.getRequestDispatcher("cart").forward(request, response);
		}else{
			request.getRequestDispatcher("/checkout.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderHeader cart = EcomService.getCart(request.getSession(true));
		if(cart == null){
			request.getRequestDispatcher("cart").forward(request, response);
		}else{
			request.getRequestDispatcher("/checkout.jsp").forward(request, response);
		}
	}

}
