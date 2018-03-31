package com.cn.entity;

public class Company {
      private int comId;
      private String cName;
      private String cimageUrl;
      private String cProperty;
      private String businessType;
      private String cregion;
      private String cAddress;
      private String introduce;
	public Company(int comId, String cName, String cimageUrl, String cProperty,
			String businessType, String cregion, String cAddress,
			String introduce) {
		super();
		this.comId = comId;
		this.cName = cName;
		this.cimageUrl = cimageUrl;
		this.cProperty = cProperty;
		this.businessType = businessType;
		this.cregion = cregion;
		this.cAddress = cAddress;
		this.introduce = introduce;
	}
	public Company() {
		super();
	}
	public int getComId() {
		return comId;
	}
	public void setComId(int comId) {
		this.comId = comId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCimageUrl() {
		return cimageUrl;
	}
	public void setCimageUrl(String cimageUrl) {
		this.cimageUrl = cimageUrl;
	}
	public String getcProperty() {
		return cProperty;
	}
	public void setcProperty(String cProperty) {
		this.cProperty = cProperty;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getCregion() {
		return cregion;
	}
	public void setCregion(String cregion) {
		this.cregion = cregion;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
      
}
