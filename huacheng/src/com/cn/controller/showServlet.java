package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.AdvertiseBiz;
import com.cn.biz.WeatherBiz;
import com.cn.dao.Dao;
import com.cn.entity.Advertise;
import com.cn.entity.Weather;

public class showServlet extends HttpServlet {


	public showServlet() {
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
private WeatherBiz wb=new WeatherBiz();
private AdvertiseBiz ab=new AdvertiseBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  response.setContentType("text/html;charset=gbk");
		  PrintWriter out = response.getWriter();
		  //显示天气
	      Weather defaultweather=wb.getweatherbycity("荆州");
	      List<Weather> wlist=wb.getAllweather();
		  request.setAttribute("defaultweather", defaultweather);
		  request.setAttribute("wlist", wlist);
		  //显示广告
 //		  List<Advertise> alist=ab.getAlladvertise();
 //		  request.setAttribute("alist", alist);
		  Advertise advertise1=ab.getadvertisebyadId(1);
		  Advertise advertise2=ab.getadvertisebyadId(2);
		  Advertise advertise3=ab.getadvertisebyadId(3);
		  Advertise advertise4=ab.getadvertisebyadId(4);
		  Advertise advertise5=ab.getadvertisebyadId(5);
		  request.setAttribute("advertise1", advertise1);
		  request.setAttribute("advertise2", advertise2);
		  request.setAttribute("advertise3", advertise3);
		  request.setAttribute("advertise4", advertise4);
		  request.setAttribute("advertise5", advertise5);
		  //显示农资
		  List topfiveList=dao.getTopfive();
		  request.getSession().setAttribute("topfiveList", topfiveList);
		  request.getRequestDispatcher("index.jsp").forward(request, response);
		  
		
	}

	public void init() throws ServletException {
	
	}

}
