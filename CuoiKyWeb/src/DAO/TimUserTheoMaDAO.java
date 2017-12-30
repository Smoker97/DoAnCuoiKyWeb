package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Userad;;

public class TimUserTheoMaDAO {
	public static List<Userad> getTimUser(String uId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=loc1;password=123";
		Connection conn=null;
		CallableStatement cstmt=null;
		int UId;
		String UName, FullName, Pass, Birth, CMND, Tel;
		
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spTimUser(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			cstmt.setString(1, uId);		
			ResultSet kq=cstmt.executeQuery();	
			List<Userad> dsUser= new ArrayList<Userad>();
			while(kq.next()) {
				
				UId=kq.getInt("UId");
				UName=kq.getString("UName");
				FullName=kq.getString("FullName");
				Pass=kq.getString("Pass");
				Birth=kq.getString("Birth");
				CMND=kq.getString("CMND");
				Tel=kq.getString("Tel");
				
				dsUser.add(new Userad(UId, UName, FullName, Pass, Birth, CMND, Tel));
			}
			
			kq.close();
			cstmt.close();
			conn.close();
			return dsUser;
	}
	
}
