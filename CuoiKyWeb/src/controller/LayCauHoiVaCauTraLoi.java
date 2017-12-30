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

import com.google.gson.Gson;

import DAO.LayCauHoiVaCauTraLoiDAO;
import model.CauHoi;

@WebServlet("/LayCauHoiVaCauTraLoi")
public class LayCauHoiVaCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LayCauHoiVaCauTraLoi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String tid = (String) getServletContext().getAttribute("TId");
        int TId = Integer.valueOf(tid);
		try {
			List<CauHoi> dsCauHoiVaCauTraLoi = LayCauHoiVaCauTraLoiDAO.getCauHoiVaCauTraLoi(TId);
			
			if(dsCauHoiVaCauTraLoi == null)
			{
				System.out.println("Loi");
				return;
			}
			
			Gson gson = new Gson();
            String objectToReturn = gson.toJson(dsCauHoiVaCauTraLoi);
            out.print(objectToReturn);
            out.flush();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
