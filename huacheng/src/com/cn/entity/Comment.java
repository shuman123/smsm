package com.cn.entity;

public class Comment {
	private int cId;
	private int aId;
	private String content;
	private String userName;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Comment(int cId, int aId, String content,String userName) {
		super();
		this.cId = cId;
		this.aId = aId;
		this.content = content;
		this.userName = userName;
	}
	public Comment() {
		super();
	}
	

}
