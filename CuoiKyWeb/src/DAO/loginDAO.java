package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import model.User;
import DB.DBConnection;


public class loginDAO {
	public static boolean LoginMember(String name, String pass, Connection conn) {

		boolean t = false;

		
		
		String sql = "select UName, Pass, Users.UId, RId "
				+ "from Users, User_Roles where Users.UId=User_Roles.UId";
		System.out.println(name);
		System.out.println(pass);

		try {

			PreparedStatement ptmt =conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				
				String username = rs.getString("UName");
				String password = rs.getString("Pass");
				int roleid = rs.getInt("RId");

				if ((username.equals(name)) && (password.trim().equals(pass.trim())) && roleid == 1) {
					t = true;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}
	public static boolean Logingv(String name, String pass, Connection conn) {

		boolean t = false;

		
		
		String sql = "select UName, Pass, Users.UId, RId "
				+ "from Users, User_Roles where Users.UId=User_Roles.UId";
		System.out.println(name);
		System.out.println(pass);

		try {

			PreparedStatement ptmt =conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				
				String username = rs.getString("UName");
				String password = rs.getString("Pass");
				int roleid = rs.getInt("RId");

				if ((username.equals(name)) && (password.trim().equals(pass.trim())) && roleid == 2) {
					t = true;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}
	public static boolean Loginad(String name, String pass, Connection conn) {

		boolean t = false;

		
		
		String sql = "select UName, Pass, Users.UId, RId "
				+ "from Users, User_Roles where Users.UId=User_Roles.UId";
		System.out.println(name);
		System.out.println(pass);

		try {

			PreparedStatement ptmt =conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				
				String username = rs.getString("UName");
				String password = rs.getString("Pass");
				int roleid = rs.getInt("RId");

				if ((username.equals(name)) && (password.trim().equals(pass.trim())) && roleid == 3) {
					t = true;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return t;

	}
	public static int LoginUId(String Uname, Connection conn) {

		int UId = 0;
		
		String sql = "select UId "
				+ "from Users where  UName = '"+Uname+"'";
		System.out.println(Uname);

		try {

			PreparedStatement ptmt =conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				
				
				int Uid = rs.getInt("UId");

				UId=Uid;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return UId;

	}
	

	
	
	//Lấy tên user đăng nhập
	public static String getName(String username, Connection conn) {
		String name = null;

		PreparedStatement ptmt = null;

		String sql = "select FullName from Users where UName='" + username + "'";

		try {

			ptmt = (PreparedStatement) conn.prepareStatement(sql);

			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				name = rs.getString("Name");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;
	}
	
	// Lấy thông tin user
	public static User getUserInfo(String username) {
		Connection con = DBConnection.CreateConnection();
		String sql = "select UId, UName,Pass,FullName,Birth,CMND,Tel,Avatar from Users "
				+ "where UName='"
					+ username + "'";
		User us = new User();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String Uid= rs.getString("UId");
				String Pass = rs.getString("Pass").trim();
				String Name = rs.getString("UName");
				String Birth = rs.getString("Birth");
				String CMND = rs.getString("CMND");
				String Tel = rs.getString("Tel");
				byte[] Avatar = rs.getBytes("Avatar");
				us = new User(Uid, Name, Pass, Tel, CMND, Birth, Avatar);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return us;
	}
}
