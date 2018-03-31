package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class logincollectServlet1 extends HttpServlet {


	public logincollectServlet1() {
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
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		out.print("<script>alert('Äú»¹Ã»µÇÂ¼£¬ÇëÏÈµÇÂ¼£¬Ð»Ð»£¡£¡£¡');window.location.href='login.jsp';</script>");	
    	
	}

	public void init() throws ServletException {
		
	}

}
