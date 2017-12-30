package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChinhSuaLichThiDAO {
	public void UpdateLichThi(String TestId, String SubjectId, String TimeStart, String TimeClose) throws SQLException {
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
			
			String sql= "{call dbo.spUpdateLichThi(?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int testId = Integer.valueOf(TestId);
			cstmt.setInt(1, testId);
			int subjectId = Integer.valueOf(SubjectId);
			cstmt.setInt(2, subjectId);
			cstmt.setString(3, TimeStart);
			cstmt.setString(4, TimeClose);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
