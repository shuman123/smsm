package com.cn.entity;

public class Usershow {
     private int showid;
     private String userName;
     private String nickName;
     private String sex;
     private int age;
     private String cons;
     private String job;
     private String company;
     private String school;
     private String address;
     private String interest;
     private String headimageUrl;
	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCons() {
		return cons;
	}
	public void setCons(String cons) {
		this.cons = cons;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getHeadimageUrl() {
		return headimageUrl;
	}
	public void setHeadimageUrl(String headimageUrl) {
		this.headimageUrl = headimageUrl;
	}
	public Usershow(int showid, String userName, String nickName, String sex,
			int age, String cons, String job, String company, String school,
			String address, String interest, String headimageUrl) {
		super();
		this.showid = showid;
		this.userName = userName;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.cons = cons;
		this.job = job;
		this.company = company;
		this.school = school;
		this.address = address;
		this.interest = interest;
		this.headimageUrl = headimageUrl;
	}
	public Usershow() {
		super();
	}
     
}
