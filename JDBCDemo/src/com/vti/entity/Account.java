package com.vti.entity;

import java.util.Date;



public class Account {
	
	  private int accountId;
	  private  String email;
	  private  String userName;
	  private  String FullName;
	  //Department department;//chuyen the cac FK thanh Object
	 // Position position;
	  private Date createDate;
	  private  Date birthday;
	  
	 public Account(int accountId, String userName) {
		 this.accountId = accountId;
		 this.userName = userName;
		 
	 }
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName;
	}
	  
}
