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
    //得到天气表中的所有城市的天气
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
    //通过地方城市名称获得当地的天气信息
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
