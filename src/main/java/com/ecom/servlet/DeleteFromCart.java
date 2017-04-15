package com.ecom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.service.EcomService;

/**
 * Servlet implementation class DeleteFromCart
 */
@WebServlet("/deletefromcart")
public class DeleteFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productId"));
		HttpSession session = request.getSession(true);
	    EcomService.removeItemFromCart(productId, session);
	    request.getRequestDispatcher("cart").forward(request, response);
	}

}
