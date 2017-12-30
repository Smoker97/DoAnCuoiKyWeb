package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapNhapThongTinClassDAO;

@WebServlet("/CapNhapThongTinClass")
public class CapNhapThongTinClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CapNhapThongTinClass() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
		String CId = request.getParameter("CId");
		String CName = request.getParameter("CName");	
		if(CId=="" || CName == "" ) {
			out.println(1);
			return;
		}
		
		try {
			CapNhapThongTinClassDAO temp = new CapNhapThongTinClassDAO();
			temp.UpdateClass(CId,CName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
