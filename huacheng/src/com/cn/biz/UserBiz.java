package com.cn.biz;

import com.cn.dao.UserService;
import com.cn.entity.UserTable;
import com.cn.entity.Usershow;


public class UserBiz {
	private UserService us=new UserService();
	public  boolean isexistsuser(String userName){
		return us.isexistsuser(userName);	
	}
	 public boolean getuser(String userName,String pwd,String email){
		 return us.getuser(userName, pwd, email);
		 
	 }
	 public UserTable login(String userName,String pwd){
		 return us.login(userName, pwd);
		 
	 }
	 public boolean isexistslogin(String userName){
		 return us.isexistslogin(userName);
	 }
}
