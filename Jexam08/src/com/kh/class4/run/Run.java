package com.kh.class4.run;

import com.kh.class4.*;

public class Run {

	public static void main(String[] args) {
		
		Shape size = new Shape();
		size.setWidth(10);
		size.setHeight(20);
		
		System.out.println("너비 : " + size.getWidth());
		System.out.println("높이 : " + size.getHeight());

	}

}
