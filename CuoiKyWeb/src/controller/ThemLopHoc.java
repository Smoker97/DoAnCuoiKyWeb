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

import DAO.ThemLopHocDAO;
import model.LopHoc;


@WebServlet("/ThemLopHoc")
public class ThemLopHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ThemLopHoc() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<LopHoc> dsClassThemVao = (List<LopHoc>)getServletContext().getAttribute("dsLopThemVao");	
		for(LopHoc rs : dsClassThemVao) {
			try {
				ThemLopHocDAO temp = new ThemLopHocDAO();
				temp.themLopHoc(rs.getCId(),rs.getCName());
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		dsClassThemVao = new ArrayList<LopHoc>();
		getServletContext().setAttribute("dsLopThemVao", dsClassThemVao);
	
	}


}
