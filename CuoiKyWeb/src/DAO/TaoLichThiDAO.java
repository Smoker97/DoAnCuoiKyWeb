package DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TaoLichThiDAO {
	public void CreateLichThi(String TestId,String SubjectId, String Time_Start, String Time_Close) throws SQLException, ParseException {
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
			
			String sql= "{call dbo.spCreateLichThi(?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			int testId = Integer.valueOf(TestId);
			cstmt.setInt(1, testId);
			
			int subjectId = Integer.valueOf(SubjectId);
			cstmt.setInt(2, subjectId);
			
/*			SimpleDateFormat timeStart = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println(timeStart);
			Date timestart = (Date) timeStart.parse(Time_Start);
			System.out.println(timestart);
			
			java.sql.Date sqlStartDate = new java.sql.Date(timestart.getTime());*/
			cstmt.setString(3, Time_Start);
/*			
			SimpleDateFormat timeClose = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date timeclose = (Date) timeClose.parse(Time_Close);
			java.sql.Date sqlCloseDate = new java.sql.Date(timeclose.getTime());*/
			cstmt.setString(4, Time_Close);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
