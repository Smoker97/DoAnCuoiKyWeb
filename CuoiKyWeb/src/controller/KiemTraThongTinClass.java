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

import model.LopHoc;;

@WebServlet("/KiemTraThongTinClass")
public class KiemTraThongTinClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public KiemTraThongTinClass() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
	
		int CId=Integer.valueOf(request.getParameter("CId"));
		String CName=request.getParameter("CName");
		
		
		System.out.println(CId + CName );
	
		PrintWriter out = response.getWriter();
		
		if(String.valueOf(CId)=="" ||CName=="" ) {
			out.println("1");
			return;
		}
		
	
		List<LopHoc> dsLopThem = new ArrayList<LopHoc>();
		List<LopHoc> dsLoptemp = (List<LopHoc>) getServletContext().getAttribute("dsLopThemVao");
		if(dsLoptemp != null) {
			for(LopHoc rs: dsLoptemp)
				dsLopThem.add(new LopHoc(rs.getCId(),rs.getCName()));
		}
		dsLopThem.add(new LopHoc(CId, CName));
		getServletContext().setAttribute("dsLopThemVao", dsLopThem);
		for(LopHoc rs: dsLopThem)
		{
			out.println("<tr><td>"+ rs.getCId() +"</td><td>"+ rs.getCName() +"</td></tr>");
		}
	}

}
