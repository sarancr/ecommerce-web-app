package com.ecom.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.User;
import com.ecom.model.WishItem;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class WishListItemsServlet
 */
@WebServlet("/wishlist")
public class WishListItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if(user == null){
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			List<WishItem> wishItems = EcomService.getWishItems(user);
			request.setAttribute("wishItems", wishItems);
			request.getRequestDispatcher("/wishlist.jsp").forward(request, response);
		}
	}

}
