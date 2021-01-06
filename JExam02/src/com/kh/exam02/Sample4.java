package com.kh.exam02;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~5) : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1을 입력하였습니다.");
			break;	// switch 문장을 종료하기 위해 사용 (반복문에서도 사용)
		case 2:
			System.out.println("2 입력하였습니다.");
			break;
		case 3:
			System.out.println("3을 입력하였습니다.");
			break;
		case 4:
			System.out.println("4를 입력하였습니다.");
			break;
		case 5:
			System.out.println("5를 입력하였습니다.");
			break;
		default:
			System.out.println("1~5를 입력하지 않았습니다.");
			
		}
		sc.close();
	}

}
