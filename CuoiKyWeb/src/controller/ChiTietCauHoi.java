package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoadQuestion;
import model.Connect;
import model.Answer;
import model.Question;


@WebServlet("/ChiTietCauHoi")
public class ChiTietCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ChiTietCauHoi() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = Connect.CreateConnection();
		String QId = request.getParameter("QId");
		Question q = new Question();
		q = LoadQuestion.LoadQuestion(QId, conn);
		request.setAttribute("Question",q);
		List<Answer> listAnswertrue = LoadQuestion.LoadListAnswerTrue(QId, conn);

		request.setAttribute("Answer",listAnswertrue);
		List<Answer> listAnswer = LoadQuestion.LoadListAnswer(QId, conn);
		request.setAttribute("listAnswer", listAnswer);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/ChiTietCauHoi.jsp");
		rd.forward(request, response);
	}

}
