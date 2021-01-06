package com.kh.example.practice4.model.vo;

public class Student{
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		this.grade = 1;
		this.classroom = 10;
		this.name = "홍길동";
		this.height = 173.5;
		this.gender = '남';
	}
	
	public void information() {
		System.out.println("학년 : " + this.grade);
		System.out.println("반 : " + this.classroom);
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("성별 : " + this.gender);
		
	}
}
