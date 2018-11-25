package controllers;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.DBBook;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			Float price = Float.valueOf(request.getParameter("price"));
			
			DBBook dbb = new DBBook();
			ResultSet rs = dbb.InsertBook(title, author, price);
			
			response.sendRedirect("home.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			
			response.sendRedirect("newbook.jsp");
		}
		
		
		
	}

}
