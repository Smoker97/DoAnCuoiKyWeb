package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class LayMaDeVuaThemDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=ThiOnline; user=loc1; password=123;";

	public int getMaDeVuaThem() throws SQLException {
		Connection conn = null;
		String TestId;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (Exception e) {
			System.out.println("Error connection " + e);
		}
		String sql = "select TId From Test";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		
		List<String> ListMaDeThi = new ArrayList<String>();
		while (rs.next()) {
				TestId = rs.getString("TId");
				ListMaDeThi.add(TestId);
		}
		String LastId = (String)ListMaDeThi.get(ListMaDeThi.size()-1);
		int lastId = Integer.valueOf(LastId); 
		
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
		return lastId;
	}
}
