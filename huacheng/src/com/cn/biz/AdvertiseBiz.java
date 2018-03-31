package com.cn.biz;

import java.util.List;

import com.cn.dao.AdvertiseService;
import com.cn.entity.Advertise;

public class AdvertiseBiz {
private AdvertiseService as=new AdvertiseService();
public List<Advertise> getAlladvertise(){
	return as.getAlladvertise();
}
public Advertise getadvertisebyadId(int adId){
	return as.getadvertisebyadId(adId);
}
}