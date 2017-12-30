package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoiMatKhauDAO {
	public int DoiMatKhau(String Uid ,String OldPass, String NewPass) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
		Connection conn=null;
		PreparedStatement cstmt=null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return 0;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spDoiMatKhau(?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int uid = Integer.valueOf(Uid);
			
			cstmt.setInt(1, uid);
			cstmt.setString(2, OldPass);
			cstmt.setString(3, NewPass);
			
			int temp = cstmt.executeUpdate();
			return temp;
	}
}
