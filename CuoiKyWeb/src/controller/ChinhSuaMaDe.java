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

import model.DeThi;
import DAO.ChinhSuaMaDeDAO;


@WebServlet("/ChinhSuaMaDe")
public class ChinhSuaMaDe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChinhSuaMaDe() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String TestName = request.getParameter("TestName");
		String TimeTest = request.getParameter("TimeTest");
		String TestId;
		
		try {
			List<DeThi> DeThiCanSua = (List<DeThi>)getServletContext().getAttribute("DeThiCanSua");
			
			if(DeThiCanSua.size() == 0)
			{
				out.println(1);
				return;
			}
			TestId = DeThiCanSua.get(0).getTestId();
			
			ChinhSuaMaDeDAO chinhsuamadeDao = new ChinhSuaMaDeDAO();
			chinhsuamadeDao.UpdateCreateTest(TestId, TestName, TimeTest);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
