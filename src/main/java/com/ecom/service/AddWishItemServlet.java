package com.ecom.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.User;

/**
 * Servlet implementation class WishItemServlet
 */
@WebServlet("/addwishitem")
public class AddWishItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String productId = request.getParameter("productId");
		
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		
		if(user == null){
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			if(productId != null &&  !productId.isEmpty()){
				EcomService.addWishItem(Integer.parseInt(productId), user);
				request.getRequestDispatcher("allproducts").forward(request, response);
			}
		}
		
	}

}
