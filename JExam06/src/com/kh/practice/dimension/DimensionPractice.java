package com.kh.practice.dimension;

import java.util.Random;

import java.util.Scanner;

public class DimensionPractice {

	public static Scanner sc = new Scanner(System.in);

	public static void practice1() {
		/*
		 * 1. 3행 3열짜리 문자열 배열을 선언 및 할당 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로
		 * 저장 후 출력하세요. (0,0)(0,1)... 행 -> i 열 -> j
		 */

		String[][] strArray = new String[3][3];

		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length; j++) {
				strArray[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void practice2() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 1 ~ 16까지 값을 차례대로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요.
		 */
		int[][] intArray = new int[4][4];
		int number = 1;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = number;
				number++;
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.printf("%3d", intArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void practice3() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요.
		 */

		int[][] intArray = new int[4][4];
		int number = 16;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = number;
				number--;
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.printf("%3d", intArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void practice4() {
		/*
		 * 1. 4행 4열 배열을 생성 2. 0행 0열부터 2행 2열까지는 난수값 저장 3. 난수값은 1~10 사이의 값으로 생성 4. 각 행의
		 * 마지막 열에는 행의 총 합을 저장 5. 각 열의 마지막 행에는 열의 총 합을 저장 6. 3행 3열에는 4번 5번에서 구한 총 합의 총 합을
		 * 저장
		 */

		int[][] intArray = new int[4][4];

		Random rand = new Random();

		// 행++
		int rowTotal = 0;
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray[i].length - 1; j++) {
				intArray[i][j] = rand.nextInt(10) + 1;
				rowTotal += intArray[i][j];
			}
			intArray[i][intArray[i].length - 1] = rowTotal;
			rowTotal = 0;
		}

		// 열++
		int colTotal = 0;
		for (int i = 0; i < intArray[0].length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				colTotal += intArray[j][i];
			}
			intArray[intArray[0].length - 1][i] = colTotal;

			// (3 , 3) 총합의 총합
			if (i == intArray[0].length - 1) {
				intArray[intArray[0].length - 1][i] *= 2; // intArray[intArray[0].length - 1][i] =
															// intArray[intArray[0].length - 1][i] * 2;
			}
			colTotal = 0;
		}

		// 출력
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void practice5() {
		/*
		 * 1. 2차 배열의 행과 열의 크기를 사용자 입력받아 생성 2. 행과 열의 크기는 1 ~ 10 사이의 정수만 받아 처리 3. 1 ~ 10
		 * 사이의 정수가 아니면 다시 입력 받기 4. 생성된 2차 배열에는 영문자 대문자로 랜덤으로 생성하여 초기화 5. 2차 배열에 초기화 완료 후
		 * 출력
		 */

		int rowSize, colSize;
		char[][] charArray;

		while (true) {
			System.out.print("행 크기 : ");
			rowSize = sc.nextInt();

			System.out.print("열 크기 : ");
			colSize = sc.nextInt();

			if (rowSize >= 1 && rowSize <= 10 && colSize >= 1 && colSize <= 10) {
				break;
			}
			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}

		charArray = new char[rowSize][colSize];
		Random rand = new Random();
		
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray[i].length; j++) {
				charArray[i][j] = (char)(rand.nextInt(26) + 65);
			}
		}
		
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray[i].length; j++) {
				System.out.print(charArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void practice6() {
		/*
		 * 주어진 문자열 배열을 이용하여 주어진 형태로 출력.
		 */
		String[][]strArray = new String[][] {
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "!", "더", "!! "}
		};
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void practice7() {
		/*
		 * 1. 행의 크기를 사용자 입력으로 받기
		 * 2. 입력 받은 행의 크기만큼 반복하여 열의 크기도 사용자 입력 받기
		 * 
		 * 행의 크기 : 4
		 * 0행의 열 크기 : 2
		 * 1행의 열 크기 : 6
		 * 2행의 열 크기 : 3
		 * 3행의 열 크기 : 5
		 * ab
		 * cdefgh
		 * ijk
		 * lmnop
		 */
		
		int rowSize, colSize;
		char[][]charArray;
		
		System.out.print("행의 크기 : ");
		rowSize = sc.nextInt();
		
		charArray = new char[rowSize][];
		
		for(int i = 0; i < rowSize; i++) {
			System.out.print(i + "열의 크기 : ");
			colSize = sc.nextInt();
			charArray[i] = new char[colSize];
		}
		
		int number = 0;
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray[i].length; j++) {
				charArray[i][j] = (char)(97 + (number % 26));
				number++;
				System.out.print(charArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void practice8() {
		/*
		 * 1. 1차배열에 12명의 학생들을 출석부 순으로 초기화
		 * 2. 2열 3행으로 2차 배열 2개를 이용하여 분단을 나눈다
		 * 3. 1분단 왼쪽부터 오른쪽 방향으로 0행에서 1행 순으로 자리배치
		 * 
		 * 결과
		 * ==1 분단==
		 * 강건강	남나나
		 * 도대담	류라라
		 * 문미미	박보배
		 * ==2 분단==
		 * 송성실	윤예의
		 * 진재주	차천축
		 * 피풍표 홍하하
		 * 
		 * 추가 미션 -> 3차 배열을 이용한 코드로도 작성하시오.
		 */

	}

	public static void practice9() {

	}

	public static void practice10() {

	}

	public static void practice11() {

	}

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
		practice7();
//		practice8();
//		practice9();
//		practice10();
//		practice11();

	}

}
