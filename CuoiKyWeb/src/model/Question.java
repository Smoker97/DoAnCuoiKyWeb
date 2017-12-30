package model;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Question
 */
@WebServlet("/Question")
public class Question  {
	private int QId;
	private String QContent;
	private int EId;
	public Question() {}
	public Question(int QId, String QContent, int ELd) {
		this.QId = QId;
		this.QContent = QContent;
		this.EId = ELd;
	}
	public int getQId() {
		return QId;
	}
	public void setQId(int qId) {
		QId = qId;
	}
	public String getQContent() {
		return QContent;
	}
	public void setQContent(String qContent) {
		QContent = qContent;
	}
	public int getEId() {
		return EId;
	}
	public void setEId(int eid) {
		EId = eid;
	}
	
}
