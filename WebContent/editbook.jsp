<%@page import="java.sql.ResultSet"%>
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
			<a href="#">Add New Book</a> &nbsp;&nbsp;&nbsp; <a href="#">List
				All Books</a>

		</h2>
	</center>
	<div align="center">
		<%
			int id = Integer.valueOf(request.getParameter("id"));

			DBBook dbb = new DBBook();
			ResultSet rs = dbb.SelectBook(id);

			while (rs.next()) {
		%>


		<form action="EditBook" method="post">

			<table border="1" cellpadding="5">
				<caption>
					<h2>Edit book</h2>
				</caption>
				<tr style="display: none;">
					<th>id</th>
					<td><input type="text" name="id"
						value=<%=rs.getString(1)%>></td>
				</tr>
				<tr>
					<th>Title</th>
					<td><input type="text" name="title"
						value=<%=rs.getString(2)%>></td>
				</tr>
				<tr>
					<th>Author</th>
					<td><input type="text" name="author"
						value=<%=rs.getString(3)%>></td>
				</tr>
				<tr>
					<th>Price</th>
					<td><input type="text" name="price" value=<%=rs.getFloat(4)%>></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save" /></td>
				</tr>
			</table>
		</form>

		<%
			}
		%>
	</div>
</body>
</html>