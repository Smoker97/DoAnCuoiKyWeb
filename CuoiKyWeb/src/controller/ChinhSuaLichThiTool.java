package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.*;
import model.LichThiGV;


@WebServlet("/ChinhSuaLichThiTool")
public class ChinhSuaLichThiTool extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ChinhSuaLichThiTool() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String TimeStart = request.getParameter("TimeBatDau");
		String TimeClose = request.getParameter("TimeClose");
		String TestId;
		String SubjectId;
		
		try {
			List<LichThiGV> LichThiCanSua = (List<LichThiGV>)this.getServletContext().getAttribute("LichThiCanSua");
			
			if(LichThiCanSua.size() == 0)
			{
				out.println(1);
				return;
			}
			
			TestId = LichThiCanSua.get(0).getTestId();
			SubjectId = LichThiCanSua.get(0).getSubjectId();
			
			ChinhSuaLichThiDAO chinhsualichthiDao = new ChinhSuaLichThiDAO();
			chinhsualichthiDao.UpdateLichThi(TestId, SubjectId, TimeStart, TimeClose);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
