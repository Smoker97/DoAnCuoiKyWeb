package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class ThongTinCaNhanDAO {
	public static List<User> getThongTinCaNhan(String Uid) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
		Connection conn=null;
		CallableStatement cstmt=null;
		String UID, NAME, PASS, BIRTH, CMND, TEL;
		byte[] AVATAR ;
		
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
			
			String sql= "{call dbo.spThongTinCaNhan(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			int uid = Integer.valueOf(Uid);
			cstmt.setInt(1, uid);
			
			ResultSet kq=cstmt.executeQuery();
			
			List<User> User= new ArrayList<User>();
			while(kq.next()) {
				UID = kq.getString("UId");
				NAME = kq.getNString("FullName");
				PASS = kq.getString("Pass");
				BIRTH = kq.getString("Birth");
				TEL = kq.getString("Tel");
				CMND = kq.getString("CMND");
				AVATAR = kq.getBytes("Avatar");
				User.add(new User(UID, NAME, PASS, TEL, CMND, BIRTH, AVATAR));
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return User; 
	}
}
