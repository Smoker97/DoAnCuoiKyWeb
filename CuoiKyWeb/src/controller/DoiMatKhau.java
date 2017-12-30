package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoiMatKhauDAO;

@WebServlet("/DoiMatKhau")
public class DoiMatKhau extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DoiMatKhau() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();		
		String OldPass = request.getParameter("OldPass");
		String NewPass = request.getParameter("NewPass");
		
		try {
			DoiMatKhauDAO temp = new DoiMatKhauDAO();
			int a = 0;
			a =  temp.DoiMatKhau("1000", OldPass, NewPass);
			out.print(a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
