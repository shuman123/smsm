package com.cn.entity;

import java.util.Date;

public class AgriinfoandAcollectId {
	private int aId;
	private String atitle;
	private String aimageUrl;
	private int atypeId;
	private String author;
	private Date addtime;
	private String content;
	private int acollectId;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAtitle() {
		return atitle;
	}
	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}
	public String getAimageUrl() {
		return aimageUrl;
	}
	public void setAimageUrl(String aimageUrl) {
		this.aimageUrl = aimageUrl;
	}
	public int getAtypeId() {
		return atypeId;
	}
	public void setAtypeId(int atypeId) {
		this.atypeId = atypeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAcollectId() {
		return acollectId;
	}
	public void setAcollectId(int acollectId) {
		this.acollectId = acollectId;
	}
	public AgriinfoandAcollectId(int aId, String atitle, String aimageUrl,
			int atypeId, String author, Date addtime, String content,
			int acollectId) {
		super();
		this.aId = aId;
		this.atitle = atitle;
		this.aimageUrl = aimageUrl;
		this.atypeId = atypeId;
		this.author = author;
		this.addtime = addtime;
		this.content = content;
		this.acollectId = acollectId;
	}
	public AgriinfoandAcollectId() {
		super();
	}
	
}
