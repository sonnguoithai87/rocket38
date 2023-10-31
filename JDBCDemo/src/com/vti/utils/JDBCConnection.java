package com.vti.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static JDBCConnection getInstance;
	public static Connection connection;
	static {
		if (getInstance == null) {
			getInstance = new JDBCConnection();
			try {
				getInstance.getDBConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/dbrocket38";
		String userName = "root";
		String passWord = "123456";
		// Dang ky driver với driver manager
		Class.forName("com.mysql.cj.jdbc.Driver");
		if (connection == null) {
			connection = DriverManager.getConnection(dbUrl, userName, passWord);
		}
		return connection;

	}

	public void closeConnection(Connection connection, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (stmt != null)

				stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
