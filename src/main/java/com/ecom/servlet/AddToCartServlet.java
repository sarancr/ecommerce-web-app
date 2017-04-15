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
 * Servlet implementation class AddToCartServlet
 */

@WebServlet("/addtocart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId = request.getParameter("productId");
		String qty = request.getParameter("qty");
		if(qty == null || qty.isEmpty())
			qty = "1";
		
		System.out.println("AddToCartServlet - productId = " + productId + " qty = " + qty);
		
		HttpSession session = request.getSession(true);
	    EcomService.addToCart(Integer.parseInt(productId),  Integer.parseInt(qty), session);
	    request.getRequestDispatcher("allproducts").forward(request, response);
	}

}
