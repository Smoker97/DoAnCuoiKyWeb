package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChuyenTrangXemDeThi")
public class ChuyenTrangXemDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChuyenTrangXemDeThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/LoadDeThi.jsp").forward(request, response);
	}
}
