package com.kh.exam;

public class Sample1 {
	public static void func1() {
		// 개행이 없는 출력
		System.out.print("문자열 출력" + 1);
		System.out.print("문자열 출력" + 2);
		System.out.print("문자열 출력" + 3);
	}
	
	public static void func2() {
		// 개행이 있는 출력
		System.out.println("문자열 출력" + 1);
		System.out.println("문자열 출력" + 2);
		System.out.println("문자열 출력" + 3);
	}
	
	public static void func3() {
		// 문자, 문자열 구분
		// 문자는 작은따옴표(홑따옴표)를 사용한다. -> '
		// 문자열은 큰따옴표(쌍따옴표)를 사용한다. -> "
		char c1 = 'c'; 		// 잘못된 사용 -> char c2 = "c";
		String s1 = "c";	// 잘못된 사용 -> String s2 = 'c';
	}
	
	public static void func4() {
		// 문자, 문자열 비교
		// 기본적으로 비교연산은 동일한 자료형에 대해 올바르게 비교를 한다.
		// 문자 == 문자열 비교를 제대로 수행하지 못한다.
		// 올바른 비교 -> 문자 == 문자				값 자체가 저장
		// 올바른 비교 -> 문자열.equals("문자열");	참조값 저장
		char c1 = 'c';			char c2 = 'c';
		String s1 = "s";		String s2 = "s";
		System.out.println(c1 == c2);
		System.out.println(s1.equals(s2));
		
	}
	
	public static void func5() {
		int num = 13;
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		} else {
			System.out.println(num + "은 홀수 입니다.");
		}
	}
	
	public static void func6() {
		int num = 21;
		
		if(num % 7 == 0) {
			System.out.println(num + "은 7의 배수 입니다.");
		} else {
			System.out.println(num + "은 7의 배수가 아닙니다.");
		}
	}
	
	public static void func7() {
		/*
		 *  성적 점수에 대한 구분
		 *  90 점 이상 ~ 100 점 이하		A 등급
		 *  80 점 이상 ~ 90 점 미만			B 등급
		 *  70 점 이상 ~ 80 점 미만			C 등급
		 *  60 점 이상 ~ 70 점 미만			D 등급
		 *  50 점 이상 ~ 60 점 미만			E 등급
		 *  0 점 이상 ~ 50 점 미만			F 등급
		 */
//		int jumsu = 94;
//		
//		if(jumsu / 10 >= 9) {
//			System.out.println("A 등급 입니다.");
//		} else if(jumsu / 10 == 8) {
//			System.out.println("B 등급 입니다.");
//		} else if(jumsu / 10 == 7) {
//			System.out.println("C 등급 입니다.");
//		} else if(jumsu / 10 == 6) {
//			System.out.println("D 등급 입니다.");
//		} else if(jumsu / 10 == 5) {
//			System.out.println("E 등급 입니다.");
//		} else if(jumsu / 10 <= 4) {
//			System.out.println("F 등급 입니다.");
//		}
		
		int jumsu = 94;
		
		switch(jumsu / 10) {
			case 10:	case 9:
				System.out.println("A 등급입니다.");	break;
			case 8:
				System.out.println("B 등급입니다.");	break;
			case 7:
				System.out.println("C 등급입니다.");	break;
			case 6:
				System.out.println("D 등급입니다.");	break;
			case 5:
				System.out.println("E 등급입니다.");	break;
			case 4:		case 3:		case 2:		case 1:		case 0:
				System.out.println("F 등급입니다.");	break;
		}
	}
	
	public static void func8() {
		int num = 5;
		char op = '.';	// 초기화를 하지 않을 경우 마지막 줄에서 에러 발생
		// if 문에 else 구분이 생략되어 있기 때문에 op가 초기화 되지 않을
		// 수 있기 때문에 에러.
		
		if(num == 1) {
			op = '+';
		} else if(num == 2) {
			op = '-';
		} else if(num == 3) {
			op = '*';
		} else if(num == 4) {
			op = '/';
		}
		
		System.out.println(num + " " + op + " " + num);
	}
	
	public static void func9() {
		int num = 4;
		
		switch(num) {
			case 1:
				System.out.println("case 1 출력");
				break;
			case 2:
				System.out.println("case 2 출력");
				break;
			case 3:
				System.out.println("case 3 출력");
				break;
			default:
				System.out.println("default 출력");
		}
	}
	
	public static void func10() {
		int num = 0;
		while(true) {
			System.out.println(num);
			
			if(num % 3 == 0) {
				num = num + 2;
				continue;
			}
			num = num + 1;
			if(num >= 100) {
				break;
			}
		}
	}
	
	public static void func11() {
		// 10번 반복
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번");
		}
		
		// 10번 반복(배열 인덱싱)
		for(int i = 0; i <= 10 - 1; i++) {
			System.out.println(i + "번");
		}
		
		// 10번 반복(배열 인덱싱)
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func11();
		func10();
		func9();
		func8();
		func7();
		// func6();
		// func5();
		// func4();
		// func3();
		// func2();
		// func1();
	}

}
