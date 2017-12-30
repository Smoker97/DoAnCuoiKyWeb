package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Answer
 */
@WebServlet("/Answer")
public class Answer {
	private int AId ;
	private String AContent;
	private int QId;
	private int True;
	public Answer() {}
	public Answer(int AID,String AContent,int QId,int True) {
		this.AId  = AID;
		this.AContent= AContent;
		this.QId= QId;
		this.True = True;
	}
	public int getAId() {
		return AId;
	}
	public void setAId(int aId) {
		AId = aId;
	}
	public String getAContent() {
		return AContent;
	}
	public void setAContent(String aContent) {
		AContent = aContent;
	}
	public int getQId() {
		return QId;
	}
	public void setQId(int qId) {
		QId = qId;
	}
	public int getTrue() {
		return True;
	}
	public void setTrue(int true1) {
		True = true1;
	}
	
       
    

}
