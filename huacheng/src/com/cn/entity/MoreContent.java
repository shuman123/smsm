package com.cn.entity;

import java.util.Date;

public class MoreContent {

	private int mId;
	private String mtitle;
	private Date maddTime;
	private String mcontent;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getMtitle() {
		return mtitle;
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public Date getMaddTime() {
		return maddTime;
	}
	public void setMaddTime(Date maddTime) {
		this.maddTime = maddTime;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public MoreContent(int mId, String mtitle, Date maddTime, String mcontent) {
		super();
		this.mId = mId;
		this.mtitle = mtitle;
		this.maddTime = maddTime;
		this.mcontent = mcontent;
	}
	public MoreContent() {
		super();
	}
}
