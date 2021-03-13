package com.example.demo.model;

public class Product {
	private double price, discount, netprice;
	public Product() {
		System.out.println("Default Constructor");
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getNetprice() {
		return netprice;
	}

	public void setNetprice(double netprice) {
		this.netprice = netprice;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", discount=" + discount + ", netprice=" + netprice + "]";
	}
   
	public Product(double price, double discount, double netprice) {
		super();
		this.price = price;
		this.discount = discount;
		this.netprice = netprice;
	}

	
}
