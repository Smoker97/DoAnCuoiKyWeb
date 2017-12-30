package controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapNhatThongTinCaNhanDAO;

@WebServlet("/CapNhatThongTinCaNhan")
public class CapNhatThongTinCaNhan extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CapNhatThongTinCaNhan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 

		PrintWriter out = response.getWriter();		
		String Name = request.getParameter("Name");
		String Tel = request.getParameter("Tel");
		String CMND = request.getParameter("CMND");
		String Birth = request.getParameter("Birth");
		String FileHinh = request.getParameter("FileHinh");
		
		byte[] HinhAnh = readFile(FileHinh);
		
		try {
			int cmnd = Integer.valueOf(CMND);
		}catch(Exception e) {
			out.println(1);
			return;
		}
		
		try {
			CapNhatThongTinCaNhanDAO temp = new CapNhatThongTinCaNhanDAO();
			temp.capNhatThongTinCaNhan("1000", Name, Tel, CMND, Birth, HinhAnh);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] readFile(String fileHinh) {
        try {
        	byte[] imageInByte;
			BufferedImage originalImage = ImageIO.read(new File(
					fileHinh));

			// convert BufferedImage to byte array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				ImageIO.write(originalImage, "jpg", baos);
			}catch(Exception e) {}
			
			try {
				ImageIO.write(originalImage, "png", baos);
			}catch(Exception e) {}
			
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
			return imageInByte;
        } catch (IOException ex) {
            System.out.println("Không có hình");
        }
        return null;
    }
}
