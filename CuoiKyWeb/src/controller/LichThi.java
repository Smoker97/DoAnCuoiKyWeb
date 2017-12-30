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

import DAO.LichThiDAO;

@WebServlet("/LichThi")
public class LichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LichThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		PrintWriter out = response.getWriter();
		
		try {
			List<model.LichThi> dsLichThi = LichThiDAO.getLichThi(1000);
			
			if(dsLichThi == null)
			{
				System.out.println("Loi");
				return;
			}
			
			for(model.LichThi rs: dsLichThi) {
				if(rs.getInTest() == 0)
					out.println("<tr><td>"+ rs.getTName() +"</td><td>"+ rs.getDate() +"</td><td>"+ rs.getTimeStart()+"-"+ rs.getTimeClose()+ "</td><td>"+ rs.getTime_Test() + " phút" + "</td><td style='text-align: center;'>Chưa đến giờ</td></tr>");
				if(rs.getInTest() == 1)
					out.println("<tr><td>"+ rs.getTName() +"</td><td>"+ rs.getDate() +"</td><td style='color: red;'>"+ rs.getTimeStart()+"-"+ rs.getTimeClose()+ "</td><td>"+ rs.getTime_Test() + " phút" + "</td><td style='text-align: center;'>" + "<a href='" + request.getContextPath() + "/ToLamBai?TId="+ rs.getTId() + "&UId=" + rs.getUId() + "&CId=" + rs.getCId() + "&Time_Test=" + rs.getTime_Test() +"' class='btn green-haze'>Làm bài</a>" + "</td></tr>");
				if(rs.getInTest() == 2)
					out.println("<tr><td>"+ rs.getTName() +"</td><td>"+ rs.getDate() +"</td><td>"+ rs.getTimeStart()+"-"+ rs.getTimeClose()+ "</td><td>"+ rs.getTime_Test() + " phút" + "</td><td style='text-align: center;'>Đã quá giờ</td></tr>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
