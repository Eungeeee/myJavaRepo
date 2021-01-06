package com.kh.exam1;

// 도형 슈퍼 클래스
class Shape{
	public int width;
	public int height;
	
	public int getArea() {
		return width * height;
	}
}

// 사각형 서브 클래스
class Square extends Shape{
	}

// 삼각형 서브 클래스
class Triangle extends Shape{
	@Override
	public int getArea() {
		// return width * height / 2;
		return super.getArea() / 2;
		}
	}

public class Sample1 {

	public static void main(String[] args) {
		Square s = new Square();
		s.width = 10;	s.height = 20;
		System.out.println(s.getArea());
		
		Triangle t = new Triangle();
		t.width = 20;	t.height = 50;
		System.out.println(t.getArea());

	}

}
