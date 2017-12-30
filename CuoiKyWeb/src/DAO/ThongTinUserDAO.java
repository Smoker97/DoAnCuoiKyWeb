package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Userad;

public class ThongTinUserDAO {
	public static List<Userad> getThongtinUser(int uId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;" +  
		         "databaseName=ThiOnline;user=user1;password=123;integratedSecurity=true";  

		      // Declare the JDBC objects.  
		      Connection conn = null;  
		      Statement st	 = null;  
		      ResultSet rs = null;  
		      String url = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=user1;password=123;";  
		      String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		      int UId;
		      String UName, FullName, Pass, Birth, CMND, Tel;
		     
		try {
			 Class.forName(driverClass);
			 conn=DriverManager.getConnection(url);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			String sql= "SELECT * from dbo.Users";
			 st = conn.createStatement();

			 rs = st.executeQuery(sql);
			
			List<Userad> dsThongtin= new ArrayList<Userad>();
			while(rs.next()) {
				UId= rs.getInt("UId");
				UName=rs.getString("UName");
				FullName=rs.getString("FullName");
				Pass=rs.getString("Pass");
				Birth=rs.getString("Birth");
				CMND=rs.getString("CMND");
				Tel=rs.getString("Tel");
				
				dsThongtin.add(new Userad(UId, UName, FullName, Pass, Birth, CMND, Tel));						
			}			
			
			 try {
				    if (conn != null) {
				      conn.close();
				    }
				    if (st != null) {
				     st.close();
				    }
				    if (rs != null) {
				     rs.close();
				    }
				   } catch (Exception ex) {
				     ex.printStackTrace();
				   }
			
			return dsThongtin; 
	}

}
