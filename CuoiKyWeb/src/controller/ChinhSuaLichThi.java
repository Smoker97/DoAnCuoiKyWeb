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

import model.LichThiGV;

@WebServlet("/ChinhSuaLichThi")
public class ChinhSuaLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChinhSuaLichThi() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			List<LichThiGV> LichThiCanSua = (List<LichThiGV>)this.getServletContext().getAttribute("LichThiCanSua");
			
			if(LichThiCanSua.size() == 0)
			{
				out.println(1);
				return;
			}
					
			Gson gson = new Gson();
            String objectToReturn = gson.toJson(LichThiCanSua);
            out.write(objectToReturn);
            out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
