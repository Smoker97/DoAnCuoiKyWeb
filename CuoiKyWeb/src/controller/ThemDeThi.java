package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;
import model.*;

@WebServlet("/ThemDeThi")
public class ThemDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThemDeThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String TestName = request.getParameter("TestName");
		String TimeTest = request.getParameter("TimeTest");
		
		String sl0 = request.getParameter("sl0");
		String ip0 = request.getParameter("ip0");
		
		String sl1 = request.getParameter("sl1");
		String ip1 = request.getParameter("ip1");
		
		String sl2 = request.getParameter("sl2");
		String ip2 = request.getParameter("ip2");
		
		String sl3 = request.getParameter("sl3");
		String ip3 = request.getParameter("ip3");
		
		String sl4 = request.getParameter("sl4");
		String ip4 = request.getParameter("ip4");
				
		try {
			ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
			themmadeDao.CreateTest(TestName, TimeTest);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int TestId;
		String testid = null;
		try {
			LayMaDeVuaThemDAO laymadevuathemDao = new LayMaDeVuaThemDAO();
			TestId = (int)laymadevuathemDao.getMaDeVuaThem();
			testid = String.valueOf(TestId);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<CauHoiTheoLoai> ListCauHoi = new ArrayList<CauHoiTheoLoai>();
		try {
			CauHoiTheoLoaiDAO cauhoitheoloaiDao = new CauHoiTheoLoaiDAO();
			ListCauHoi = cauhoitheoloaiDao.getCauHoiTheoLoai();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		List<CauHoiTheoLoai> ListCauHoiTheoLoai =  new ArrayList<CauHoiTheoLoai>();
		int itemCount = 0;
		
		if(sl0 != null && ip0 != null)
		{	
			for (CauHoiTheoLoai rs : ListCauHoi)
			{
				if (rs.getKindId().toString().trim().equals(sl0.trim()))
				{
					ListCauHoiTheoLoai.add(new CauHoiTheoLoai(rs.getQuestionId(), rs.getKindId()));
				}
			}
			int Ip0 = Integer.valueOf(ip0.trim());
			itemCount = ListCauHoiTheoLoai.size();
			
			Random rd = new Random();
			
			Vector v = new Vector();
	        int iNew = 0;
	        for (int i = 0; i < Ip0;) {
	            iNew = rd.nextInt(itemCount);
	            if (!v.contains(iNew)){
	                i++;
	                v.add(iNew);
	            }
	        }
	        
	        Vector VectorCauHoiTheoLoai = new Vector();
	        for (CauHoiTheoLoai rs : ListCauHoiTheoLoai)
			{
	        	VectorCauHoiTheoLoai.addElement(rs.getQuestionId());
			}
	                 
			for(int i = 0; i < v.size(); i++)
			{
				try {
					ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
					String temp = (String) VectorCauHoiTheoLoai.get((int) v.get(i));
					themmadeDao.CreateNoiDungTest(testid, temp);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		 ListCauHoiTheoLoai =  new ArrayList<CauHoiTheoLoai>();
		 itemCount = 0;
		if(sl1 != null && ip1 != null)
		{	
			for (CauHoiTheoLoai rs : ListCauHoi)
			{
				if (rs.getKindId().equals(sl1.trim()))
				{
					ListCauHoiTheoLoai.add(new CauHoiTheoLoai(rs.getQuestionId(), rs.getKindId()));
				}
			}
			int Ip1 = Integer.valueOf(ip1.trim());
			itemCount = ListCauHoiTheoLoai.size();
			
			Random rd = new Random();
			
			Vector v = new Vector();
	        int iNew = 0;
	        for (int i = 0; i < Ip1;) {
	            iNew = rd.nextInt(itemCount);
	            if (!v.contains(iNew)){
	                i++;
	                v.add(iNew);
	            }
	        }
	        
	        Vector VectorCauHoiTheoLoai = new Vector();
	        for (CauHoiTheoLoai rs : ListCauHoiTheoLoai)
			{
	        	VectorCauHoiTheoLoai.addElement(rs.getQuestionId());
			}
	                 
			for(int i = 0; i < v.size(); i++)
			{
				try {
					ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
					String temp = (String) VectorCauHoiTheoLoai.get((int) v.get(i));
					themmadeDao.CreateNoiDungTest(testid, temp);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		 ListCauHoiTheoLoai =  new ArrayList<CauHoiTheoLoai>();
		 itemCount = 0;
		if(sl2 != null && ip2 != null)
		{	
			for (CauHoiTheoLoai rs : ListCauHoi)
			{
				if (rs.getKindId().equals(sl2.trim()))
				{
					ListCauHoiTheoLoai.add(new CauHoiTheoLoai(rs.getQuestionId(), rs.getKindId()));
				}
			}
			int Ip2 = Integer.valueOf(ip2.trim());
			itemCount = ListCauHoiTheoLoai.size();
			
			Random rd = new Random();
			
			Vector v = new Vector();
	        int iNew = 0;
	        for (int i = 0; i < Ip2;) {
	            iNew = rd.nextInt(itemCount);
	            if (!v.contains(iNew)){
	                i++;
	                v.add(iNew);
	            }
	        }
	        
	        Vector VectorCauHoiTheoLoai = new Vector();
	        for (CauHoiTheoLoai rs : ListCauHoiTheoLoai)
			{
	        	VectorCauHoiTheoLoai.addElement(rs.getQuestionId());
			}
	                 
			for(int i = 0; i < v.size(); i++)
			{
				try {
					ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
					String temp = (String) VectorCauHoiTheoLoai.get((int) v.get(i));
					themmadeDao.CreateNoiDungTest(testid, temp);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		ListCauHoiTheoLoai =  new ArrayList<CauHoiTheoLoai>();
		itemCount = 0;
		if(sl3 != null && ip3 != null)
		{	
			for (CauHoiTheoLoai rs : ListCauHoi)
			{
				if (rs.getKindId().equals(sl3.trim()))
				{
					ListCauHoiTheoLoai.add(rs);
				}
			}
			int Ip3 = Integer.valueOf(ip3.trim());
			itemCount = ListCauHoiTheoLoai.size();
			
			Random rd = new Random();
			
			Vector v = new Vector();
	        int iNew = 0;
	        for (int i = 0; i < Ip3 + 1;) {
	            iNew = rd.nextInt(itemCount);
	            if (!v.contains(iNew)){
	                i++;
	                v.add(iNew);
	            }
	        }
	        
	        Vector VectorCauHoiTheoLoai = new Vector();
	        for (CauHoiTheoLoai rs : ListCauHoiTheoLoai)
			{
	        	VectorCauHoiTheoLoai.addElement(rs.getQuestionId());
			}
	                 
			for(int i = 0; i < v.size(); i++)
			{
				try {
					ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
					String temp = (String) VectorCauHoiTheoLoai.get((int) v.get(i));
					themmadeDao.CreateNoiDungTest(testid, temp);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		ListCauHoiTheoLoai =  new ArrayList<CauHoiTheoLoai>();
		itemCount = 0;
		if(sl4 != null && ip4 != null)
		{	
			for (CauHoiTheoLoai rs : ListCauHoi)
			{
				if (rs.getKindId().equals(sl4.trim()))
				{
					ListCauHoiTheoLoai.add(new CauHoiTheoLoai(rs.getQuestionId(), rs.getKindId()));
				}
			}
			int Ip4 = Integer.valueOf(ip4.trim());
			itemCount = ListCauHoiTheoLoai.size();
			
			Random rd = new Random();
			
			Vector v = new Vector();
	        int iNew = 0;
	        for (int i = 0; i < Ip4 + 1;) {
	            iNew = rd.nextInt(itemCount);
	            if (!v.contains(iNew)){
	                i++;
	                v.add(iNew);
	            }
	        }
	        
	        Vector VectorCauHoiTheoLoai = new Vector();
	        for (CauHoiTheoLoai rs : ListCauHoiTheoLoai)
			{
	        	VectorCauHoiTheoLoai.addElement(rs.getQuestionId());
			}
	                 
			for(int i = 0; i < v.size(); i++)
			{
				try {
					ThemDeThiDAO themmadeDao = new ThemDeThiDAO();
					String temp = (String) VectorCauHoiTheoLoai.get((int) v.get(i));
					themmadeDao.CreateNoiDungTest(testid, temp);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
