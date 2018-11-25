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
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			int id = Integer.valueOf(request.getParameter("id"));

			DBBook dbb = new DBBook();
			boolean ck = dbb.DeleteBook(id);

		} catch (Exception e) {
			// TODO: handle exception
		}

		response.sendRedirect("home.jsp");
	}

}
