package com.quality.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author stankewicz
 *
 */
public class JDBCUtil {

	private static Connection con = buildConnection();
	
	private static Connection buildConnection(){
		
		String url = "jdbc:mysql://localhost/officer";
		String user = "root";
		String senha = "@nDr0m3Da126";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, user, senha);
			return con;
		}catch(SQLException s){
			s.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return con;
	}
	
	public static Connection getConnection(){
		return con;
	}
}
