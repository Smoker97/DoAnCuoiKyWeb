package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChuyenTrangThemDeThi")
public class ChuyenTrangThemDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChuyenTrangThemDeThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ThemDeThi.jsp").forward(request, response);
	}
}
