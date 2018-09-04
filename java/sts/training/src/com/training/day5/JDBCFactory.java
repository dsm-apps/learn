package com.training.day5;

import java.sql.Connection;
import java.sql.DriverManager;

public final class JDBCFactory {

	private static Connection connection = null;
	
	private JDBCFactory() {
	}
	
	private static void setupConnection() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("");
		} catch (Exception e) {
			
		}
		
	}
	
	public static Connection getInstance() {
		
		if(connection == null) {
			setupConnection();
		}
		
		return connection;
		
	}
	
}
