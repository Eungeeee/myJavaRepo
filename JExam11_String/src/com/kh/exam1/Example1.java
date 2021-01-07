package com.kh.exam1;

import java.util.Scanner;

/*
 *  사용자 입력을 받아서 프로그램을 계속 동작할 것인지 아니면 중단을 할 것인지를 yes 또는 no로
 *  입력을 받아서 구분을 하시오.
 *  단, 사용자가 yes 또는 YES (no 또는 NO도 마찬가지) 를 입력해도 동일한 문자열로 인식이 되도록 한다.
 */

public class Example1 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 프로그램이 실행 중입니다. 를 한 번 출력 후에 "계속 실행하시겠습니까? (yes/no)"로
		// 사용자 입력을 받는다. yes면 프로그램이 실행중입니다. 출력
		// no면 프로그램을 종료합니다. 출력 후 종료
		String Answer;

		while (true) {
			System.out.print("프로그램이 실행중입니다.\n계속 실행하시겠습니까? (yes / no) : ");
			Answer = sc.next();
			if (Answer.equalsIgnoreCase("no")) {
				System.out.print("프로그램을 종료합니다.");
				System.exit(0);
			} else if (Answer.equalsIgnoreCase("yes")) {
				continue;
			}
		}
	}

}
