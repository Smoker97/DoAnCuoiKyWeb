package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.KiemTraSoLanThiDAO;

@WebServlet("/ToLamBai")
public class ToLamBai extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ToLamBai() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().setAttribute("TId", request.getParameter("TId"));
		getServletContext().setAttribute("UId", request.getParameter("UId"));
		getServletContext().setAttribute("CId", request.getParameter("CId"));
		getServletContext().setAttribute("Time_Test", request.getParameter("Time_Test"));
		
		int solanlambai = 0;
		
		try {
			solanlambai = KiemTraSoLanThiDAO.kiemTraSoLanThi(Integer.valueOf(request.getParameter("UId")), Integer.valueOf(request.getParameter("CId")), Integer.valueOf(request.getParameter("TId")));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(solanlambai == 0)
			this.getServletContext().getRequestDispatcher("/WEB-INF/LamBaiThi.jsp").forward(request, response);
		else
			this.getServletContext().getRequestDispatcher("/WEB-INF/LichThi.jsp").forward(request, response);
	}

}
