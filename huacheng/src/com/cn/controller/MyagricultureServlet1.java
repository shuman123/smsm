package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyagricultureServlet1 extends HttpServlet {


	public MyagricultureServlet1() {
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
		if(request.getSession().getAttribute("usertable")!=null){
			request.getRequestDispatcher("MyagricultureServlet").forward(request, response);
		}else {
			out.print("<script>alert('对不起，请您先登录，再查看我的农资！！！');window.location.href='login.jsp';</script>");	
	    	
		}
	}

	public void init() throws ServletException {
		
	}

}
