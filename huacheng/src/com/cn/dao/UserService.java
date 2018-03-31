package com.cn.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.cn.entity.UserTable;
import com.cn.entity.Usershow;
public class UserService {
        private Connection con=null;
        private PreparedStatement pst=null;
        private ResultSet rs=null;
        //判断输入的注册用户名是否已经存在（若注册的用户名已存在则不能注册，若不存在则可以注册）
        public  boolean isexistsuser(String userName){
        	  try{
        		 con=DBManager.getCon();
        		 String sql="select * from userTable where userName=?";
        		 pst=con.prepareStatement(sql);
        		 pst.setString(1,userName);
        		 rs=pst.executeQuery();
        		 if(rs.next()){
        			 return false;
        		 }else{
        		 return true;
        		 }
        	  }catch(Exception e){
        		  e.printStackTrace();
        		  return false;
        	  }
        	  finally{
        		  DBManager.closeResultSet(rs);
        		  DBManager.closeStatement(pst);
        		  DBManager.closeCon(con);
        	  }
        }
        //注册用户
        public boolean getuser(String userName,String pwd,String email){
      	  try{
      		 con=DBManager.getCon();
      		 String sql="insert into userTable(userName,pwd,nickName,email,addTime,loginTime,loginNum,userState,vipLevel) values(?,?,null,?,now(),now(),0,1,null)";
      		 pst=con.prepareStatement(sql);
      		 pst.setString(1,userName);
      		 pst.setString(2,pwd);
      		 pst.setString(3,email);
      		 pst.execute();
      		 return true;
      	  }catch(Exception e){
      		  e.printStackTrace();
      		 return false;
      	  }
      	  finally{
      		  
      		  DBManager.closeStatement(pst);
      		  DBManager.closeCon(con);
      	  }
      }
        //判断登录的用户是否在用户
        public boolean isexistslogin(String userName){
        	try{
         		 con=DBManager.getCon();
         		 String sql1="select * from userTable where userName=?";
         		 pst=con.prepareStatement(sql1);
         		 pst.setString(1,userName);
         		 rs=pst.executeQuery();
         		 if(rs.next()){
         		 return true;	 
         		 }else {
         			 return false; 
         		 }
         		 
         	  }catch(Exception e){
         		  e.printStackTrace();
         		 return false;
         	  }
         	  finally{
         		  DBManager.closeCon(con);
         		  DBManager.closeStatement(pst);
         		  DBManager.closeCon(con);
         	  }
        }
        //登录时，判断登录的用户是否存在
        public UserTable login(String userName,String pwd){
        	UserTable usertable=null;
        	try{
         		 con=DBManager.getCon();
         		
         			String sql="select * from userTable where userName=? and pwd=? and userState=1";
            		pst=con.prepareStatement(sql);
            		pst.setString(1,userName);
            	    pst.setString(2,pwd);
            		rs=pst.executeQuery();
            		if(rs.next()){
            		  usertable=new UserTable(rs.getInt("userId"),rs.getString("userName"),rs.getString("pwd"),rs.getString("nickName"),rs.getString("email"),rs.getDate("addTime"),rs.getDate("loginTime"),rs.getInt("loginNum"),rs.getInt("userState"),rs.getInt("vipLevel"));
            			 
            		 } 
         		
         		 
         	  }catch(Exception e){
         		  e.printStackTrace();
         		 
         	  }
         	  finally{
         		  DBManager.closeCon(con);
         		  DBManager.closeStatement(pst);
         		  DBManager.closeCon(con);
         	  }
        	 return usertable;
        }
        
}
