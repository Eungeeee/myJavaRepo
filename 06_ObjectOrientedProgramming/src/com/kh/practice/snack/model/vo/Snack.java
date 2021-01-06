package com.kh.practice.snack.model.vo;

public class Snack {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
		
	}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;		this.numOf = numOf;
		this.name = name;		this.price = price;
		this.flavor = flavor;
	}
	
	public String information() {
		// 빵(케이크 - 블루베리) 1개 15000원
		return kind + "(" + name + " - " + flavor + ") "+ numOf + "개 "+ price + "원";
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
