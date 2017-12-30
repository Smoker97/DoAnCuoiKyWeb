package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TimUserTheoMaDAO;
import model.Userad;

@WebServlet("/TimUserTheoMa")
public class TimUserTheoMa extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public TimUserTheoMa() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		String UId = request.getParameter("UId");
		System.out.println(UId);
		PrintWriter out = response.getWriter();
		
		try {
			List<Userad> dsUser = TimUserTheoMaDAO.getTimUser(UId);
			
			if(dsUser == null)
			{
				System.out.println("Loi");
				return;
			}
					
			for(Userad rs: dsUser)
				out.println("<tr><td>"+rs.getUId()+"</td><td>"+ rs.getUName()+"</td><td>"+rs.getFullName()+"</td><td>"+ rs.getPass()+"</td><td>"+  rs.getBirth()+"</td><td>" +rs.getCMND() +"</td><td>"+ rs.getTel() + "</td></tr>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
