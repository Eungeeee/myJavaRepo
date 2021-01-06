package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		c = sc.next().charAt(0);	// string
		
		System.out.println(c+" unicode : "+(int)c);
		
		sc.close();
		

	}

}
