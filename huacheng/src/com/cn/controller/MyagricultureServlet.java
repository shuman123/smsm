package com.cn.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.CollectBiz;
import com.cn.biz.ProductBiz;
import com.cn.dao.Dao;
import com.cn.entity.Agriinfo;
import com.cn.entity.AgriinfoandAcollectId;
import com.cn.entity.Comment1;
import com.cn.entity.ProCommand;
import com.cn.entity.ProCommand1;
import com.cn.entity.Product;
import com.cn.entity.ProductandPcollectId;
import com.cn.entity.UserTable;
import com.cn.entity.Usershow;

public class MyagricultureServlet extends HttpServlet {
	public MyagricultureServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); 
	}
	private final int pageSize=5; 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       this.doPost(request, response);
	}
	Dao dao=new Dao();
	private CollectBiz cb=new CollectBiz();
	private ProductBiz pb=new ProductBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		 response.setContentType("text/html;charset=gbk");
		 PrintWriter out= response.getWriter();
		 UserTable usertable=(UserTable)request.getSession().getAttribute("usertable");
		
		 //收藏显示产品信息
		//List<Product> plist=cb.getproductbyuserId(usertable);
           
		 int rowcount1=cb.getproductbyuser(usertable);
		 int pagecount1=(rowcount1%this.pageSize==0)?rowcount1/this.pageSize:(rowcount1/this.pageSize+1);
		 String showpage2=request.getParameter("showpage1");
	   	    if(showpage2==null){
	   	    	showpage2="1";
			}
			int showpage1=Integer.parseInt(showpage2);
			
			if(showpage1<1){
				showpage1=1;
			}
			if(showpage1>pagecount1){
				showpage1=pagecount1;
			}
		int startindex1=(showpage1-1)*this.pageSize;
		List<ProductandPcollectId> pcolist=cb.getproductscollectbypage(startindex1,this.pageSize, usertable);
	 	 request.setAttribute("pcolist",pcolist);
	 	 request.setAttribute("showpage1", showpage1);
	 	 request.setAttribute("rowcount1", rowcount1);
		 request.setAttribute("pagecount1", pagecount1);
		
		//收藏显示农资信息
		// List<Agriinfo> alist=cb.getagriinfobyuserId(usertable);
		 int rowcount=cb.getagriinforowcountbyuser(usertable);
		 int pagecount=(rowcount%this.pageSize==0)?rowcount/this.pageSize:(rowcount/this.pageSize+1);
		 String showpages=request.getParameter("showpage");
	   	    if(showpages==null){
	   	    	showpages="1";
			}
			int showpage=Integer.parseInt(showpages);
			
			if(showpage<1){
				showpage=1;
			}
			if(showpage>pagecount){
				showpage=pagecount;
			}
		int startindex=(showpage-1)*this.pageSize;
		List<AgriinfoandAcollectId> alist=cb.getagriinfocollectbypage(startindex, this.pageSize, usertable);
	 	 request.setAttribute("alist",alist);
	 	 request.setAttribute("showpage", showpage);
	 	 request.setAttribute("rowcount", rowcount);
		 request.setAttribute("pagecount", pagecount);
 
		//显示个人资料
		Usershow usershow=cb.showusershow(usertable.getUserName());
		request.setAttribute("usershow", usershow);
		//显示产品评论的信息
		List<ProCommand1> pclist=pb.showProcommandbyuserName(usertable.getUserName());
		request.setAttribute("pclist", pclist);
		//显示农资评论的信息
		List<Comment1> aclist=dao.showCommentByuserName(usertable.getUserName());
		request.setAttribute("aclist", aclist);
		request.getRequestDispatcher("Myagriculture.jsp").forward(request, response);
	    
		
	}

	public void init() throws ServletException {
	
	}
	
}
