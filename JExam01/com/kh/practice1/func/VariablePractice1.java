package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		int age = 0;
		double tall = 0.0;
		String name,gender;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		tall = sc.nextDouble();
		
		System.out.println("키 "+tall+"cm인 "+age+"살 "
				+gender+"자 "+name+"님 반갑습니다.");
		
		sc.close();

	}

}
