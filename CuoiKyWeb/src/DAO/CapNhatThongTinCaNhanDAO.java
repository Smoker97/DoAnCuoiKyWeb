package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CapNhatThongTinCaNhanDAO {
	public void capNhatThongTinCaNhan(String Uid, String Name, String Tel, String CMND, String Birth, byte[] HinhAnh) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
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
			
			String sql= "{call dbo.spCapNhatThongTinCaNhan(?,?,?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int uid = Integer.valueOf(Uid);
			
			cstmt.setInt(1, uid);
			cstmt.setNString(2, Name);
			cstmt.setString(3, Tel);
			int cmnd = Integer.valueOf(CMND);
			
			cstmt.setInt(4, cmnd);
			
			Date birth = Date.valueOf(Birth);
			
			cstmt.setDate(5, birth);
			cstmt.setBytes(6, HinhAnh);
			
			int temp = cstmt.executeUpdate();
	}
}
