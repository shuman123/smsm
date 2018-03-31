package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.cn.entity.Agriinfo;
import com.cn.entity.AgriinfoandAcollectId;
import com.cn.entity.Product;
import com.cn.entity.ProductandPcollectId;
import com.cn.entity.UserTable;
import com.cn.entity.Usershow;

public class CollectService {
	private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    //插入个人资料的数据
    public boolean insertusershow(String userName,String nickName,String sex,int age,String cons,String job,String company,String school,String address,String interest,String headimageUrl){
    	try{
    		con=DBManager.getCon();
    		con.setAutoCommit(false);
    		String sql="insert into usershow(userName,nickName,sex,age,cons,job,company,school,address,interest,headimageUrl) values(?,?,?,?,?,?,?,?,?,?,?)";
    		pst=con.prepareStatement(sql);
    		pst.setString(1, userName);
    		pst.setString(2, nickName);
    		pst.setString(3, sex);
    		pst.setInt(4,age);
    		pst.setString(5, cons);
    		pst.setString(6, job);
    		pst.setString(7, company);
    		pst.setString(8, school);
    		pst.setString(9, address);
    		pst.setString(10, interest);
    		pst.setString(11, headimageUrl);
    		pst.execute();
    		//在插入个人资料成功的同时，还要向用户表中插入昵称的字段
    		String sql1="update usertable set nickName=? where userName=?";
    		pst=con.prepareStatement(sql1);
    		pst.setString(1,nickName);
    		pst.setString(2,userName);
    		pst.execute();
    		con.commit();
    		return true;
    		
    	}catch(Exception e){
  		  e.printStackTrace();
  		  try{
  			 con.rollback();
  		  }catch(Exception ex){
  			  ex.printStackTrace();
  		  }
  		  return false;
  		
  	  }
  	  finally{
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    }
    //先判断资料表里面有没有数据，如果有的话就更新没有的话就插入
    public boolean isexistsusershow(String userName){
    	try{
    		con=DBManager.getCon();
    		String sql="select * from usershow where userName=?";
    		pst=con.prepareStatement(sql);
    		pst.setString(1,userName);
    		rs=pst.executeQuery();
    		if(rs.next()){
    			return true;
    		}else{
    			return false;
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
    //先判断资料表里面有没有数据，如果有的话就更新
    public boolean updateusershow(String userName,String nickName,String sex,int age,String cons,String job,String company,String school,String address,String interest){
    	try{
    		con=DBManager.getCon();
    		con.setAutoCommit(false);
    		String sql="update usershow set nickName=?,sex=?,age=?,cons=?,job=?,company=?,school=?,address=?,interest=? where userName=?";
    		pst=con.prepareStatement(sql);
    		
    		pst.setString(1,nickName);
    		pst.setString(2,sex);
    		pst.setInt(3,age);
    		pst.setString(4,cons);
    		pst.setString(5,job);
    		pst.setString(6,company);
    		pst.setString(7,school);
    		pst.setString(8,address);
    		pst.setString(9, interest);
            pst.setString(10,userName);
    		pst.execute();
    		//在更新个人资料成功的同时，还要向用户表中更新昵称的字段
    		String sql1="update usertable set nickName=? where userName=?";
    		pst=con.prepareStatement(sql1);
    		pst.setString(1,nickName);
    		pst.setString(2,userName);
    		pst.execute();
    		con.commit();
    		return true;
    		
    	}catch(Exception e){
    		e.printStackTrace();
    		  try{
    			 con.rollback();
    		  }catch(Exception ex){
    			  ex.printStackTrace();
    		  }
    		  return false;
    		
  	  }
  	  finally{
  		  DBManager.closeResultSet(rs);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	
    }
    
    //显示产品收藏
    public List<Product> getproductbyuserId(UserTable usertable){
    	List<Product> plist=new ArrayList<Product>();
    	  try{
    		  con=DBManager.getCon();
    		  String sql="select product.* from product,pcollect where product.pId=pcollect.productId and pcollect.userName=?";
    		  pst=con.prepareStatement(sql);
    		  pst.setString(1,usertable.getUserName());
    		  rs=pst.executeQuery();
    		  while(rs.next()){
    			  Product product=new Product(rs.getInt("pId"),rs.getString("pName"),rs.getDouble("price"),rs.getInt("quantity"),rs.getInt("ptypeId"),rs.getString("pimageUrl"),rs.getInt("comId"));
    		      plist.add(product);
    		  }
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  finally{
    		  DBManager.closeResultSet(rs);
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
    	return plist;	
    }
    
  //根据用户得到对应他收藏的产品总行数
    public int getproductbyuser(UserTable usertable){
    	int i=0;
    	  try{
    		  con=DBManager.getCon();
    		  String sql="select count(*) from product,pcollect where product.pId=pcollect.productId and pcollect.userName=?";
    		  pst=con.prepareStatement(sql);
    		  pst.setString(1,usertable.getUserName());
    		  rs=pst.executeQuery();
    		  if(rs.next()){
    			 i=rs.getInt(1);
    		  }
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  finally{
    		  DBManager.closeResultSet(rs);
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
    	return i;	
    }
    //得到对应的用户的收藏产品的分页的方法
    public List<ProductandPcollectId> getproductscollectbypage(int startindex,int rows,UserTable usertable){
    	List<ProductandPcollectId> pclist=new ArrayList<ProductandPcollectId>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from product,pcollect where product.pId=pcollect.productId and pcollect.userName=? limit ?,?";
    		pst=con.prepareStatement(sql);
    		pst.setString(1, usertable.getUserName());
    		pst.setInt(2,startindex);
    		pst.setInt(3,rows);
    		rs=pst.executeQuery();
    		while(rs.next()){
    		ProductandPcollectId product=new ProductandPcollectId(rs.getInt("pId"),rs.getString("pName"),rs.getDouble("price"),rs.getInt("quantity"),rs.getInt("ptypeId"),rs.getString("pimageUrl"),rs.getInt("comId"),rs.getInt("pcollectId"));
		    pclist.add(product);
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  		
  	  }
  	  finally{
  		  DBManager.closeResultSet(rs);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return pclist;
    	
    }
    
    //显示农资收藏
    public List<Agriinfo> getagriinfobyuserId(UserTable usertable){
    	List<Agriinfo> alist=new ArrayList<Agriinfo>();
    	  try{
    		  con=DBManager.getCon();
    		  String sql="select agriinfo.* from agriinfo,acollect where agriinfo.aId=acollect.agriId and acollect.userName=?";
    		  pst=con.prepareStatement(sql);
    		  pst.setString(1,usertable.getUserName());
    		  rs=pst.executeQuery();
    		  while(rs.next()){
    			  Agriinfo agriinfo=new Agriinfo(rs.getInt("aId"),rs.getString("atitle"),rs.getString("aimageUrl"),rs.getInt("atypeId"),rs.getString("author"),rs.getDate("addtime"),rs.getString("content"));
  				 alist.add(agriinfo);
    		  }
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  finally{
    		  DBManager.closeResultSet(rs);
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
    	return alist;	
    }
    //显示个人资料
    public Usershow showusershow(String userName){
    	Usershow us=null;
    	try{
    		 con=DBManager.getCon();
    		 String sql="select * from usershow where userName=?";
    		 pst=con.prepareStatement(sql);
    		 pst.setString(1,userName);
    		 rs=pst.executeQuery();
    		 if(rs.next()){
    			 us=new Usershow(rs.getInt("showid"),rs.getString("userName"),rs.getString("nickName"),rs.getString("sex"),rs.getInt("age"),rs.getString("cons"),rs.getString("job"),rs.getString("company"),rs.getString("school"),rs.getString("address"),rs.getString("interest"),rs.getString("headimageUrl"));
    			 
    		 }
    	  }catch(Exception e){
    		  e.printStackTrace();
    		 
    	  }
    	  finally{
    		  DBManager.closeCon(con);
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
    	return us;
    	
    }
    
    
    //根据用户得到对应他收藏的资讯总行数
     public int getagriinforowcountbyuser(UserTable usertable){
     	int i=0;
     	try{
     		con=DBManager.getCon();
     		String sql="select count(*) from agriinfo,acollect where aId=agriId and userName=?";
     		pst=con.prepareStatement(sql);
     		pst.setString(1, usertable.getUserName());
     		rs=pst.executeQuery();
     		if(rs.next()){
     			i=rs.getInt(1);
     		}
     	}catch(Exception e){
   		  e.printStackTrace();
   		
   	  }
   	  finally{
   		  DBManager.closeResultSet(rs);
   		  DBManager.closeStatement(pst);
   		  DBManager.closeCon(con);
   	  }
     	return i;
     }
     
     //得到对应的用户的收藏资讯的分页的方法
     public List<AgriinfoandAcollectId> getagriinfocollectbypage(int startindex,int rows,UserTable usertable){
     	List<AgriinfoandAcollectId> alist=new ArrayList<AgriinfoandAcollectId>();
     	try{
     		con=DBManager.getCon();
     		String sql="select * from agriinfo,acollect where aId=agriId and userName=? limit ?,?";
     		pst=con.prepareStatement(sql);
     		pst.setString(1,usertable.getUserName());
     		pst.setInt(2,startindex);
     		pst.setInt(3,rows);
     		rs=pst.executeQuery();
     		while(rs.next()){
     			AgriinfoandAcollectId agriinfo=new AgriinfoandAcollectId(rs.getInt("aId"),rs.getString("atitle"),rs.getString("aimageUrl"),rs.getInt("atypeId"),rs.getString("author"),rs.getDate("addtime"),rs.getString("content"),rs.getInt("acollectId"));
     		    alist.add(agriinfo);
     		}
     	}catch(Exception e){
   		  e.printStackTrace();
   		
   	  }
   	  finally{
   		  DBManager.closeResultSet(rs);
   		  DBManager.closeStatement(pst);
   		  DBManager.closeCon(con);
   	  }
     	return alist;
     	
     }
     //取消资讯的收藏
     public boolean cancelagricollect(int acollectId){
    	 try{
    		 con=DBManager.getCon();
    		 String sql="delete from acollect where acollectId=?";
    		 pst=con.prepareStatement(sql);
    		 pst.setInt(1,acollectId);
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
   //取消产品的收藏
     public boolean cancelproductcollect(int pcollectId){
    	 try{
    		 con=DBManager.getCon();
    		 String sql="delete from pcollect where pcollectId=?";
    		 pst=con.prepareStatement(sql);
    		 pst.setInt(1,pcollectId);
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
     
}
