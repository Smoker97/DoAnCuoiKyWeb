package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChinhSuaMaDeDAO {
	public void UpdateCreateTest(String TestId, String TestName,String Time_Test) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=loc1;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spUpdateCreateTest(?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int testId = Integer.valueOf(TestId);
			cstmt.setInt(1, testId);
			cstmt.setString(2, TestName);
			int time = Integer.valueOf(Time_Test);
			cstmt.setInt(3, time);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
