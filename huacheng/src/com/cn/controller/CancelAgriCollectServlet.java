package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.CollectBiz;

public class CancelAgriCollectServlet extends HttpServlet {

	public CancelAgriCollectServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
this.doPost(request, response);
	}

	private CollectBiz cb=new CollectBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		
		int acollectId=Integer.parseInt(request.getParameter("acollectId"));
		if(cb.cancelagricollect(acollectId)){
			 out.print("<script>alert('取消资讯收藏成功！！！');location.replace(document.referrer);document.referrer;</script>");		
		}else{
			 out.print("<script>alert('取消资讯收藏失败！！！');location.replace(document.referrer);document.referrer;</script>");	
			  
			 
		 }
		
	}

	
	public void init() throws ServletException {
		
	}

}
