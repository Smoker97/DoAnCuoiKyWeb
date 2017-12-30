package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class DBConnection
 */
@WebServlet("/Connect")
public class Connect  {
	public static Connection CreateConnection(){
		Connection conn = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; "
					+ "databaseName=ThiOnline; user=loc1; password=123;");
			
		}
		catch (Exception ex){
			System.out.println("Error connection " + ex);
		}
		return conn;
	}

}
