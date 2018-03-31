package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.CollectBiz;
import com.cn.entity.UserTable;

public class usershowServlet extends HttpServlet {

	public usershowServlet() {
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
		UserTable usertable=(UserTable)request.getSession().getAttribute("usertable");
		//获取填入个人资料的数据
		String nickName=dostr(request.getParameter("nickName"));
		String sex=dostr(request.getParameter("sex"));
		String age1=request.getParameter("age");
		int age=Integer.parseInt(age1);
		String cons=dostr(request.getParameter("cons"));
		String job=dostr(request.getParameter("job"));
		String company=dostr(request.getParameter("company"));
		String school=dostr(request.getParameter("school"));
		String address=dostr(request.getParameter("address"));
		String[] interests=request.getParameterValues("interest");
	    String headimageUrl=request.getParameter("headimageUrl");
	    String interest="";
	    for(int i=0;i<interests.length;i++){
	    	interest=interest+dostr(interests[i])+"  ";
	    }
	    String userName=usertable.getUserName();
	    if(cb.isexistsusershow(userName)){
	    	if(cb.updateusershow(userName, nickName, sex, age, cons, job, company, school, address, interest)){
	    		out.print("<script>alert('保存个人资料成功！！！');window.location.href='MyagricultureServlet';</script>");	
	    	}else{
				out.print("<script>alert('保存个人资料失败！！！');window.history.go(-1);</script>");	
			}
	    }else{
		if(cb.insertusershow(usertable.getUserName(), nickName, sex, age, cons, job, company, school, address, interest, headimageUrl)){
			out.print("<script>alert('保存个人资料成功！！！');window.location.href='usershow.jsp';</script>");	
		}else{
			out.print("<script>alert('保存个人资料失败！！！');window.history.go(-1);</script>");	
		}
	    }
	}

	public void init() throws ServletException {
		
	}
	 public static String dostr(String str){
	    	String s="";
	    	try{
	    		if(str!=null){
	    			s=new String(str.getBytes("iso-8859-1"),"GBK");
	    		}
//	    		   System.out.println(new String(str.getBytes("iso-8859-1"),"gbk"));
//	        	   System.out.println(new String(str.getBytes("iso-8859-1"),"utf-8"));
//	        	   System.out.println(new String(str.getBytes("gbk"),"utf-8"));
//	        	   System.out.println(new String(str.getBytes("gbk"),"iso-8859-1"));
//	        	   System.out.println(new String(str.getBytes("utf-8"),"iso-8859-1"));
//	        	   System.out.println(new String(str.getBytes("utf-8"),"gbk"));
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	return s;
	    }
}
