package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LopHoc;

public class TimLopHocDAO {
	public static List<LopHoc> getTimClass(String cId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=loc1;password=123";
		Connection conn=null;
		CallableStatement cstmt=null;
		int CId;
		String CName;
		
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spTimClass(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			cstmt.setString(1, cId);		
			ResultSet kq=cstmt.executeQuery();	
			List<LopHoc> dsClass= new ArrayList<LopHoc>();
			while(kq.next()) {
				
				CId=kq.getInt("CId");
				CName=kq.getString("CName");
		
				dsClass.add(new LopHoc(CId,CName));
			}
			
			kq.close();
			cstmt.close();
			conn.close();
			return dsClass;
	}
}
