package com.product;

public class Product {
	private int prodNo;
	private String prodDesc;
	private double prodPrice;
	public Product(int prodNo, String prodDesc, double prodPrice) {
		super();
		this.prodNo = prodNo;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
