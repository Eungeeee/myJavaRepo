package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.*;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		boolean exit = false;
		while (true) {
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");

			switch (sc.next()) {
			case "1":
				circleMenu();	break;
			case "2":
				rectangleMenu();	break;
			case "9":
				exit = true;	break;
			default:	continue;
			}
			if (exit) {
				break;
			}
		}
	}

	public void circleMenu() {
		boolean exit = false;
		while (true) {
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");

			switch (sc.next()) {
			case "1":
				calcCircum();	break;
			case "2":
				calcCircleArea();	break;
			case "9":
				exit = true;	break;
			default:	continue;
			}
			if (exit) {
				break;
			}
		}
	}

	public void rectangleMenu() {
		boolean exit = false;
		while (true) {
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");

			switch (sc.next()) {
			case "1":
				calcPerimeter();
				break;
			case "2":
				calcRectArea();
				break;
			case "9":
				exit = true;
				break;
			default:
				continue;
			}
			if (exit) {
				break;
			}
		}
	}

	public void calcCircum() {
		int x, y, r;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		r = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, r));
	}

	public void calcCircleArea() {
		int x, y, r;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		r = sc.nextInt();
		System.out.println(cc.calcArea(x, y, r));
	}

	public void calcPerimeter() {
		int x, y, w, h;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		h = sc.nextInt();
		System.out.print("너비 : ");
		w = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, h, w));
	}

	public void calcRectArea() {
		int x, y, w, h;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		h = sc.nextInt();
		System.out.print("너비 : ");
		w = sc.nextInt();
		System.out.println(rc.calcRectArea(x, y, h, w));
	}

}
