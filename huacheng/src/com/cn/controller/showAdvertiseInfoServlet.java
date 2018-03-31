package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.AdvertiseBiz;
import com.cn.entity.Advertise;



public class showAdvertiseInfoServlet extends HttpServlet {


	public showAdvertiseInfoServlet() {
		super();
	}


	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	this.doPost(request, response);
	}

private AdvertiseBiz ab=new AdvertiseBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		int adId=Integer.parseInt(request.getParameter("adId"));
		Advertise advertise=ab.getadvertisebyadId(adId);
		request.setAttribute("advertise",advertise);
		request.getRequestDispatcher("advertiseInfo.jsp").forward(request, response);
	}

	
	public void init() throws ServletException {
		
	}

}
