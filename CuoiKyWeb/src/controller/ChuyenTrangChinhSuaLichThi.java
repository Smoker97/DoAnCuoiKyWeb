package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LichThiGVDAO;
import model.DeThi;
import model.LichThiGV;

@WebServlet("/ChuyenTrangChinhSuaLichThi")
public class ChuyenTrangChinhSuaLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChuyenTrangChinhSuaLichThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String MaDe = request.getParameter("MaDe");
		String MaMon = request.getParameter("MaMon");
		List<LichThiGV> ListLichThi = new ArrayList<LichThiGV>();
		
		try {
			ListLichThi = (List<LichThiGV>)this.getServletContext().getAttribute("ListLichThi");
			List<LichThiGV>  LichThiCanSua = new ArrayList<LichThiGV>();
			
			for (LichThiGV rs : ListLichThi)
			{
				if (rs.getTestId().equals(MaDe)&&rs.getSubjectId().equals(MaMon))
				{
					LichThiCanSua.add(rs);
				}
			}
			getServletContext().setAttribute("LichThiCanSua", LichThiCanSua);	
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		this.getServletContext().getRequestDispatcher("/WEB-INF/SuaLichThi.jsp").forward(request, response);
	}
}
