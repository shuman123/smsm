package com.cn.entity;

import java.util.Date;

public class UserTable {
      private int Id ;
      private String userName;
      private String pwd;
      private String nickName;
      private String email;
      private Date addTime;
      private Date loginTime;
      private int loginNum;
      private int userState;
      private int vipLevel;
	public UserTable() {
		super();
	}
	public UserTable(int id, String userName, String pwd,
			String nickName, String email, Date addTime, Date loginTime,
			int loginNum, int userState, int vipLevel) {
		super();
		Id = id;
		this.userName = userName;
		this.pwd = pwd;
		this.nickName = nickName;
		this.email = email;
		this.addTime = addTime;
		this.loginTime = loginTime;
		this.loginNum = loginNum;
		this.userState = userState;
		this.vipLevel = vipLevel;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public int getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(int loginNum) {
		this.loginNum = loginNum;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public int getVipLevel() {
		return vipLevel;
	}
	public void setVipLevel(int vipLevel) {
		this.vipLevel = vipLevel;
	}
      
}
