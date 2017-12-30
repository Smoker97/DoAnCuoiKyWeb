package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.ThongTinCaNhanDAO;
import model.User;

@WebServlet("/ThongTinCaNhan")
public class ThongTinCaNhan extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ThongTinCaNhan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=UTF-8");
       
        PrintWriter out = response.getWriter();
        String uid = (String) request.getSession().getAttribute("uid");
		
		try {
			List<User> User = ThongTinCaNhanDAO.getThongTinCaNhan(uid);
			
			for(User rs: User)
				if(rs.getAvatar() != null)
					rs.setAvatarPath(ToImage(rs.getAvatar(), rs.getUid()));
			
			if(User == null)
			{
				System.out.println("Loi");
				return;
			}
			
			Gson gson = new Gson();
            String objectToReturn = gson.toJson(User);
            out.print(objectToReturn);
            out.flush();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String ToImage(byte[] imageBytes, String Uid) throws IOException, ClassNotFoundException {
		String path = "D:\\WEB\\CuoiKyWeb\\HinhAnh" + Uid + ".jpg";
		System.out.println(path);
		InputStream in = new ByteArrayInputStream(imageBytes);
		BufferedImage bImageFromConvert = ImageIO.read(in);
		
		ImageIO.write(bImageFromConvert, "jpg", new File(path));
		
		return path;
	}

}
