package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		double a,b,c;
		int sum, avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		a = sc.nextDouble();
		
		System.out.print("영어 : ");
		b = sc.nextDouble();
		
		System.out.print("수학 : ");
		c = sc.nextDouble();
		
		sum =(int)(a+b+c);
		avg = sum/3;
		System.out.printf("총점 : %d\n평균 : %d\n",sum, avg);
		
		sc.close();
		

	}

}
