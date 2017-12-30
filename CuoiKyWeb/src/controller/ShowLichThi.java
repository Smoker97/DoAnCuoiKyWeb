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

import model.*;
import DAO.*;


@WebServlet("/ShowLichThi")
public class ShowLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ShowLichThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		List<LichThiGV> ListLichThi = new ArrayList<LichThiGV>();
		LichThiGVDAO lichthiDao = new LichThiGVDAO();
		
		try {
			ListLichThi = (List<LichThiGV>)lichthiDao.getLichThi();
			this.getServletContext().setAttribute("ListLichThi", ListLichThi);
			
			out.println("<thead><tr><th>Môn thi</th><th>Tên đề</th><th>Thời gian bắt đầu</th><th>Thời gian kết thúc</th><th></th><th></th></tr></thead>");
			
			for(LichThiGV rs: ListLichThi)
				out.println("<tbody><tr><td>"+ rs.getSubjectName() +"</td><td>"+ rs.getTestName() +"</td><td>"+ rs.getTimeStart() +"</td><td>"+ rs.getTimeClose() +"</td><td><a href='./ChuyenTrangChinhSuaLichThi?MaDe="+ rs.getTestId() +"&MaMon="+ rs.getSubjectId() +"' style='padding: 1px 6px;color:blue' class='btn green-haze'>Chỉnh Sửa</a></td><td><a href='./XoaLichThi?MaDe="+ rs.getTestId() +"&MaMon="+ rs.getSubjectId() +"' style='padding: 1px 6px;color:blue' class='btn green-haze'>Xóa</a></td></tr></tbody>");
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
