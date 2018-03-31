package com.cn.entity;

public class Comment1 {
	private int cId;
	private int aId;
	private String content;
	private String userName;
	private String atitle;
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
	public String getAtitle() {
		return atitle;
	}
	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}
	public Comment1(int cId, int aId, String content, String userName,
			String atitle) {
		super();
		this.cId = cId;
		this.aId = aId;
		this.content = content;
		this.userName = userName;
		this.atitle = atitle;
	}
	public Comment1() {
		super();
	}
	
}
