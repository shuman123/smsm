package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cn.entity.Company;
import com.cn.entity.ProCommand;
import com.cn.entity.ProCommand1;
import com.cn.entity.Product;
import com.cn.entity.UserTable;
public class ProductService {
	private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    //获取所有的产品大全的列表
    public List<Product> getAllproduct(){
    	  List<Product> plist=new ArrayList<Product>();
    	  try{
    		  con=DBManager.getCon();
    		  String sql="select * from product";
    		  pst=con.prepareStatement(sql);
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
    //通过产品的类型获得对应的产品列表
    public List<Product> getproductbyptypeName(String ptypeName,int startindex,int rows){
  	  List<Product> plist=new ArrayList<Product>();
  	  try{
  		  con=DBManager.getCon();
  		  String sql="select product.* from product,producttype where product.ptypeId=producttype.ptypeId and ptypeName=? limit ?,?";
  		  pst=con.prepareStatement(sql);
  		  pst.setString(1,ptypeName);
  		  pst.setInt(2, startindex);
  		  pst.setInt(3, rows);
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
  //通过产品的类型获得对应的产品列表的总行数
    public int getproductsbyptypeNamerowcount(String ptypeName){
    	int i=0;
    	try{
    		con=DBManager.getCon();
    		String sql="select count(*) from product,producttype where product.ptypeId=producttype.ptypeId and ptypeName=? ";
    		pst=con.prepareStatement(sql);
    		pst.setString(1,ptypeName);
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
    //通过产品的编号获得产品
    public Product getproductbypId(int pId){
    	  Product product=null;
    	  try{
    		  con=DBManager.getCon();
    		  String sql="select * from product where pId=?";
    		  pst=con.prepareStatement(sql);
    		  pst.setInt(1,pId);
    		  rs=pst.executeQuery();
    		  while(rs.next()){
    			  product=new Product(rs.getInt("pId"),rs.getString("pName"),rs.getDouble("price"),rs.getInt("quantity"),rs.getInt("ptypeId"),rs.getString("pimageUrl"),rs.getInt("comId"));
    		      
    		  }
    		  
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  finally{
    		  DBManager.closeResultSet(rs);
    		  DBManager.closeStatement(pst);
    		  DBManager.closeCon(con);
    	  }
    	return product;
    }
    //通过产品编号找到对应的公司
    public Company getcompanybypId(int pId){
    	Company company=null;
  	  try{
  		  con=DBManager.getCon();
  		  String sql="select * from company where comId in(select comId from product where pId=?)";
  		  pst=con.prepareStatement(sql);
  		  pst.setInt(1,pId);
  		  rs=pst.executeQuery();
  		  while(rs.next()){
  			  company =new Company(rs.getInt("comId"),rs.getString("cName"),rs.getString("cimageUrl"),rs.getString("cProperty"),rs.getString("businessType"),rs.getString("cregion"),rs.getString("cAddress"),rs.getString("introduce"));
  		  }
  		  
  	  }catch(Exception e){
  		  e.printStackTrace();
  	  }
  	  finally{
  		  DBManager.closeResultSet(rs);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
  	return company;
  }
    //在collect表中插入收藏的产品
    public boolean insertCollect(Product product,UserTable usertable){
    	try{
    		con=DBManager.getCon();
    		String sql="insert into pcollect(productId,userName) values(?,?)";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,product.getpId());
    		pst.setString(2,usertable.getUserName());
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
    //将对产品的评论插入到表中的方法
    public boolean insertCommand(int pid,String content,String userName){
    	try{
    		con=DBManager.getCon();
    		String sql="insert into pcommand(pid,content,userName) values(?,?,?)";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,pid);
    		pst.setString(2, content);
    		pst.setString(3,userName);
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
    //显示所有的用户对此产品的评论
    public List<ProCommand> showProcommand(int pid){
    	List<ProCommand> pclist=new ArrayList<ProCommand>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from pcommand where pid=?";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,pid);
    		rs=pst.executeQuery();
    		while(rs.next()){
    			ProCommand pcommand=new ProCommand(rs.getInt("cid"),rs.getInt("pid"),rs.getString("content"),rs.getString("userName"));
    		    pclist.add(pcommand);    
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
    //显示该用户的所有对产品的评论历史
    public List<ProCommand1> showProcommandbyuserName(String userName){
    	List<ProCommand1> pclist=new ArrayList<ProCommand1>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from pcommand,product where pcommand.pid=product.pId and userName=?";
    		pst=con.prepareStatement(sql);
    		pst.setString(1,userName);
    		rs=pst.executeQuery();
    		while(rs.next()){
    			ProCommand1 pcommand1=new ProCommand1(rs.getInt("cid"),rs.getInt("pid"),rs.getString("content"),rs.getString("userName"),rs.getString("pName"));
    		    
    			pclist.add(pcommand1);    
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
    //分页的方法
    public List<Product> getproductsbypage(int startindex,int rows){
    	List<Product> plist=new ArrayList<Product>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from product limit ?,?";
    		pst=con.prepareStatement(sql);
    		pst.setInt(1,startindex);
    		pst.setInt(2,rows);
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
    //得到数据库产品表中的总行数
    public int getproductsrowcount(){
    	int i=0;
    	try{
    		con=DBManager.getCon();
    		String sql="select count(*) from product";
    		pst=con.prepareStatement(sql);
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
}
