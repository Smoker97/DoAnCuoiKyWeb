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
import model.Question;


@WebServlet("/LoadCauHoi")
public class LoadCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoadCauHoi() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = Connect.CreateConnection();
		String EId= request.getParameter("EId"); 
		request.setAttribute("EId", EId);
		List<Question> listQuestion = LoadQuestion.LoadListQuestion(EId,conn);
		request.setAttribute("listQuestion", listQuestion);
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/DanhSachCauHoi.jsp");
		rd.forward(request, response);
	}

}
