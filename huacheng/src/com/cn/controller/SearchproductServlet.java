package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.ProductBiz;
import com.cn.biz.WeatherBiz;
import com.cn.dao.Dao;
import com.cn.entity.Product;
import com.cn.entity.Weather;

public class SearchproductServlet extends HttpServlet {
	public SearchproductServlet() {
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
	private final int pageSize=6; 
	private ProductBiz pb=new ProductBiz();
	Dao dao=new Dao();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		   String ptypeName=new String(request.getParameter("ptypeName").getBytes("iso-8859-1"),"gbk");    
	       //分页
		  // int currentPage=1;
		   int rowcount=pb.getproductsbyptypeNamerowcount(ptypeName);
		   int pagecount=(rowcount%this.pageSize==0)?rowcount/this.pageSize:(rowcount/this.pageSize+1);
//		   int[] pagecounts=new int[pagecount];
//		   for(int i=0;i<pagecounts.length;i++){
//			   pagecounts[i]=i+1;
//		   }
//		   String how=request.getParameter("how");
// 	       if(how!=null){
//			  currentPage=Integer.parseInt(how);	 
//		   }
// 	      int startindex=(currentPage-1)*this.pageSize;
// 	      List<Product> pmlist=pb.getproductbyptypeName(ptypeName,startindex,this.pageSize);
// 	      request.setAttribute("pmlist",pmlist);
// 	      request.setAttribute("pagecounts", pagecounts);
		   
		   String showpage1=request.getParameter("showpage");
	   	    if(showpage1==null){
	   	    	showpage1="1";
			}
			int showpage=Integer.parseInt(showpage1);
			
			if(showpage<1){
				showpage=1;
			}
			if(showpage>pagecount){
				showpage=pagecount;
			}
			 int startindex=(showpage-1)*this.pageSize;
			 List<Product> pmlist=pb.getproductbyptypeName(ptypeName,startindex,this.pageSize);
	 	     request.setAttribute("pmlist",pmlist);
	 	     request.setAttribute("showpage", showpage);
	 	     request.setAttribute("rowcount", rowcount);
		     request.setAttribute("pagecount", pagecount);
 	       //显示天气
           String str=request.getParameter("city");
           if(str!=null){
        	 String city=new String(str.getBytes("iso-8859-1"),"gbk");
        	 Weather weather=wb.getweatherbycity(city); 
        	 List<Weather> wlist=wb.getAllweather();
        	 request.getSession().setAttribute("weather", weather);
        	 request.setAttribute("wlist", wlist);
           }else{
        	  Weather defaultweather=wb.getweatherbycity("荆州");
     	      List<Weather> wlist=wb.getAllweather();
     		  request.setAttribute("defaultweather", defaultweather);
     		  request.setAttribute("wlist", wlist);
           }
           //显示农资
 		  List topfiveList=dao.getTopfive();
 		  request.getSession().setAttribute("topfiveList", topfiveList);

	     request.getRequestDispatcher("product.jsp").forward(request, response);
	}
	public void init() throws ServletException {	
	}
	
}
