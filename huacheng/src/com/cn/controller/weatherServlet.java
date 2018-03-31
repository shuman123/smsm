package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.WeatherBiz;
import com.cn.entity.Weather;

public class weatherServlet extends HttpServlet {
	public weatherServlet() {
		super();
	}
	public void destroy() {
		super.destroy();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          this.doPost(request, response);
	}
	
    private WeatherBiz wb=new WeatherBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   String city=new String(request.getParameter("city").getBytes("iso-8859-1"),"gbk");
           Weather weather=wb.getweatherbycity(city);
           request.getSession().setAttribute("weather", weather);
           request.getRequestDispatcher("index.jsp").forward(request, response);    
	}

	public void init() throws ServletException {
		
	}

}
