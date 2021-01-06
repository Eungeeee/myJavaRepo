package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcPerimeter(int x, int y, int h, int w) {
		int result;
		r = new Rectangle(x, y, w, h);
		result = (w + h) * 2;
		return r.toString() + " / " + result;
	}

	public String calcRectArea(int x, int y, int h, int w) {
		int result;
		r = new Rectangle(x, y, w, h);
		result = w * h;
		return r.toString() + " / " + result;
	}
}
