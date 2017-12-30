package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoiMatKhauDAO;
import DAO.LuuKetQuaLamBaiDAO;

@WebServlet("/LuuKetQuaLamBai")
public class LuuKetQuaLamBai extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LuuKetQuaLamBai() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		PrintWriter out = response.getWriter();		
		
		String True_Answer =  request.getParameter("True_Answer");
		String Answer_Size = request.getParameter("Answer_Size");
		String tid = (String) getServletContext().getAttribute("TId");
        int TId = Integer.valueOf(tid);
        String uid = (String) getServletContext().getAttribute("UId");
        int UId = Integer.valueOf(uid);
        String cid = (String) getServletContext().getAttribute("CId");
        int CId = Integer.valueOf(cid);
        
        try {
			LuuKetQuaLamBaiDAO temp = new LuuKetQuaLamBaiDAO();
			int a = 0;
			a =  temp.LuuKetQuaLamBai(Integer.valueOf(True_Answer), Integer.valueOf(Answer_Size), TId, UId, CId);
			out.print(a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
