package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Answer;
import model.Question;

@WebServlet("/EditQuestion")
public class EditQuestion extends HttpServlet {
	public static boolean UpdateQuestion( Question r, Connection conn) {
		String sql = "update dbo.Question set  QContent=?, EId=? "
				+ "where QId='"+r.getQId()+"';";
		
			try {
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, r.getQContent());
			ptmt.setInt(2, r.getEId());
			
			int kt = ptmt.executeUpdate();

			if(kt!=0){
				
				return true;
			}
			ptmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error :"+e.getMessage());
		}

		return false;
	}
	public static int LastIdQuestion( Connection conn) {
		String sql = "SELECT distinct IDENT_CURRENT('Question') as LastID From Question ";
		int lastID =0;
			try {
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ResultSet rs= ptmt.executeQuery();
			
			while(rs.next()){
				lastID= rs.getInt("LastID");
				
	
			}
			ptmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error :"+e.getMessage());
		}

		return lastID;
	}
	public static boolean DeleteQuestion(int QId, Connection conn) {

		boolean t = false;

		String sql = "Delete From Question Where QId =?";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, QId);
			stmt.executeUpdate();
			t = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	public static boolean DeleteAnswer(int AId, Connection conn) {

		boolean t = false;

		String sql = "Delete From Answer Where AId =?";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, AId);
			stmt.executeUpdate();
			int kt = stmt.executeUpdate();
			t = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	public static boolean InsertQuestion(String QContent,int EId, Connection conn) {
		String sql = "INSERT INTO dbo.Question( QContent,EId)" + 
				" VALUES (?, ?)";
		
			try {
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1,QContent);
			ptmt.setInt(2, EId);
			
			
			int kt = ptmt.executeUpdate();

			if(kt!=0){
				
				return true;
			}
			ptmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error :"+e.getMessage());
		}

		return false;
	}
	public static boolean InsertAnswer(String AContent,int QId,int IsTrue, Connection conn) {
		String sql = "INSERT INTO dbo.Answer( AContent,QId,IsTrue)" + 
				" VALUES (?, ? , ?)";
		
			try {
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1,AContent);
			ptmt.setInt(2, QId);
			ptmt.setInt(3, IsTrue);
			
			
			int kt = ptmt.executeUpdate();

			if(kt!=0){
				
				return true;
			}
			ptmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error :"+e.getMessage());
		}

		return false;
	}
	public static boolean UpdateAnswer (String AContent,String AId ,Connection conn) {
		String sql = "update dbo.Answer set  AContent=? "
				+ "where AId='"+AId+"';";
		
			try {
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1,AContent);
			
			int kt = ptmt.executeUpdate();

			if(kt!=0){
				
				return true;
			}
			ptmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error :"+e.getMessage());
		}

		return false;
	}
	

}
