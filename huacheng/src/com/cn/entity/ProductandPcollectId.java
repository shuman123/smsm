package com.cn.entity;

public class ProductandPcollectId {
	 private int pId;
     private String pName;
     private double price;
     private int quantity;
     private int ptypeId;
     private String pimageUrl;
     private int comId;
     private int pcollectId;
	public ProductandPcollectId(int pId, String pName, double price,
			int quantity, int ptypeId, String pimageUrl, int comId,
			int pcollectId) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.ptypeId = ptypeId;
		this.pimageUrl = pimageUrl;
		this.comId = comId;
		this.pcollectId = pcollectId;
	}
	public ProductandPcollectId() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPtypeId() {
		return ptypeId;
	}
	public void setPtypeId(int ptypeId) {
		this.ptypeId = ptypeId;
	}
	public String getPimageUrl() {
		return pimageUrl;
	}
	public void setPimageUrl(String pimageUrl) {
		this.pimageUrl = pimageUrl;
	}
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public int getPcollectId() {
		return pcollectId;
	}
	public void setPcollectId(int pcollectId) {
		this.pcollectId = pcollectId;
	}
     
}
