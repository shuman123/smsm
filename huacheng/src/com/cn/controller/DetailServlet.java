package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.dao.Dao;
import com.cn.entity.Agriinfo;
import com.cn.entity.Comment;
import com.cn.entity.Comment1;
import com.cn.entity.UserTable;

public class DetailServlet extends HttpServlet {

	public DetailServlet() {
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
		int aId=Integer.parseInt(request.getParameter("id"));
		Agriinfo agriinfo=dao.getagriinfoById(aId);
		request.setAttribute("agriinfo", agriinfo);
		
		List<Comment> commentList=dao.getCommentById(aId);
		request.setAttribute("commentList", commentList);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

	public void init() throws ServletException {
		
	}

}
