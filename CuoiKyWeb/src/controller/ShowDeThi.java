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

@WebServlet("/ShowDeThi")
public class ShowDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowDeThi() {
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
		
		List<DeThi> dethi = new ArrayList<DeThi>();	
		DeThiDAO dethiDao = new DeThiDAO();
		
		try {
		dethi = (List<DeThi>)dethiDao.getDeThi();
		this.getServletContext().setAttribute("ListDeThi", dethi);
		
		out.println("<thead><tr><th>Mã đề</th><th>Tên đề</th><th>Thời gian làm bài</th><th></th></tr></thead>");
		
		for(DeThi rs: dethi)
			out.println("<tbody><tr><td>"+ rs.getTestId() +"</td><td>"+ rs.getTestName() +"</td><td>"+ rs.getTimeTest() +"</td><td><a href='./ChuyenTrangChinhSuaDeThi?MaDe="+ rs.getTestId() +"' style='padding: 1px 6px;color:blue' class='btn green-haze'>Chỉnh Sửa</a></td></tr></tbody>");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
