package com.ecom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.OrderHeader;
import com.ecom.model.OrderLine;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		OrderHeader cart = (OrderHeader) session.getAttribute("cart");
		if( cart!= null){
			System.out.println("Cart Servlet....");
			for(OrderLine line : cart.getOrderlines()){
			 System.out.println(" ----- " + line.getProduct().getName());
			}
		}else{
			System.out.println("No cart found....");
		}

		request.getRequestDispatcher("/cart.jsp").forward(request, response);
	}

}
