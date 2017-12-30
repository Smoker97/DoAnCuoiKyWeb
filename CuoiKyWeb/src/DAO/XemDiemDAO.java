package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.PhieuDiem;

public class XemDiemDAO {
	public static List<PhieuDiem> geBangDiem(int Uid) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
		Connection conn=null;
		CallableStatement cstmt=null;
		String TName, Date, TrueAnswer, AnswerSize;
		float Point;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spXemDiem(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, Uid);
			
			ResultSet kq=cstmt.executeQuery();
			
			List<PhieuDiem> BangDiem= new ArrayList<PhieuDiem>();
			while(kq.next()) {
				TName = kq.getString("Tname");
				Date = kq.getString("Time_Of_Exam");
				TrueAnswer = kq.getString("True_Answer");
				AnswerSize = kq.getString("Answer_Size");
				Point = kq.getFloat("point");
				BangDiem.add(new PhieuDiem(TName, Date, TrueAnswer, AnswerSize, Point));
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return BangDiem; 
	}
}
