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

@WebServlet("/LoadLopHoc")
public class LoadLopHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoadLopHoc() {
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
		
		List<Subject> kindofquestion;
		LoadLopHocDAO kindofquestionDao = new LoadLopHocDAO();
		
		try {
			kindofquestion = kindofquestionDao.getClasses();
			getServletContext().setAttribute("Subjects", kindofquestion);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
