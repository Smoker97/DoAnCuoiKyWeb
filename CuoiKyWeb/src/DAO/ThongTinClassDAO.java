package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.LopHoc;

public class ThongTinClassDAO {
	public static List<LopHoc> getThongtinClass(int cId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;" +  
		         "databaseName=ThiOnline;user=user1;password=123;integratedSecurity=true";  

		      // Declare the JDBC objects.  
		      Connection conn = null;  
		      Statement st	 = null;  
		      ResultSet rs = null;  
		      String url = "jdbc:sqlserver://localhost:1433;databaseName=ThiOnline;user=user1;password=123;";  
		      String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		      int CId;
		      String CName;
		     
		try {
			 Class.forName(driverClass);
			 conn=DriverManager.getConnection(url);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			String sql= "SELECT * from dbo.Class";
			 st = conn.createStatement();

			 rs = st.executeQuery(sql);
			
			List<LopHoc> dsThongtinClass= new ArrayList<LopHoc>();
			while(rs.next()) {
				CId= rs.getInt("CId");
				CName=rs.getString("CName");
			dsThongtinClass.add(new LopHoc(CId,CName));					
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
			
			return dsThongtinClass; 
	}
}
