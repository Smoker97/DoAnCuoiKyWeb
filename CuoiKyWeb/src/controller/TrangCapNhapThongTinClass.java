package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TrangCapNhapThongTinClass")
public class TrangCapNhapThongTinClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TrangCapNhapThongTinClass() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/CapNhapClass.jsp").forward(request, response);

	}

}
