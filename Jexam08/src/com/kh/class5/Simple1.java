package com.kh.class5;

class Sample{
	public int age = 10;
	public String name = "홍길동";
	public static char gender = '남';
	
	{
		// 인스턴스 변수 초기화 블럭
		System.out.println("인스턴스 변수 초기화 블럭 동작!!!");
		System.out.println("초기화 전 인스턴스 변수 값");
		System.out.println("age = " + age);
		System.out.println("name = "+ name);
		age = 20;
		name = "김철수";
		System.out.println("초기화 전 인스턴스 변수 값");
		System.out.println("age = " + age);
		System.out.println("name = "+ name);
	}
	
	static {
		// 정적(클래스) 변수 초기화 블럭
		System.out.println("클래스 변수 초기화 블럭 동작!!!");
		System.out.println("초기화 전 	클래스 변수 값");
		System.out.println("gender = " + gender);
		gender = '여';
		System.out.println("초기화 전 	클래스 변수 값");
		System.out.println("gender = " + gender);
		}
	
	public Sample() {
		System.out.println("생성자 동작!!!");
		}
	}

public class Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample s1 = new Sample();
//		Sample s2 = new Sample();		

	}

}
