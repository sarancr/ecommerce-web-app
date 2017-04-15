package com.ecom.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.OrderHeader;
import com.ecom.model.User;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class OrderHistoryServlet
 */
@WebServlet("/orderhistory")
public class OrderHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if(user == null){
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			List<OrderHeader> orders = EcomService.getAllOrders(user.getUserId());
			//List<OrderHeader> orders = EcomService.getAllOrders(user.getUserId());
			if(orders != null)
				request.setAttribute("orders", orders);
			request.getRequestDispatcher("/orderhistory.jsp").forward(request, response);
		}
	}

}
