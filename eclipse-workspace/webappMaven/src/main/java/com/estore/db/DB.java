package com.estore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB {
	
	// Connection
	
		public Connection connection;
		Statement statement;
		PreparedStatement preparedStatement;
		
		
		public DB() {
			
			//mysql -> driver, oracle db -> driver will be different
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
				this.createConnection();
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}

		public int executeUpdate(PreparedStatement statement)
		{
			int result =0;
			try {
				result = statement.executeUpdate();
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.print(e);
			}
			return result;
		}
		
		public ResultSet executeQuery(PreparedStatement statement)
		{
			ResultSet result = null;
			try {
				result = statement.executeQuery();

			}catch (Exception e) {
				// TODO: handle exception

				System.out.print(e);

			}
			return result;
		}
		public void createConnection() {
			
			//username, pwd, url
			String username = "root";
			String password = "Kalol@123";
			String url = "jdbc:mysql://localhost:3306/estore";
			
			try {
				connection = DriverManager.getConnection(url,username,password);
				System.out.println("Connected successfully");
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}

		
		public void closeConnection() {
			// TODO Auto-generated method stub
			
			try {
				connection.close();
				System.out.println("Connection closed. Close Status : "+connection.isClosed());
			} catch (Exception e) {
			  System.out.println(e);
			}
			
			
		}

}
