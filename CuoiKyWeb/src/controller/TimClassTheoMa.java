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

import DAO.TimLopHocDAO;
import model.LopHoc;

@WebServlet("/TimClassTheoMa")
public class TimClassTheoMa extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public TimClassTheoMa() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		String CId = request.getParameter("CId");
		System.out.println(CId);
		PrintWriter out = response.getWriter();
		
		try {
			List<LopHoc> dsClass = TimLopHocDAO.getTimClass(CId);
			
			if(dsClass == null)
			{
				System.out.println("Loi");
				return;
			}
					
			for(LopHoc rs: dsClass)
				out.println("<tr><td>"+rs.getCId()+"</td><td>"+ rs.getCName()+ "</td></tr>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
