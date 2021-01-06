package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcCircum(int x, int y, int r) {
		double result;
		c = new Circle(x, y, r);
		result = 3.14 * r * 2;
		return c.toString() + " / " + result;
	}
	
	public String calcArea(int x, int y, int r) {
		double result;
		c = new Circle(x, y, r);
		result = 3.14 * r * r;
		return c.toString() + " / " + result;
	}

}
