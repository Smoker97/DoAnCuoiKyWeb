package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThemUserDAO {
	public void themUser(  String UName, String FullName, String Pass, String Birth, String CMND, String Tel) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=loc1; password=123";
		Connection conn=null;
		PreparedStatement cstmt=null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}		
			String sql= "{call dbo.spThemUser(?,?,?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			
			 cstmt.setString(1,UName);
			 cstmt.setString(2,FullName);
			 cstmt.setString(3,Pass);
			 cstmt.setDate(4,Date.valueOf(Birth));
			 cstmt.setString(5,CMND);
			 cstmt.setString(6,Tel);
			 

			int temp = cstmt.executeUpdate();
			cstmt.close();
			conn.close();
	}
}
