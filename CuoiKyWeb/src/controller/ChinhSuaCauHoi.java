package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EditQuestion;
import DAO.LoadQuestion;
import model.Connect;
import model.Answer;
import model.Question;


@WebServlet("/ChinhSuaCauHoi")
public class ChinhSuaCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ChinhSuaCauHoi() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = Connect.CreateConnection();
		

		String message = "";
		Question q = new Question();
		int Qid = Integer.parseInt(request.getParameter("QId"));
		String QContent = request.getParameter("QContent");
		int EId = Integer.parseInt(request.getParameter("EId"));
		q.setQId(Qid);
		q.setQContent(QContent);
		q.setEId(EId);
		
		
		boolean flag = EditQuestion.UpdateQuestion(q, conn);
		if(flag == true) {
			message= "Cập nhật Câu Hỏi thành công!";
		}
		else {
			message= "Cập nhật thất bại!";
		}
		request.setAttribute("message", message);
		request.setAttribute("Question", q);
		List<Answer> listAnswertrue = LoadQuestion.LoadListAnswerTrue(request.getParameter("QId"), conn);

		request.setAttribute("Answer",listAnswertrue);
		List<Answer> listAnswer = LoadQuestion.LoadListAnswer(request.getParameter("QId"), conn);
		request.setAttribute("listAnswer", listAnswer);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/ChiTietCauHoi.jsp");
		rd.forward(request, response);
	}

}
