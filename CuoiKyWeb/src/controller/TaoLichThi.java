package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;

@WebServlet("/TaoLichThi")
public class TaoLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaoLichThi() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String TestId = request.getParameter("testId");
		String SubjectId = request.getParameter("SubjectId");
		String TimeStart = request.getParameter("TimeStart");
		String TimeClose = request.getParameter("TimeClose");
		
		try {
			TaoLichThiDAO taolichthiDao = new TaoLichThiDAO();
			taolichthiDao.CreateLichThi(TestId, SubjectId, TimeStart, TimeClose);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
