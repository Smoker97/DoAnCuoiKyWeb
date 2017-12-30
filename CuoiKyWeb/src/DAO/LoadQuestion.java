package DAO;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import model.Answer;
import model.Question;

public class LoadQuestion {
	
public static List<Question> LoadListQuestion(String EID,Connection conn){
		List<Question> list= new ArrayList<Question>();
		
		String sql= "SELECT * from Question where EId='"+EID+"'";
		
		try {
			PreparedStatement ptmt= conn.prepareStatement(sql);
			
			ResultSet rs= ptmt.executeQuery();
			
			while(rs.next()){
				int QId= rs.getInt("QId");
				String QContent= rs.getString("QContent");
				int EId=rs.getInt("EId");
				
				Question qs = new Question();
				qs.setQId(QId);
				qs.setQContent(QContent);
				qs.setEId(EId);
				
				
				list.add(qs);
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return list;
	}
public static Question LoadQuestion(String QId,Connection conn){

	Question qs = new Question();
	
	String sql= "SELECT * from Question where QId = '"+QId+"'";
	
	try {
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ResultSet rs= ptmt.executeQuery();
		
		while(rs.next()){
			int qid= rs.getInt("QId");
			String QContent= rs.getString("QContent");
			int EId=rs.getInt("EId");

			
			
			qs.setQId(qid);
			qs.setQContent(QContent);
			qs.setEId(EId);
			
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	return qs;
}
public static List<Answer> LoadListAnswer(String QId,Connection conn){
	List<Answer> list= new ArrayList<Answer>();
	
	String sql= "select * from Answer where QId = '"+QId+"'";
	
	try {
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ResultSet rs= ptmt.executeQuery();
			int qid = Integer.valueOf(QId);
		while(rs.next()){
			int AId= rs.getInt("AId");
			String AContent= rs.getString("AContent");
			int IsTrue=rs.getInt("IsTrue");
			
			
			Answer as= new Answer();
			as.setAId(AId);
			as.setAContent(AContent);
			as.setQId(qid);
			as.setTrue(IsTrue);
			
			
			list.add(as);
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	return list;
}
public static List<Answer> LoadListAnswerTrue(String QId,Connection conn){
	List<Answer> list= new ArrayList<Answer>();
	String sql= "select * from Answer where QId = '"+QId+"' and IsTrue=1";

	try {
		PreparedStatement ptmt= conn.prepareStatement(sql);
		
		ResultSet rs= ptmt.executeQuery();
			int qid = Integer.valueOf(QId);
		while(rs.next()){
			int AId= rs.getInt("AId");
			String AContent= rs.getString("AContent");
			int IsTrue=rs.getInt("IsTrue");
			Answer as= new Answer();
			as.setAId(AId);
			as.setAContent(AContent);
			as.setQId(qid);
			as.setTrue(IsTrue);
			
			list.add(as);
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	return list;
}
}
