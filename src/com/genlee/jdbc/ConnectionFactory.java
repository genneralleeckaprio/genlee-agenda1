package com.genlee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/genleeagenda1", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

}
