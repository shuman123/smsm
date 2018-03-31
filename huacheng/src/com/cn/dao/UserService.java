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
        //�ж������ע���û����Ƿ��Ѿ����ڣ���ע����û����Ѵ�������ע�ᣬ�������������ע�ᣩ
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
        //ע���û�
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
        //�жϵ�¼���û��Ƿ����û�
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
        //��¼ʱ���жϵ�¼���û��Ƿ����
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
