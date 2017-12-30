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


@WebServlet("/XoaCauHoi")
public class XoaCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public XoaCauHoi() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection conn = Connect.CreateConnection();
		String message = "";
		int QId= Integer.valueOf( request.getParameter("QId"));
		boolean kt = EditQuestion.DeleteQuestion(QId, conn);
		if(kt == true) {
			message= "Xóa Câu Hỏi Thành Công!";
		}
		else {
			message= "Câu Hỏi Đã Có Trong Bộ Đề Không Thể Xóa !";
		}
		request.setAttribute("message", message);
		String EId= request.getParameter("EId");
		List<Question> listQuestion = LoadQuestion.LoadListQuestion(EId,conn);
		request.setAttribute("listQuestion", listQuestion);
		RequestDispatcher rd= request.getRequestDispatcher("LoadCauHoi");
		rd.forward(request, response);
	}

}
