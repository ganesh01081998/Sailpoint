package com.example.demo.model;

public class Customer {
	private int cno;
	private String cname;
	public Customer() {
		System.out.println("Default Constructor");
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + "]";
	}
	public Customer(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	
}
