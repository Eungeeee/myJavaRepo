package com.kh.practice.point.model.vo;

public class Triangle extends Point{

	private int width;
	private int height;
	
	public Triangle() {}
	
	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + this.width + ", " + this.height;
	}
	
}
