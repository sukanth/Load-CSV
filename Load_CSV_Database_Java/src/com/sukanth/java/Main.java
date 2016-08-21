package com.sukanth.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	
	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getConnection());
			loader.loadCSV("/Users/sukanthgunda/Desktop/ems_backup/admin.csv", "admin", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://ec2-23-21-211-172.compute-1.amazonaws.com:3306/expensemanagementsystem", "contact-sukanth", "sukindi@");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}*/
	 public static Connection getConnection() {
	  		try {
	  			Class.forName("com.mysql.jdbc.Driver");
	  			con = (Connection) DriverManager.getConnection(
	  					"jdbc:mysql://localhost/test", "root", "sukanth");
	  			System.out.println("Connection to DataBase Established");
	            System.out.println("-------------------------------------------------------");
	  		} catch (ClassNotFoundException e) {
	  			e.printStackTrace();
	  		} catch (SQLException e) {
	  			e.printStackTrace();
	  		}
	  		return con;
	  	}
}
