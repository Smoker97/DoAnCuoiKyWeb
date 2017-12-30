package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CauHoi;
import model.CauTraLoi;

public class LayCauHoiVaCauTraLoiDAO {
	public static List<CauHoi> getCauHoiVaCauTraLoi(int TId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=login;password=12345678";
		Connection conn=null;
		CallableStatement cstmt=null;
		int QId, EId;
		String QContent;
		List<CauTraLoi> dsCauTraLoi = new ArrayList<CauTraLoi>();
		
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
			
			String sql= "{call dbo.spCauHoiVaCauTraLoi(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, TId);
			
			ResultSet kq=cstmt.executeQuery();
			
			List<CauHoi> dsCauHoiVaCauTraLoi= new ArrayList<CauHoi>();
			while(kq.next()) {
				QId = kq.getInt("QId");
				QContent = kq.getString("QContent");
				EId = kq.getInt("EId");
				dsCauTraLoi = LayCauTraLoiDAO.getCauTraLoi(QId);
				dsCauHoiVaCauTraLoi.add(new CauHoi(QId, QContent, EId, dsCauTraLoi));
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return dsCauHoiVaCauTraLoi;
	}
}
