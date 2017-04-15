package com.ecom.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.OrderHeader;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class MiniCartServlet
 */
@WebServlet("/minicart")
public class MiniCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		OrderHeader cart = EcomService.getCart(session);
		int count = 0;
		double amount = 0;
		
	    if(cart != null){
	    	count = cart.getOrderlines().size();
	    	amount = cart.getTotal();
	    }
	    
	    String json = "{"+"\"amount\":"+amount+", \"count\":"+count+"}";
	    response.setCharacterEncoding("utf8");
	    response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    out.print(json);
	    out.flush();
	}

}
