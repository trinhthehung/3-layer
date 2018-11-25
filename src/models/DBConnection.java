package models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection conn = null;

	public DBConnection() {
		// TODO Auto-generated constructor stub
		String fname = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Bookstore;user=bookstoreadmin;password=123456;";

		try {
			Class.forName(fname);
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}


	public CallableStatement getCallableStatement(String sql) {
		try {
			CallableStatement cstm = conn.prepareCall(sql);
			return cstm;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
