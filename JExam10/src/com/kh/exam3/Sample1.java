package com.kh.exam3;

import java.util.Random;

class Shape{
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public int getArea() {
		return this.width * this.height;
	}
}
class Square extends Shape{
	public String name = "사각형";
	public String color = "빨강";
	
	public Square(int width, int height) {
		super(width, height);
	}
}
class Triangle extends Shape{
	public String name = "삼각형";
	public String size = "큰 ";
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	@Override
	public int getArea() {
		return super.getArea()/2;
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// 다형성 : 슈퍼클래스로 부터 파생된 서브클래스의 객체를 슈퍼클래스 타입 하나로 다루는 것.
		Square s = new Square(10,20);
		System.out.println("넓이 : "+s.getArea());
		
		Triangle t = new Triangle(10,20);
		System.out.println("넓이 : "+t.getArea());
		System.out.println();

		Shape p1 = new Square(10,20);
		// 업캐스팅 : 서브객체가 슈퍼객체로 자동형 변환
		//			슈퍼객체에 정의된 멤버만 참조 가능.
		//			(자식에 새롭게 정의 된 메서드나 필드에 접근 안됨)
		// 다운캐스팅 : 슈퍼객체를 통해서 서브객체를 참조할 때 슈퍼객체가 가지고 있지 않은 멤버에 접근하기 위해서
		//			 참조형을 서브객체로 변환(자동변환 안됨)
		System.out.println(((Square)p1).name + " 넓이 : "+p1.getArea());
		
		Shape p2 = new Triangle(10,20);
		System.out.println(((Triangle)p2).name + " 넓이 : "+p2.getArea());
		System.out.println();
		
		// 객체배열에 적용한 다형성
		Random rand = new Random();
		Shape[] shape = new Shape[5];
		for(int i = 0; i < shape.length; i++) {
			int w = rand.nextInt(90) + 10;
			int h = rand.nextInt(90) + 10;
			if(i % 2 == 0) {
				shape[i] = new Square(w,h);
			}else {
				shape[i] = new Triangle(w,h);
			}
		}
		for(int i = 0; i < shape.length; i++) {
			System.out.println("너비 : " + shape[i].getWidth() + "  |  높이 : " + shape[i].getHeight());
			if(shape[i] instanceof Square) {
			System.out.println(((Square)shape[i]).name + " 넓이 : " + shape[i].getArea());
			} else {
				System.out.println(((Triangle)shape[i]).name + " 넓이 : " + shape[i].getArea());
			System.out.println();
		}
	}
		if(shape[1]instanceof Square) {
			System.out.println(((Square)shape[1]).color);
		} else {
			System.out.println(((Triangle)shape[1]).size);
		}
	}
}
