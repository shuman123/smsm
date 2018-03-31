package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.ProductBiz;
import com.cn.entity.Company;
import com.cn.entity.ProCommand;
import com.cn.entity.Product;

public class ProductInfoServlet extends HttpServlet {
	public ProductInfoServlet() {
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
		 int pId=Integer.parseInt(request.getParameter("pid"));
         Product product=pb.getproductbypId(pId);
         Company company=pb.getcompanybypId(pId);
         List<ProCommand> pclist=pb.showProcommand(pId);
         request.setAttribute("product",product);
         request.setAttribute("company",company);
         request.setAttribute("pclist", pclist);
         request.getRequestDispatcher("productInfo.jsp").forward(request, response);
	}

	public void init() throws ServletException {
		
	}

}
