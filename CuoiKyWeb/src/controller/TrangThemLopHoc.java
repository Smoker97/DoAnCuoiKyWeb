package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TrangThemLopHoc
 */
@WebServlet("/TrangThemLopHoc")
public class TrangThemLopHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TrangThemLopHoc() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ThemLopHoc.jsp").forward(request, response);
	}


}
