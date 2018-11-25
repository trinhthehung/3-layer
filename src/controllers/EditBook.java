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
 * Servlet implementation class EditBook
 */
@WebServlet("/EditBook")
public class EditBook extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			int id = Integer.valueOf(request.getParameter("id"));
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			Float price = Float.valueOf(request.getParameter("price"));

			DBBook dbb = new DBBook();
			Boolean ck = dbb.EditBook(id, title, author, price);

			response.sendRedirect("home.jsp");
		} catch (Exception e) {
			// TODO: handle exception

			response.sendRedirect("editbook.jsp?id=" + String.valueOf(Integer.valueOf(request.getParameter("id"))));
		}
	}

}
