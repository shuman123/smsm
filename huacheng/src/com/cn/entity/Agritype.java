package com.cn.entity;

public class Agritype {

	private int atypeId;
	private String atypeName;
	
	public int getAtypeId() {
		return atypeId;
	}
	public void setAtypeId(int atypeId) {
		this.atypeId = atypeId;
	}
	public String getAtypeName() {
		return atypeName;
	}
	public void setAtypeName(String atypeName) {
		this.atypeName = atypeName;
	}
	public Agritype(int atypeId, String atypeName) {
		super();
		this.atypeId = atypeId;
		this.atypeName = atypeName;
	}
	public Agritype() {
		super();
	}
	
}
