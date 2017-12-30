package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;


@WebServlet("/ChuyenTrangChinhSuaDeThi")
public class ChuyenTrangChinhSuaDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChuyenTrangChinhSuaDeThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String MaDe = request.getParameter("MaDe");
		
		try {
			List<DeThi> ListDeThi = (List<DeThi>) getServletContext().getAttribute("ListDeThi");
			
			List<DeThi> DeThiCanSua = new ArrayList<DeThi>();
			
			for (DeThi rs : ListDeThi)
			{
				if (rs.getTestId().equals(MaDe))
				{
					DeThiCanSua.add(rs);
				}
			}
			getServletContext().setAttribute("DeThiCanSua", DeThiCanSua);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ChinhSuaDeThi.jsp").forward(request, response);
		
	}
}
