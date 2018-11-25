<%@page import="models.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.DBBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Books Store Application</title>
</head>
<body>
	<center>
		<h1>Books Management</h1>
		<h2>
			<a href="newbook.jsp">Add New Book</a> &nbsp;&nbsp;&nbsp; <a href="#">List
				All Books</a>

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Books</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
			<%
				DBBook dbb = new DBBook();
				ArrayList<Book> listBook = dbb.GetListBook();

				for (Book book : listBook) {
			%>

			<tr>
				<td><%=book.getId()%></td>
				<td><%=book.getTitle()%></td>
				<td><%=book.getAuthor()%></td>
				<td><%=book.getPrice()%></td>
				<td><a href="editbook.jsp?id=<%=book.getId()%>">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; <a href="DeleteBook?id=<%=book.getId() %>">Delete</a>
			</tr>

			<%
				}
			%>
		</table>
	</div>
</body>
</html>