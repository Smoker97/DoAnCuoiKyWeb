package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import DAO.*;

@WebServlet("/LoadMonHoc")
public class LoadMonHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoadMonHoc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		List<KindOfQuestion> kindofquestion;
		LoadMonHocDAO kindofquestionDao = new LoadMonHocDAO();
		
		try {
			kindofquestion = kindofquestionDao.getKindOfQuestion();
			getServletContext().setAttribute("KindOfQuestion", kindofquestion);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
