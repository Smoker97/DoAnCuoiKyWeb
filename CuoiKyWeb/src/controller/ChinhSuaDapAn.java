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

import DAO.EditQuestion;
import DAO.LoadQuestion;
import model.Connect;
import model.Answer;
import model.Question;


@WebServlet("/ChinhSuaDapAn")
public class ChinhSuaDapAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChinhSuaDapAn() {
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
		q = LoadQuestion.LoadQuestion(request.getParameter("QId"), conn);
		String Aid =request.getParameter("AId");
		String AContent = request.getParameter("Acontent");
		
		boolean flag = EditQuestion.UpdateAnswer(AContent, Aid, conn);
		if(flag == true) {
			message= "Cập nhật đáp án  thành công!";
		}
		else {
			message= "Cập nhật đáp án thất bại!";
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
