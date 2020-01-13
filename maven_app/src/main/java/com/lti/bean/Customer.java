package com.lti.bean;

public class Customer {
	 int cId;
	 String cName;
	 double balance;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", balance=" + balance + "]";
	}
	public Customer(int cId, String cName, double balance) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.balance = balance;
	}
	 
	 

}
