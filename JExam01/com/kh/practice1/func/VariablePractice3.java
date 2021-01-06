package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		num1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		num2 = sc.nextDouble();
		
		System.out.println("면적 : " + (num1*num2));
		System.out.println("둘레 : " + (num1+num2)*2);
		
		sc.close();

	}

}
