package com.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.biz.UserBiz;
import com.cn.entity.UserTable;

public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public registerServlet() {
		super();
	}
	public void destroy() {
		super.destroy();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          this.doPost(request, response);
	}
private UserBiz ub=new UserBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 response.setContentType("text/html;charset=gbk");
		 PrintWriter out = response.getWriter();
         String userName=request.getParameter("userName");
         String pwd=request.getParameter("pwd");
         String email=request.getParameter("email");
         if(ub.isexistsuser(userName)){
        	if(ub.getuser(userName, pwd, email)){
        		UserTable usertable=ub.login(userName,pwd);
        		if(usertable!=null){
        			request.getSession().setAttribute("usertable", usertable);
        			out.print("<script>alert('ע��ɹ�������');window.location='index.jsp'</script>");		
        		}else{
               	 out.print("<script>alert('ע��ʧ�ܣ�����');window.location='register.jsp'</script>");	
                }
        		}else{
               	 out.print("<script>alert('ע��ʧ�ܣ�����');window.location='register.jsp'</script>");	
                }	 
         }else{
        	 out.print("<script>alert('���û����Ѵ��ڣ������������û���������');window.location='register.jsp'</script>");	
         }
	}


	public void init() throws ServletException {
		
	}

}
