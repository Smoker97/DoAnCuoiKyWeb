package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import DAO.loginDAO;
import DB.DBConnection;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		String message = "";
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		User user = new User();
		
		user.setName(username);
		user.setPass(password);
		
		try {
			boolean kt = loginDAO.LoginMember(username, password, conn);
			String UId = String.valueOf( loginDAO.LoginUId(username, conn));
			
			if (kt) {
				//Khởi tạo đối tượng Session
				HttpSession session = request.getSession();
				// gán giá trị của userName khi đăng nhập vào username
				session.setAttribute("username", username);
				session.setAttribute("uid", UId);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/TrangChu.jsp");
				rd.forward(request, response);
				return;
			}
			boolean ktgv = loginDAO.Logingv(username, password, conn);
			String UgvId = String.valueOf( loginDAO.LoginUId(username, conn));
			
			if (ktgv) {
				//Khởi tạo đối tượng Session
				HttpSession session = request.getSession();
				// gán giá trị của userName khi đăng nhập vào username
				session.setAttribute("username", username);
				session.setAttribute("uid", UgvId);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/DanhSachCauHoi.jsp");
				rd.forward(request, response);
				return;
			}
			boolean ktad = loginDAO.Loginad(username, password, conn);
			String UadId = String.valueOf( loginDAO.LoginUId(username, conn));
			
			if (ktad) {
				//Khởi tạo đối tượng Session
				HttpSession session = request.getSession();
				// gán giá trị của userName khi đăng nhập vào username
				session.setAttribute("username", username);
				session.setAttribute("uid", UadId);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/CapNhapThongTinNguoiDung.jsp");
				rd.forward(request, response);
				return;
			}
			else {
				message = "please try again";
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
				rd.forward(request, response);
				return;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
