package br.com.alura.bookstore.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "gislaine";
		String password = "gislaine";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
