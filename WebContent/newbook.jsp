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
		<form action="AddBook" method="post">

			<table border="1" cellpadding="5">
				<caption>
					<h2>Add new book</h2>
				</caption>
				<tr>
					<th>Title</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>Author</th>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<th>Price</th>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>