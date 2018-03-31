package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.ProductBiz;
import com.cn.entity.Product;
import com.cn.entity.UserTable;

public class CollectProductServlet extends HttpServlet {
	public CollectProductServlet() {
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
		 int pId=Integer.parseInt(request.getParameter("pid"));
		 Product product=pb.getproductbypId(pId);
		 UserTable usertable=(UserTable)request.getSession().getAttribute("usertable");
		 if(usertable!=null){
		 if(pb.insertCollect(product,usertable)){
			 out.print("<script>alert('收藏成功！！！');window.history.go(-1);</script>");	
		 }else{
			 out.print("<script>alert('收藏失败！！！');window.history.go(-1);</script>");	
		 }}else{
			 out.print("<script>alert('请先登录，再收藏哦！！！');window.location.href='login.jsp';</script>");
		     
		 }
		 
	
	}

	public void init() throws ServletException {
		
	}

}
