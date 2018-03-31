package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.Dao;
import com.cn.entity.Agriinfo;
import com.cn.entity.Product;
import com.cn.entity.UserTable;

public class CollectAgriinfoServlet extends HttpServlet {


	public CollectAgriinfoServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     this.doPost(request, response);
	}
private Dao dao=new Dao();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		 int aId=Integer.parseInt(request.getParameter("id"));
		 Agriinfo agriinfo=dao.getagriinfoById(aId);
		 UserTable usertable=(UserTable)request.getSession().getAttribute("usertable");
		 if(usertable!=null){
		 if(dao.insertCollect(agriinfo, usertable)){
			 out.print("<script>alert('�ղسɹ�������');window.history.go(-1);</script>");	
			 
		 }else{
			 out.print("<script>alert('�ղ�ʧ�ܣ�����');window.history.go(-1);</script>");	
			  
			 
		 }}else{
			 out.print("<script>alert('�ղ�ʧ�ܣ����ȵ�¼���ղأ�����');window.location.href='login.jsp';</script>");	
			 
		 }
		 
	}

	
	public void init() throws ServletException {
		
	}

}
