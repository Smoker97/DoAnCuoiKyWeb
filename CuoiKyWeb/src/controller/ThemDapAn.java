package controller;

import java.io.IOException;
import java.io.PrintWriter;
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


@WebServlet("/ThemDapAn")
public class ThemDapAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ThemDapAn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = Connect.CreateConnection();
		String message = "";
		int QId= Integer.valueOf( request.getParameter("QId"));
		String AContent = request.getParameter("AContent");
		String checktrue = request.getParameter("checkTrue");
		System.out.println(checktrue);
		int istrue=0;
		if("on".equals(checktrue))
		{
			istrue =1;
		}
		boolean kt = EditQuestion.InsertAnswer(AContent, QId, istrue, conn);
		if(kt == true) {
			message= "Thêm Đáp Án Thành Công!";
		}
		else {
			message= "Thêm Đáp Án Thất Bại!";
		}
		request.setAttribute("message", message);
		
		Question q = new Question();
		q= LoadQuestion.LoadQuestion( request.getParameter("QId"), conn);
		request.setAttribute("Question", q);
		List<Answer> listAnswertrue = LoadQuestion.LoadListAnswerTrue(request.getParameter("QId"), conn);

		request.setAttribute("Answer",listAnswertrue);
		List<Answer> listAnswer = LoadQuestion.LoadListAnswer(request.getParameter("QId"), conn);
		request.setAttribute("listAnswer", listAnswer);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/ChiTietCauHoi.jsp");
		rd.forward(request, response);
	}

}
