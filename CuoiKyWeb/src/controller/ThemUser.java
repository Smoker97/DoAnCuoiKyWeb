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

import DAO.ThemUserDAO;
import model.Userad;

@WebServlet("/ThemUser")
public class ThemUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ThemUser() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<Userad> dsUserThemVao = (List<Userad>)getServletContext().getAttribute("dsNVThemVao");	
		for(Userad rs : dsUserThemVao) {
			try {
				ThemUserDAO temp = new ThemUserDAO();
				temp.themUser(rs.getUName(),rs.getFullName(),rs.getPass(),rs.getBirth(),rs.getCMND(),rs.getTel());
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		dsUserThemVao = new ArrayList<Userad>();
		getServletContext().setAttribute("dsNVThemVao", dsUserThemVao);
	
	}

	}

