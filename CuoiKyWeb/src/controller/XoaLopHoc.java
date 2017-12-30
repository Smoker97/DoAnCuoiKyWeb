package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.XoaClassDAO;

@WebServlet("/XoaLopHoc")
public class XoaLopHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public XoaLopHoc() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		String CId = request.getParameter("CId");
		
		try {
			XoaClassDAO temp = new XoaClassDAO();
			temp.xoaLopHoc(CId);
			PrintWriter out = response.getWriter();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
