package com.ecom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecom.model.User;
import com.ecom.service.EcomService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String jsp = request.getParameter("jsp");
		if(jsp == null || jsp.isEmpty()){
			jsp = "/index.jsp";
		}
		
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		
		if(user == null){
			user = EcomService.login(username, password);
		}
		
		if(user != null){
			session.setAttribute("user", user);
			System.out.println("LoginServlet - User has logged in.");
		}else{
			System.out.println("LoginServlet - Invalid login credential..");
			request.setAttribute("loginError", "Invalid login credential.");
			jsp = "/index.jsp";
		}
	
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String jsp = request.getParameter("jsp");
		if(jsp == null || jsp.isEmpty()){
			jsp = "/index.jsp";
		}
		
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		
		if(user == null){
			user = EcomService.login(username, password);
		}
		
		if(user != null){
			session.setAttribute("user", user);
			System.out.println("LoginServlet - User has logged in.");
		}else{
			System.out.println("LoginServlet - Invalid login credential..");
			request.setAttribute("loginError", "Invalid login credential.");
			jsp = "/index.jsp";
		}
	
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	
}
