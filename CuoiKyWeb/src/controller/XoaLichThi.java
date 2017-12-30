package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;
import model.*;

@WebServlet("/XoaLichThi")
public class XoaLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XoaLichThi() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String TestId = request.getParameter("MaDe");
			String SubjectId = request.getParameter("MaMon");
			
			XoaLichThiDAO xoalichthiDao = new XoaLichThiDAO();
			try {
				xoalichthiDao.XoaLichThi(TestId, SubjectId);
				
			} catch (SQLException e)
			{
				e.printStackTrace();
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			List<LichThiGV> ListLichThi = new ArrayList<LichThiGV>();
			LichThiGVDAO lichthiDao = new LichThiGVDAO();
			
			try {
				ListLichThi = (List<LichThiGV>)lichthiDao.getLichThi();
				this.getServletContext().setAttribute("ListLichThi", ListLichThi);
				
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/DanhSachLichThi.jsp").forward(request, response);
	}
}
