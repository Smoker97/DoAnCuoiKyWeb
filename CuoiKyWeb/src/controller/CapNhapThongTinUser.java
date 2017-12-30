package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapNhapThongTinUserDAO;

@WebServlet("/CapNhapThongTinUser")
public class CapNhapThongTinUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CapNhapThongTinUser() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 

		PrintWriter out = response.getWriter();
		String FullName = request.getParameter("FullName");
		String Pass = request.getParameter("Pass");
		String Birth= request.getParameter("Birth");
		String CMND= request.getParameter("CMND");
		String Tel=request.getParameter("Tel");
		
		
		if(FullName == "" || Pass == "" || Birth == "" || CMND == "" || Tel == "") {
			out.println(1);
			return;
		}
		
		try {
			CapNhapThongTinUserDAO temp = new CapNhapThongTinUserDAO();
			temp.UpdateUser("1000",FullName, Pass, Birth, CMND, Tel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
