package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cn.entity.Advertise;

public class AdvertiseService {
	private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    //显示所有的广告
    public List<Advertise> getAlladvertise(){
    	List<Advertise> alist=new ArrayList<Advertise>();
    	try{
   		 con=DBManager.getCon();
   		 String sql="select * from advertise";
   		 pst=con.prepareStatement(sql);
   		 rs=pst.executeQuery();
   		 while(rs.next()){
   			 Advertise advertise=new Advertise(rs.getInt("adId"),rs.getString("imageUrl"),rs.getString("title"),rs.getString("content"));
   		     alist.add(advertise);   	
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
    //显示不同的广告图片
    public Advertise getadvertisebyadId(int adId){
    	Advertise advertise=null;
    	try{
   		 con=DBManager.getCon();
   		 String sql="select * from advertise where adId=?";
   		 pst=con.prepareStatement(sql);
   		 pst.setInt(1,adId);
   		 rs=pst.executeQuery();
   		 while(rs.next()){
   			 advertise=new Advertise(rs.getInt("adId"),rs.getString("imageUrl"),rs.getString("title"),rs.getString("content"));
   		     }
   	  }catch(Exception e){
   		  e.printStackTrace();
   	  }
   	  finally{
   		  DBManager.closeResultSet(rs);
   		  DBManager.closeStatement(pst);
   		  DBManager.closeCon(con);
   	  }
    	return advertise;
    }
   
}

