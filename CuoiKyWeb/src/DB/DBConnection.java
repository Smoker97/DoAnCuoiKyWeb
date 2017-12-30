package DB;
import java.sql.*;
public class DBConnection {
	public static Connection CreateConnection(){
		Connection conn = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; "
					+ "databaseName=ThiOnline; user=login; password=12345678;");
			System.out.println("Connected successfull");
		}
		catch (Exception ex){
			System.out.println("Error connection " + ex);
		}
		return conn;
	}
}