package com.bridgelabz.userapis.loginregistration.database;

/**
 * 
 * @author Bikash Mohanty
 * @since 25th jan 2020
 * @version 1.0
 * 
 * purpose: Provides Database connectivity components
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity 
{
	protected static String mysqlURL = "jdbc:mysql://localhost:3306/bridgelabz?autoReconnect=true&useSSL=false";
	protected static String databaseName = "root";
	protected static String databasePassword = "Biki12@3";
	
	public static Connection getConnection() 
	{
		try 
		{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			return DriverManager.getConnection(mysqlURL,databaseName, databasePassword);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;

	}

}
