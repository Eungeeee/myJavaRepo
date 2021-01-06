package com.kh.example.practice7.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		// 초기화
		this("제목", "출판사", "작가명");
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author,
			int price, double discountRate) {
		this(title,publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.println("제목 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("작가명 : " + this.author);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("할인율 : " + this.discountRate * 100 + "%");
	}

}
