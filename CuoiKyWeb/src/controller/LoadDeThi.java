package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.DeThiAllDAO;
import model.DeThi;

@WebServlet("/LoadDeThi")
public class LoadDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoadDeThi() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		List<DeThi> dethi = new ArrayList<DeThi>();	
		DeThiAllDAO dethiallDao = new DeThiAllDAO();
		
		try {
		dethi = (List<DeThi>)dethiallDao.getDeThi();
		this.getServletContext().setAttribute("ListDeThiAll", dethi);
		
		Gson gson = new Gson();
		String objectToReturn = gson.toJson(dethi);
		out.write(objectToReturn);
		out.flush();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
