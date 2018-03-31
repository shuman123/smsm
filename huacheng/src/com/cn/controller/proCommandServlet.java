package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.ProductBiz;
import com.cn.entity.UserTable;

public class proCommandServlet extends HttpServlet {	
	public proCommandServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
   this.doPost(request, response);
	}

private ProductBiz pb=new ProductBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 response.setContentType("text/html;charset=gbk");
		 PrintWriter out = response.getWriter();
	     String content=new String(request.getParameter("content").getBytes("iso-8859-1"),"gbk");
	     int pid=Integer.parseInt(request.getParameter("pid"));
	     UserTable usertable=(UserTable) request.getSession().getAttribute("usertable");
	     if(usertable!=null){
	     if(pb.insertCommand(pid, content, usertable.getUserName())){
	    		out.print("<script>alert('评论成功！！！');location.replace(document.referrer);document.referrer;</script>");			  
	     }else {
	    	 out.print("<script>alert('评论失败！！！');window.history.go(-1);</script>");		
	     }}else{
	    	 out.print("<script>alert('请先登录，再评论哦！！！');window.location.href='login.jsp';</script>");
	     }
	}

	
	public void init() throws ServletException {
		
	}

}
