package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cn.entity.Weather;

public class WeatherService {
	private Connection con=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    //�õ��������е����г��е�����
    public List<Weather> getAllweather(){
    	List<Weather> wlist=new ArrayList<Weather>();
    	try{
    		con=DBManager.getCon();
    		String sql="select * from weather";
    		pst=con.prepareStatement(sql);
    		rs=pst.executeQuery();
    		while(rs.next()){
    		 Weather weather =new Weather(rs.getInt("wId"),rs.getString("city"),rs.getInt("temperature"),rs.getString("wImageUrl"),rs.getInt("maxTemparature"),rs.getInt("minTemparature"),rs.getInt("wetLevel"),rs.getInt("ultraviolet"));
    		 wlist.add(weather);
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  	  }
  	  finally{
  		  DBManager.closeResultSet(rs);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return wlist;
    	
    	
    	
    	
    }
    //ͨ���ط��������ƻ�õ��ص�������Ϣ
    public Weather getweatherbycity(String city){
    	Weather weather=null;
    	try{
    		con=DBManager.getCon();
    		String sql="select * from weather where city=?";
    		
    		pst=con.prepareStatement(sql);
    		pst.setString(1,city);
    		rs=pst.executeQuery();
    		while(rs.next()){
    			weather =new Weather(rs.getInt("wId"),rs.getString("city"),rs.getInt("temperature"),rs.getString("wImageUrl"),rs.getInt("maxTemparature"),rs.getInt("minTemparature"),rs.getInt("wetLevel"),rs.getInt("ultraviolet"));
    		}
    	}catch(Exception e){
  		  e.printStackTrace();
  	  }
  	  finally{
  		  DBManager.closeResultSet(rs);
  		  DBManager.closeStatement(pst);
  		  DBManager.closeCon(con);
  	  }
    	return weather;

    }
}
