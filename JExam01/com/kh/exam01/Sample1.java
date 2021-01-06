package com.kh.exam01;

public class Sample1 {

	public static void main(String[] args) {
		//	인라인 주석 : 한줄의 코드를 실행하지 않는 코드로 만든다
		/*
		 * 
		 * 	블럭주석 : 블럭단위로 주석을 생성한다.
		 *     	     여러 줄을 주석으로 처리
		 */
		
		int x,y,sum; // 변수 선언부
		final int MULTIPLE;	// 상수 생성 (문자는 대문자로)
		String s ="기차"+123+45+"칙칙폭폭";	// 문자결합
		MULTIPLE = 2;
		x = 10; y = 20; x = 30; //초기화되서 마지막 x값으로 계산!
		// MULTIPLE = 3; 상수 한 번 초기화 하면 다시 할당할 수 없다.
		sum = x + y * MULTIPLE;
		System.out.println(sum); // println -> print line
		System.out.print(s);

	}

}
