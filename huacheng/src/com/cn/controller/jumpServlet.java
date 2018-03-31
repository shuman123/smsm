package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.Dao;
import com.cn.entity.Agriinfo;

public class jumpServlet extends HttpServlet {

	
	public jumpServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); 
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
this.doPost(request, response);
	}

Dao dao=new Dao();	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		
		int aId=(int)Math.random()*13;
		Agriinfo agriinfo=dao.getagriinfoById(aId);
		request.setAttribute("agriinfo", agriinfo);
		request.getRequestDispatcher("jump.jsp").forward(request, response);
	}

	
	public void init() throws ServletException {
		
	}

}
