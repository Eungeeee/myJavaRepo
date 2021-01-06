package com.kh.exam02;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		int num1, num2;
		/*
		 * num1,num2에 정수값을 입력 받은 후 num1이 num2의 배수인지 확인하는 코드
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		num2 = sc.nextInt();
		
		if(num1%num2 == 0) {
			System.out.printf("%d는 %d의 배수 입니다.", num1, num2);
		} else {
			System.out.printf("%d는 %d의 배수가 아닙니다.", num1, num2);
		}
		
		sc.close();

	}

}
