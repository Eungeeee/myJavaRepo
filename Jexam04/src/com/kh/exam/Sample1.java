package com.kh.exam;

public class Sample1 {

	public static void func1(){
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 출력");
		}
	}
	
	public static void func2(){
		int i;
		for(i = 1; i <= 5; i++) {
			System.out.println(i + "번째 출력");
		}
		System.out.println("반복문 밖에서도 i 값 확인 가능 -> " + i);
	}
	
	public static void func3(){
		int i;
		for(i = 1; i <= 5;) {
			System.out.println(i + "번째 출력");
			// 증감식 및 조건식을 잘못 작성하면 무한반복 발생 (주의!!)
			i = i + 2;	// for()문에서 증감식 부분을 생략하고 문장안에 작성 가능
		}
		System.out.println("반복문 밖에서도 i 값 확인 가능 -> " + i);
	}
	
	public static void func4(){
		// 반복문에 초기값을 생략하고 외부에 초기값 작성
		int i = 1;
		for(; i <= 5;) {
			System.out.println(i + "번째 출력");
			// 증감식 및 조건식을 잘못 작성하면 무한반복 발생 (주의!!)
			i = i + 2;	// for()문에서 증감식 부분을 생략하고 문장안에 작성 가능
		}
		System.out.println("반복문 밖에서도 i 값 확인 가능 -> " + i);
	}
	
	public static void func5(){
		// 반복문에 초기값을 생략하고 외부에 초기값 작성
		int i = 1;
		for(;;) {	// 조건식을 생략, 단 반복문 안에 종료할 수 있는 조건을 만들어야 한다. 무한반복 발생 (주의!!)
			System.out.println(i + "번째 출력");
			// 증감식 및 조건식을 잘못 작성하면 무한반복 발생 (주의!!)
			i = i + 2;	// for()문에서 증감식 부분을 생략하고 문장안에 작성 가능
			if(i>5) {
				break;
			}
		}
		System.out.println("반복문 밖에서도 i 값 확인 가능 -> " + i);
	}
	
	public static void func6(){
		/*
		 *  1~100까지의 정수값 중 홀수만 출력하는 반복문
		 */
		
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 1) {
			System.out.println(i); }
		}
		
		for(int i = 1; i<=100; i = i + 2) {
			System.out.println(i); }
		
		int i = 1;
		for(;;) {
			System.out.println(i);
			i = i + 2;
			if(i>100) {
				break;
			}
		}
	}
	
	public static void func7(){
		/*
		 *  100~1 까지의 정수값 중 짝수만 출력하는 반복문
		 */
		
		for(int i = 100; i >= 1; i--) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
		
		for(int i = 100; i >= 1; i = i - 2) {	// 반복 조건
			System.out.println(i);
		}
		
		int i = 100;
		for(;;) {
			System.out.println(i);
			i = i - 2;
			if(i < 1) { // 종료 조건
				break;
			}
		}
	}
	
	public static void func8(){
		/*
		 * 중첩 반복문1~9까지 반복 출력 구구단.
		 * 1*1=1 1*2=2 ...1*9=9
		 * .
		 * .
		 * 9*1=9 ...
		 */
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d x %d = %d\t",i,j,i*j);
			}
			System.out.print("\n"); 
		}
	}
	
	public static void main(String[] args) {
//		func1();
//		func2();
//		func3();
//		func4();
//		func5();
//		func6();
//		func7();
		func8();
	}

}
