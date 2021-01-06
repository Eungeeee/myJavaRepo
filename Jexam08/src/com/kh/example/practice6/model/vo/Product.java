package com.kh.example.practice6.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public void information() {
		System.out.println("제품명 : " + this.pName);
		System.out.println("브랜드 : " + this.brand);
		System.out.println("가격 : " + this.price);
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
