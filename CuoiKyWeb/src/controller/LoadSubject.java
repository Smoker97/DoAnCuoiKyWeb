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

import model.*;

@WebServlet("/LoadSubject")
public class LoadSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoadSubject() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
		
        List<Subject> Subjects = (List<Subject>)getServletContext().getAttribute("Subjects");		
		if(Subjects == null)
		{
			return;
		}
		Gson gson = new Gson();
		String objectToReturn = gson.toJson(Subjects);
		out.write(objectToReturn);
		out.flush();
	}

}
