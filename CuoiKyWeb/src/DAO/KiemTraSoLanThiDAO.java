package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KiemTraSoLanThiDAO {
	public static int kiemTraSoLanThi(int Uid, int Cid, int Tid) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
		Connection conn=null;
		CallableStatement cstmt=null;
		int solan = 0;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return 1;
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spKiemTraSoLanThi(?,?,?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, Uid);
			cstmt.setInt(2, Cid);
			cstmt.setInt(3, Tid);
			
			ResultSet kq=cstmt.executeQuery();
			
			while(kq.next()) {
				solan++;
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return solan;
	}
}
