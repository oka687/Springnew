package com.demoweb.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionHelper {
	
	public static Connection getConnection(String dbname) {
		
		if (dbname.toLowerCase().equals("oracle")) {
			try {
				Context initContext = new InitialContext();
				/*Context context = (Context)initContext.lookup("java:/comp/env");
				DataSource source = (DataSource)context.lookup("jdbc/demoweb");*/
				DataSource source = (DataSource)initContext.lookup("java:comp/env/jdbc/demoweb");
				Connection conn = source.getConnection();
				
				return conn;
			} catch (Exception ex) {
				System.out.println("connection" + ex.getMessage());
				return null;
			}
		} else if (dbname.toLowerCase().equals("oracle")) {
			try {
				//1.
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = 
					DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE","system","1111");
				
				//2.
				/*
				Context initContext = new InitialContext();
				Context context = 
					(Context)initContext.lookup("java:/comp/env");
				DataSource source = 
					(DataSource)context.lookup("mysql/demoweb");
				Connection conn = source.getConnection();
				*/
				return conn;
			} catch (Exception ex) {
				return null;
			}
		} else {
			return null;
		}
		
	}

}
