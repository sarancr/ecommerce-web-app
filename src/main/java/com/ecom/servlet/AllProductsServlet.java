package com.ecom.servlet;

import java.io.IOException;





import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecom.dao.ProductDao;
import com.ecom.model.Product;


/**
 * Servlet implementation class AllProductsServlet
 */
@WebServlet("/allproducts")
public class AllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getAllProducts();
		System.out.println("products = " + products);
		request.setAttribute("products", products);
		request.getRequestDispatcher("/shopall.jsp").forward(request, response);
	}

}
