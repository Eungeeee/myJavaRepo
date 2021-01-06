package com.kh.exam02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 (1~100) : ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 100)	{
			System.out.println("올바른 입력값 입니다.");
		} else {
			System.out.println("잘못된 입력값 입니다."
					+"(1~100 사이의 값을 입력하세요.)");
		}
		sc.close();

	}

}
