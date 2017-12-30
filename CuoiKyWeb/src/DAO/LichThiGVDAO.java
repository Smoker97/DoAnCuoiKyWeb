package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class LichThiGVDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=ThiOnline; user=loc1; password=123;";

	public List<LichThiGV> getLichThi() throws SQLException {
		String SubjectId;
		String SubjectName;
		String TestId;
		String TestName;
		String TimeStart;
		String TimeClose;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (Exception e) {
			System.out.println("Error connection " + e);
			return null;
		}
		String sql = "select Test.TId, Test.Tname, Class.CName, Class.CId, Test_Schedule.Time_Start, Test_Schedule.Time_Close From Class, Test, Test_Schedule Where Test.TId = Test_Schedule.TId And Test_Schedule.CId = Class.CId";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		List<LichThiGV> LichThi = new ArrayList<LichThiGV>();
		while (rs.next()) {
			SubjectId = rs.getString("CId");
			SubjectName = rs.getString("CName");
			TestId = rs.getString("TId");
			TestName = rs.getString("Tname");
			TimeStart = rs.getString("Time_Start");
			TimeClose = rs.getString("Time_Close");
			LichThi.add(new LichThiGV(SubjectId, SubjectName, TestId, TestName, TimeStart, TimeClose));
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
		return LichThi;
	}
}
