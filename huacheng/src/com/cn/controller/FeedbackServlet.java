package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.Dao;
import com.cn.entity.UserTable;

public class FeedbackServlet extends HttpServlet {
	public FeedbackServlet() {
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
		UserTable userTable=(UserTable) request.getSession().getAttribute("usertable");
		String fInfo=new String (request.getParameter("input").getBytes("iso-8859-1"),"gbk");
		if(userTable!=null){
			if(dao.addFeedback(userTable.getId(), fInfo)){
				out.print("<script>alert('反馈成功！！！');location.replace(document.referrer);document.referrer;</script>");			  
			     
			}else{
				 out.print("<script>alert('反馈失败！！！');window.history.go(-1);</script>");				     
			}
		}else{
			out.print("<script>alert('请先登录，再反馈哦！！！');window.location.href='login.jsp';</script>");
			   
		}
		
		
	}

	public void init() throws ServletException {
		
	}

}
