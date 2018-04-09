package com.cn.biz;

import java.util.List;

import com.cn.dao.WeatherService;
import com.cn.entity.Weather;

public class WeatherBiz {
	private WeatherService ws=new WeatherService();
	public Weather getweatherbycity(String city){
		return ws.getweatherbycity(city);
		
	}
	public List<Weather> getAllweather(){
		return ws.getAllweather();
	}
}
