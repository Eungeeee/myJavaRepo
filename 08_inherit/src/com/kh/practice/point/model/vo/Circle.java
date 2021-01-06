package com.kh.practice.point.model.vo;

public class Circle extends Point{
	public static final double PI = 3.14;
	private int radius;
	
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
//	//@Override : 실제로 오버라이드가 되는 메서드인지 검사
//	@Override
//	public int areaInt() {
//		return (int)PI * radius * radius;
//	}
//	@Override
//	public double areaDouble() {
//		return PI * radius * radius;
//	}
//	@Override
//	public int roundInt() {
//		return 2 * (int)PI * radius;
//	}
//	@Override
//	public double roundInt() {
//		return 2 * PI * radius;
//	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + this.radius;
	}
}
