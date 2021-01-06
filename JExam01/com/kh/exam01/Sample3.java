package com.kh.exam01;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		int age = 0;
		double height = 0.0;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("벌써 " + age + "년이나 살았네요..");
		System.out.println("대박.. " + height +"cm밖에 안되시네요..");
		System.out.println("키 "+ height +"cm인 "+age+"살 "+name+ "씨 힘내세요~!");
		
		sc.close();
	}

}
