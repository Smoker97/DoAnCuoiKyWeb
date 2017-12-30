package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.XoaUserDAO;


@WebServlet("/XoaNguoiDung")
public class XoaNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public XoaNguoiDung() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		String UId = request.getParameter("UId");
		
		try {
			XoaUserDAO temp = new XoaUserDAO();
			temp.xoaNguoiDung(UId);
			PrintWriter out = response.getWriter();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
