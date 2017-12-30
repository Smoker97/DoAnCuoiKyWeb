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
import model.Question;


@WebServlet("/ThemCauHoi")
public class ThemCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ThemCauHoi() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = Connect.CreateConnection();
		String message = "";
		String QContent= request.getParameter("QContent");
		int EId= Integer.valueOf( request.getParameter("EId"));
		boolean kt = EditQuestion.InsertQuestion(QContent, EId, conn);
		if(kt == true) {
			message= "Thêm Câu Hỏi Thành Công!";
		}
		else {
			message= "Lỗi ! Vui lòng thử lại! !";
		}
		request.setAttribute("message", message);
		request.setAttribute("EId", EId);
		List<Question> listQuestion = LoadQuestion.LoadListQuestion(request.getParameter("EId"),conn);
		request.setAttribute("listQuestion", listQuestion);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/DanhSachCauHoi.jsp");
		rd.forward(request, response);
	}

}
