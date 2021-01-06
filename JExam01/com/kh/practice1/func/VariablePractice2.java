package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
//		int x,y,sum,min,mul,div;
//		x=23; y=7;
//		System.out.printf("첫 번째 정수 : %d\n두 번째 정수 : %d\n", x, y);
//		sum = x+y; min = x-y; mul = x*y; div = x/y;
//		System.out.println("더하기 결과 : "+sum);
//		System.out.println("빼기 결과 : "+min);
//		System.out.println("곱하기 결과 : "+mul);
//		System.out.println("나누기 결과 : "+div);
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + num1 + num2);
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 결과 : " + num1 / num2);
		
		sc.close();
	}

}
