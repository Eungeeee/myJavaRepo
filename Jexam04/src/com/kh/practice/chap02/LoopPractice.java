package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

public static Scanner sc = new Scanner(System.in);
		
	public static void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
			
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int lastN;
		lastN = sc.nextInt();
		
		for(int i = 1; lastN >= i; i++) {
			System.out.print(i+" ");
		} if(lastN < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public static void practice2() {
		/*
		 * 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * 1. 사용자 입력 받는다.
		 * 2. 입력받은 정수 값이 1 이상인지 확인
		 * 	2-1. 1 이상이 맞으면 반복 종료!
		 * 	2-2. 1 이상이 아니면 계속 반복
		 */
		
		int num = 0;
		for(;num < 1;) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
		}
		for(int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		System.out.printf("\n정상 처리 되었습니다.");

	}
	
	public static void practice3() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		int num;

		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		if(num>=1) {
			for(; num >= 1; num--) {
				System.out.print(num + " ");
			}
		}
		else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
	}
	
	public static void practice4() {
		
		/*
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		int num = 0;
		for(;num <= 0;) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num >= 1) {
				break;
			}
			System.out.println("잘못 입력했습니다. 다시 입력하세요.");
		}
		
		for(;num>0;num--) {
			System.out.print(num+" ");
		}
		System.out.printf("\n정상 처리 되었습니다.");

	}
	
	public static void practice5(){
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 * 누적합 -> 하나의 변수를 사용하여 기존 값에 새로운 값을 계속 더하고 그 결과를 해당 변수에 다시 저장
		 */
		
		int x = 0;
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num - 1; i++) {
			System.out.print(i + " + ");
			x = x + i;
		}
		x = x + num;
		System.out.println(num + " = " + x);
	}
		
	public static void practice6() {
		
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		// 1. 사용자 입력 -> 2개의 정수
		int num1, num2;
		
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		// 3. 만약 첫 번째 사용자 입력이 큰 값인 경우에 n2 부터 출력
		if(num1>=1 && num2>=1) {
			if(num1<=num2) {
			// 2. 입력받은 두 값 사이의 숫자를 출력 -> 반복문
				for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
				}
			} else {
			// 2. 입력받은 두 값 사이의 숫자를 출력 -> 반복문
				for(int i = num2; i <= num1; i++) {	
				System.out.print(i + " ");
		}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public static void practice7() {
		
		/*
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		int num1, num2;
		
		for(;;) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
		
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		
			// 3. 만약 첫 번째 사용자 입력이 큰 값인 경우에 n2 부터 출력
			if(num1>=1 && num2>=1) {
				if(num1<=num2) {
					// 2. 입력받은 두 값 사이의 숫자를 출력 -> 반복문
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				} else {
					// 2. 입력받은 두 값 사이의 숫자를 출력 -> 반복문
					for(int i = num2; i <= num1; i++) {	
						System.out.print(i + " ");
					}
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
		}
			}
		}
		
	public static void practice8() {
		
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		
		int gugu;
		
		System.out.print("숫자 : ");
		gugu = sc.nextInt();
		
		System.out.println("===== "+gugu+"단 =====");
		for(int i = 1; i <= 9; i++) {
			System.out.println(gugu + " * " + i + " = " + gugu*i);
		}
		
	}
	
	public static void practice9() {
		
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요
		 */
		
		int gugu;
		
		System.out.print("숫자 : ");
		gugu = sc.nextInt();
		
		if(gugu >= 1 && gugu <= 9) {
			for(int d = gugu; d<=9; d++) {
				System.out.println("===== "+d+"단 =====");
				
			for(int i = 1; i <= 9; i++) {
				System.out.println(d + " * " + i + " = " + d*i);
			}
				}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}
	}
	
	public static void practice10() {
		
		/*
		 * 위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		 * “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		int gugu = 0;
		
		for(;;) {
			
			System.out.print("숫자 : ");
			gugu = sc.nextInt();
			
			if(gugu<=9) {
				break; }
				System.out.println("9 이하의 숫자만 입력해주세요"); }
		
		for(int d = gugu; d<=9; d++) {
			System.out.println("===== "+d+"단 =====");
			
			for(int i = 1; i <= 9; i++) {
			System.out.println(d + " * " + i + " = " + d*i);
		}
	} 
	}
	
	public static void practice11() {
		
		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아
		 * 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		 * 단, 출력되는 숫자는 총 10개입니다.
		 */
		
		int num, tol;
		
		System.out.print("시작 숫자 : ");
		num = sc.nextInt();
		
		System.out.print("공차 : ");
		tol = sc.nextInt();
		
		for(int i = num; i < num + tol * 10; i = i + tol) {
			System.out.print(i + " ");
		}
	}
	public static void practice12() {
		
		int n1, n2, res;
		char op;	String input;
		for(;;) {
			System.out.print("연산자(+, -, *, /, %) : ");
			input = sc.next();
			
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);		// 반복문 종료가 아닌 프로그램 종료로 사용
			}
			op = input.charAt(0);	// exit 입력이 아니면 첫번째 문자 op 에 할당
			System.out.print("정수 1 :");	n1 = sc.nextInt();
			System.out.print("정수 2 :");	n2 = sc.nextInt();
			
			// 존재하지 않은 연산자를 입력하지 않은 경우 반복 종료
			if(op == '+' || op == '-' || op == '*') {
				break;
			} else if(op == '/' || op == '%') {
				if(n2 != 0) {
					break;
				}
				System.out.println("0 으로 나눌수 없습니다. 다시 입력해주세요.");
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
		res = op == '+' ? n1 + n2 : op == '-' ? n1 - n2 : op == '/' ? n1 / n2 :
			op == '*' ? n1 * n2 : n1 % n2;
		System.out.printf("%d %c %d = %d", n1, op, n2, res);
	}		
	
	public static void practice13() {
		
		System.out.print("정수 입력 : ");
		int line = sc.nextInt();

		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}	System.out.println();
		}
	}
	
	public static void practice14() {
		
		System.out.print("정수 입력 : ");
		int line = sc.nextInt();
		
		for(int i = line; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}	System.out.println();
		}
	}
	
	
public static void main(String[] args) {
//	practice1();
//	practice2();
//	practice3();
//	practice4();
//	practice5();
//	practice6();
//	practice7();
//	practice8();
//	practice9();
//	practice10();
//	practice11();
//	practice12();
//	practice13();
	practice14();
	sc.close();
	}

}
