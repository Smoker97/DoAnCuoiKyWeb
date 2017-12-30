package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Userad;

@WebServlet("/KiemTraThongTinUser")
public class KiemTraThongTinUser extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public KiemTraThongTinUser() {
        super();     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
	
		String UName= request.getParameter("UName");
		String FullName=request.getParameter("FullName");
		String Pass= request.getParameter("Pass");
		String Birth=request.getParameter("Birth");
		String CMND=request.getParameter("CMND");
		String Tel=request.getParameter("Tel");
		
		System.out.println(UName + FullName + Pass + Birth + CMND + Tel);
	
		PrintWriter out = response.getWriter();
		
		if(UName=="" ||FullName=="" || Pass=="" || Birth=="" || CMND=="" || Tel=="" ) {
			out.println("1");
			return;
		}
		
		try {
			Date temp = Date.valueOf(Birth);
		}catch(Exception e) {
			out.println("2");
			return;
		}
		List<Userad> dsUserThem = new ArrayList<Userad>();
		List<Userad> dsUsertemp = (List<Userad>) getServletContext().getAttribute("dsNVThemVao");
		if(dsUsertemp != null) {
			for(Userad rs: dsUsertemp)
				dsUserThem.add(new Userad(rs.getUId(), rs.getUName(), rs.getFullName(), rs.getPass(), rs.getBirth(), rs.getCMND(), rs.getTel()));
		}
		dsUserThem.add(new Userad(0,UName, FullName, Pass, Birth, CMND, Tel));
		getServletContext().setAttribute("dsNVThemVao", dsUserThem);
		for(Userad rs: dsUserThem)
		{
			out.println("<tr><td>"+ rs.getUName() +"</td><td>"+ rs.getFullName()+"</td><td>"+ rs.getPass()+"</td><td>" + rs.getBirth()+"</td><td>"+rs.getCMND()+"</td><td>"+ 
			rs.getTel()+"</td></tr>");
		}
	}
	
	
    
}
