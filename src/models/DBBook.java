package models;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBBook {

	private DBConnection conn;

	public DBBook() {
		// TODO Auto-generated constructor stub

		conn = new DBConnection();
	}

	public ArrayList<Book> GetListBook() {

		ArrayList<Book> listBook = new ArrayList<>();

		String sql = "select * from BOOK";

		try {
			ResultSet rs = conn.getCallableStatement(sql).executeQuery();

			while (rs.next()) {

				Book book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getFloat(4));

				listBook.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listBook;
	}

	public ResultSet InsertBook(String title, String author, float price) {

		String sql = "insert into BOOK (title, author, price) values ('" + title + "', '" + author + "', "
				+ String.valueOf(price) + ")";
		CallableStatement cstm = conn.getCallableStatement(sql);

		try {

			ResultSet rs = cstm.executeQuery();

			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return null;
	}

	public ResultSet SelectBook(int id) {

		String sql = "select * from BOOK where id = " + String.valueOf(id);
		CallableStatement cstm = conn.getCallableStatement(sql);

		try {

			ResultSet rs = cstm.executeQuery();

			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return null;
	}

	public boolean EditBook(int id, String title, String author, float price) {

		String sql = "update BOOK set title = '" + title + "', author = '" + author + "', price = "
				+ String.valueOf(price) + " where id = " + String.valueOf(id) + ";";

		CallableStatement cstm = conn.getCallableStatement(sql);

		try {

			ResultSet rs = cstm.executeQuery();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

			return false;
		}
	}
	
	public boolean DeleteBook(int id) {

		String sql = "delete from BOOK where id = " + String.valueOf(id) + ";";

		CallableStatement cstm = conn.getCallableStatement(sql);

		try {

			ResultSet rs = cstm.executeQuery();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

			return false;
		}
	}

}
