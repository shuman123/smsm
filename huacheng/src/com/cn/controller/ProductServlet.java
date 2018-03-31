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
import com.cn.dao.SplitmessagePager;
import com.cn.entity.Product;
import com.cn.entity.Weather;

public class ProductServlet extends HttpServlet {
	public ProductServlet() {
		super();
	}
	public void destroy() {
		super.destroy();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         this.doPost(request, response);
	}
private final int pageSize=7; 

private WeatherBiz wb=new WeatherBiz(); 
private ProductBiz pb=new ProductBiz();

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//           List<Product> plist=pb.getAllproduct();
//           SplitmessagePager smp=new SplitmessagePager();
//		   smp.setPagelist(plist);
//		   int currentpage=smp.getCurrentPage();
//		   String how=request.getParameter("how");
//		   if(how!=null){
//			  int how1=Integer.parseInt(how);		  
//			  smp.setCurrentPage(currentpage); 
//		   }else{
//			   smp.setCurrentPage(currentpage);  
//		   }
//		   List<Product> pmlist=smp.getCurrentPageList();
//           request.setAttribute("pmlist",pmlist);
		
		//分页
		 //  int currentPage=1;
		   int rowcount=pb.getproductsrowcount();
		   int pagecount=(rowcount%this.pageSize==0)?rowcount/this.pageSize:(rowcount/this.pageSize+1);
//		   int[] pagecounts=new int[pagecount];
//		   for(int i=0;i<pagecounts.length;i++){
//			   pagecounts[i]=i+1;
//		   }	   
//		String how=request.getParameter("how");
//   	       if(how!=null){
//			  currentPage=Integer.parseInt(how);	 
//		   }
//		   int startindex=(currentPage-1)*this.pageSize;
//	   	      List<Product> pmlist=pb.getproductsbypage(startindex,this.pageSize);
//	   	      request.setAttribute("pmlist",pmlist);
//	   	      request.setAttribute("pagecounts", pagecounts);   
		   
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
		 List<Product> pmlist=pb.getproductsbypage(startindex,this.pageSize);
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
          
           request.getRequestDispatcher("product.jsp").forward(request, response);
	}

	public void init() throws ServletException {
		
	}

}
