package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class uploadheadimageServlet extends HttpServlet{

	public uploadheadimageServlet() {
		super();
	}


	public void destroy() {
		super.destroy();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    String headimage=request.getParameter("myimage");
	   request.setAttribute("headimage",headimage);
	  request.getRequestDispatcher("Myagriculture.jsp").forward(request, response);
     }	
  
	public void init() throws ServletException {
	}

}
