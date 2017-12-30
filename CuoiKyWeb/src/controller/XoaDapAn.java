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


@WebServlet("/XoaDapAn")
public class XoaDapAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public XoaDapAn() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = Connect.CreateConnection();
		String message = "";
		int AId= Integer.valueOf( request.getParameter("AId"));
		String QId= request.getParameter("QId");
		boolean kt = EditQuestion.DeleteAnswer(AId, conn);
		if(kt == true) {
			message= "Xóa Đáp Án Thành Công!";
		}
		else {
			message= "Xóa Đáp Án Không Thành Công !";
		}
		request.setAttribute("message", message);
		Question q = new Question();
		q= LoadQuestion.LoadQuestion(QId, conn);
		request.setAttribute("Question", q);
		List<Answer> listAnswertrue = LoadQuestion.LoadListAnswerTrue(request.getParameter("QId"), conn);

		request.setAttribute("Answer",listAnswertrue);
		List<Answer> listAnswer = LoadQuestion.LoadListAnswer(request.getParameter("QId"), conn);
		request.setAttribute("listAnswer", listAnswer);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/ChiTietCauHoi.jsp");
		rd.forward(request, response);
	}

}
