package com.kh.practice.snack.view;

import java.util.Scanner;
import com.kh.practice.snack.controller.*;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		// 지역변수
		String kind, name, flavor;
		int numOf, price;
		String res;
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : "); 		kind = sc.next();
		System.out.print("이름 : "); 		name = sc.next();
		System.out.print("맛 : "); 		flavor = sc.next();
		System.out.print("개수 : "); 		numOf = sc.nextInt();
		System.out.print("가격 : "); 		price = sc.nextInt();
		
		res = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(res);
		
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
		
		switch(sc.next().charAt(0)) {
			case 'y':	case 'Y':
				System.out.println(scr.confirmData());	break;
		}
	}

}
