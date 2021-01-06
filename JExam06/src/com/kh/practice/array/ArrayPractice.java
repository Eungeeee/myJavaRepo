package com.kh.practice.array;

import java.util.Scanner;
import java.util.Random;

public class ArrayPractice {

	public static Scanner sc = new Scanner(System.in);

	public static void practice1() {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */

		int[] arr = new int[10];

		// 1~10까지의 값을 저장하기 위해 i 변수 활용
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void practice2() {
		/*
		 * 길이가 10인 배열을 선언하고 1~10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 저장 후 그 값을 출력
		 */
		int[] arr = new int[10];
		int num = 10;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */

		int arrSize;

		while (true) {
			System.out.print("양의 정수 : ");
			arrSize = sc.nextInt();
			if (arrSize > 0) {
				break;
			}
		}

		int[] arrVar = new int[arrSize];

		// 배열에 1 ~ 사용자 입력 값 까지 초기화
		for (int i = 0; i < arrVar.length; i++) {
			arrVar[i] = i + 1;
		}

		// 출력
		for (int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i] + " ");
		}
	}

	public static void practice4() {
		/*
		 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을
		 * 출력하세요.
		 */

		String[] strArr1 = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(strArr1[1]);

		for (int i = 0; i < strArr1.length; i++) {
			if ("귤".equals(strArr1[i])) {
				System.out.println("위치 값 -> " + i + "\t문자열 -> " + strArr1[1]);
			}
		}
	}

	public static void practice5() {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를
		 * 출력하세요.
		 */
		String word;
		char c;
		int count = 0;
		char[] chArr;

		System.out.print("문자열 : ");
		word = sc.next();

		System.out.print("문자 : ");
		c = sc.next().charAt(0);

		// 문자열의 길이 만큼 문자배열 생성
		chArr = new char[word.length()];

		// 문자열의 인덱스와 문자배열의 인덱스를 활용하여
		// 문자열의 문자를 문자배열에 복사
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = word.charAt(i);
		}
		System.out.print(word + "에 " + c + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < chArr.length; i++) {
			if (c == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}

//		for(int i = 0; i < word.length(); i++) {
//			System.out.print(chArr[i]); {
//			}
//		}
		System.out.println("\n" + c + " 개수 : " + count);
	}

	public static void practice6() {
		/*
		 * “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 * 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		 * 
		 * 활용 -> 1 ~ 31 까지의 일자값을 입력받아 그에 대응하는 요일 출력
		 */

		int day;
		String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		while (true) {
			System.out.print("1 ~ 31사이 숫자 입력 : ");
			day = sc.nextInt();
			if (day >= 1 && day <= 31) {
				break;
			}
			System.out.println("잘못 입력하였습니다.");
		}

		System.out.println(week[day % 7]);
	}

	public static void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */

		int arrSize, total;
		int[] arrVar;

		System.out.print("정수 : ");
		arrSize = sc.nextInt();

		arrVar = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arrVar[i] = sc.nextInt();
		}

		total = 0;
		for (int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i] + " ");
			total = total + arrVar[i];
		}

		System.out.println("\n총 합 : " + total);
	}

	public static void practice8() {
		/*
		 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 */

		int num1; // 1. 사용자 입력을 받아 저장하기 위한 변수 지정
		int[] arr; // 3. 정수형 배열 변수, 사용자가 입력한 크기의 배열로 생성할 것.

		// 2. while문 작성
		while (true) {
			System.out.print("정수 : ");
			num1 = sc.nextInt();

			if (num1 >= 3 && num1 % 2 == 1) {
				// 3 이상의 홀수값
				break;
			}
			System.out.println("3 이상의 홀수 값으로 다시 입력하세요.");
		}
		// 4.
		arr = new int[num1];
		/*
		 * 정수 : 5 -> 중간위치 : 5 / 2 = 정수 2 1, 2, 3, 2, 1
		 * 
		 * 정수 : 7 -> 중간위치 : 7 / 2 = 정수 3 1, 2, 3, 4, 3, 2, 1
		 * 
		 * 중간 위치 : n / 2 -> 배열의 중간에 해당하는 인덱스
		 */

		// 6. 최종 값 value 설정
		int value = 1;
		// 5. for문으로 증감소값 작성
		for (int i = 0; i < arr.length; i++) {

			arr[i] = value;
			if (i < arr.length / 2) { // 배열의 중간에 해당하는 위치 구분
				// 배열에 저장할 값 증가
				value++;
			} else {
				// 배열에 저장할 값 감소
				value--;
			}
		}

		// 결과 출력
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
	}

	public static void practice8_1() {
		/*
		 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1씩 감소시키고 중간 이후부터는 1씩 증가한 값을 배열에 넣어 출력
		 *
		 * 정수 : 5 3,2,1,2,3
		 * 
		 * 정수 : 7 4,3,2,1,2,3,4
		 */

		int num1;
		int[] arr;

		while (true) {
			System.out.print("정수 : ");
			num1 = sc.nextInt();
			if (num1 >= 3 && num1 % 2 == 1) {
				break;
			}
			System.out.println("3 이상의 홀수 값으로 다시 입력하세요.");
		}
		arr = new int[num1];

		int value = (arr.length / 2) + 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;

			if (i < arr.length / 2) {
				value--;
			} else {
				value++;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
	}

	public static void practice9() {

		String[] chicken = { "양념", "후라이드", "마늘", "간장", "치즈" };
		String search;
		boolean find = false; // 메뉴를 찾은 경우 true로 설정
		int index = 0; // 몇번째 메뉴인지 기록을 하고 있다

		System.out.print("치킨 이름을 입력하세요. : ");
		search = sc.next();

		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(search)) {
				find = true;
				index = i;
				break;
			}
		}

		if (find) {
			System.out.println(chicken[index] + "치킨 배달 가능");
		} else {
			System.out.println(search + "치킨은 없는 메뉴입니다");
		}

	}

	public static void practice9_1() {

		/*
		 * 치킨 메뉴와 동일한 크기의 치킨메뉴의 가격을 저장하는 배열을 생성하고 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨
		 * 가격은 000원입니다.“ 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 
		 */
		String[] chicken = { "양념", "후라이드", "마늘", "간장", "치즈" };
		int[] chickenAmount = { 14000, 13000, 15000, 14000, 16000 };
		String search;
		boolean find = false; // 메뉴를 찾은 경우 true로 설정
		int index = 0; // 몇번째 메뉴인지 기록을 하고 있다

		System.out.print("치킨 이름을 입력하세요. : ");
		search = sc.next();

		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(search)) {
				find = true;
				index = i;
				break;
			}
		}

		if (find) {
			System.out.println(chicken[index] + "치킨 가격은 " + chickenAmount[index] + "원 입니다.");
		} else {
			System.out.println(search + "치킨은 없는 메뉴입니다");
		}
	}

	public static void practice10() {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		 */

		String jumin;

		// 반드시 - 포함이 되어 있는지 체크.
		// 주민등록번호 길이가 - 포함하여 14자리인지 체크.
		while (true) {
			System.out.print("주민등록번호('-' 포함) : ");
			jumin = sc.next();
			if (jumin.length() != 14) {
				System.out.println("주민등록번호는 -(하이픈) 포함하여 14자 입니다.");
				continue;
			}
			if (jumin.charAt(6) != '-') {
				System.out.println("올바르지 않은 주민등록번호 형식입니다.");
				continue;
			}
			break;
		}

		char[] orgJumin = new char[14]; // 원본 주민번호
		char[] copJumin = new char[14]; // 복사 주민번호

		// 문자열을 문자배열에 저장(원본저장)
		for (int i = 0; i < jumin.length(); i++) {
			orgJumin[i] = jumin.charAt(i);
		}

		// 원본 문자배열의 데이터를 복사본 문자배열로 복사
		// 성별정보 이후의 값은 * 로 저장
		for (int i = 0; i < orgJumin.length; i++) {
			if (i <= 7) {
				copJumin[i] = orgJumin[i];
			} else {
				copJumin[i] = '*';
			}
		}

		// 출력
		for (int i = 0; i < copJumin.length; i++) {
			System.out.print(copJumin[i]);
		}
	}

	public static void practice10_1() {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		 */

		String jumin;

		// 반드시 - 포함이 되어 있는지 체크.
		// 주민등록번호 길이가 - 포함하여 14자리인지 체크.
		while (true) {
			System.out.print("주민등록번호('-' 포함) : ");
			jumin = sc.next();
			if (jumin.length() != 14) {
				System.out.println("주민등록번호는 -(하이픈) 포함하여 14자 입니다.");
				continue;
			}
			if (jumin.charAt(6) != '-') {
				System.out.println("올바르지 않은 주민등록번호 형식입니다.");
				continue;
			}
			break;
		}

		char[] orgJumin = new char[14]; // 원본 주민번호
		char[] copJumin = new char[14]; // 복사 주민번호

		// 문자열을 문자배열에 저장(원본저장)
		for (int i = 0; i < jumin.length(); i++) {
			orgJumin[i] = jumin.charAt(i);
		}

		// 원본 문자배열의 데이터를 복사본 문자배열로 복사
		// 성별정보 이후의 값은 * 로 저장
		for (int i = 0; i < orgJumin.length; i++) {
			if (i <= 7) {
				copJumin[i] = orgJumin[i];
			} else {
				copJumin[i] = '*';
			}
		}

		// 출력
		for (int i = 0; i < copJumin.length; i++) {
			System.out.print(copJumin[i]);
		}
	}

	public static void practice12() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값
		 * 중에서 최대값과 최소값을 출력하세요.
		 */
		Random rand = new Random();

		int[] randArr = new int[10];

		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(10) + 1;
		}

		for (int i = 0; i < randArr.length; i++) {
			System.out.print(randArr[i] + " ");
		}

		// 최대값, 최소값
		int max = randArr[0], min = randArr[0];
		for (int i = 1; i < randArr.length; i++) {
			if (randArr[i] > max) {
				max = randArr[i];
			}
			if (randArr[i] < min) {
				min = randArr[i];
			}
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}

	public static void practice13() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후
		 * 출력하세요
		 */

		Random rand = new Random();
		int[] randArr = new int[10];
		int temp;
		boolean dup = false; // 중복된 정수값이 있음을 구분하기 위한 변수

		randArr[0] = rand.nextInt(10) + 1;
		for (int i = 1; i < randArr.length;) {
			dup = false;
			temp = rand.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (randArr[j] == temp) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				randArr[i] = temp;
				i++;
			}
		}
		for (int i = 0; i < randArr.length; i++) {
			System.out.print(randArr[i] + " ");
		}
	}

	public static void practice14() {
		/*
		 * 로또번호 자동 생성기 프로그램을 작성 1.중복값이 없어야 한다. 2.오름차순으로 정렬하여 출력
		 */

		// 1 ~ 45까지의 난수값 생성
		Random rand = new Random();

		// 총 6개의 난수 생성
		int[] lotto = new int[6];
		boolean dup = false; // 중복값이 있는지 확인하기 위한 플래그
		int temp;
		for (int i = 1; i <= 6;) {
			// 중복된 값 없이 6개의 난수 생성
			temp = rand.nextInt(45) + 1;
			// System.out.println(temp); // 디버깅을 위한 출력
			for (int j = 0; j < i - 1; j++) {
				if (temp == lotto[j]) {
					dup = true;
					break;
				}
			}
			if (!dup) { // 중복값이 없을 때만 값 추가 후 i(index) 증가
				lotto[i - 1] = temp;
				i++;
			}
			dup = false; // 중복 검사가 끝난 후 다시 초기화
		}
		// 오름차순으로 정렬
		int min, minIdx;
		for (int i = 0; i < 6 - 1; i++) {
			min = lotto[i];
			minIdx = i;
			for (int j = i; j < 6; j++) {
				if (min > lotto[j]) {
					min = lotto[j];
					minIdx = j;
				}
			}
			System.out.println(i + " | " + minIdx);
			if (i != minIdx) {
				temp = lotto[i];
				lotto[i] = lotto[minIdx];
				lotto[minIdx] = temp;
			}
		}

		System.out.print("\n정렬 후 -> ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

	public static void practice15() {
		
		String input;
		char[] orgCharArray, copCharArray;
		
		System.out.print("문자열 : ");
		input = sc.next();
		
		orgCharArray = new char[input.length()];
		copCharArray = new char[input.length()];
		
		for(int i = 0; i < orgCharArray.length; i++) {
			orgCharArray[i] = input.charAt(i);
		}
		
		int copIdx = 0;
		boolean dup = false;
		for(int i = 0; i < orgCharArray.length; i++) {
			for(int j = 0; j < copIdx; j++) {
				if(orgCharArray[i] == copCharArray[j]) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				copCharArray[copIdx] = orgCharArray[i];
				copIdx++;
			}
			dup = false;
		}

		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < copCharArray.length; i++) {
			System.out.print(copCharArray[i] + " ");
		}
		System.out.print("\n문자 개수 : " + copIdx);	
	}
	
	public static void practice16() {

		int arrSize, addSize;
		String[] proList, tmpList;
		String yesNo;

		System.out.print("배열의 크기를 입력하세요 : ");
		arrSize = sc.nextInt();		sc.nextLine();

		proList = new String[arrSize];

		for(int i = 0; i < arrSize; i++) {
			System.out.print(i + 1 + " 번째 문자열 : ");
			proList[i] = sc.nextLine();
		}

		while (true) {
			while (true) {
				System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
				yesNo = sc.next();
				sc.nextLine();

				if (yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("N") || yesNo.equals("n")) {
					break;
				}
				System.out.println("대답은 y 또는 n 으로만 하세요.");
			}
			if (yesNo.equals("N") || yesNo.equals("n")) {
				break;
			}
			System.out.print("더 입력할 개수 : ");
			addSize = sc.nextInt();
			sc.nextLine();
			tmpList = new String[proList.length + addSize];

			for (int i = 0; i < tmpList.length; i++) {
				if (i < proList.length) {
					tmpList[i] = proList[i];
				} else {
					System.out.print(i + 1 + " 번째 문자열 : ");
					tmpList[i] = sc.nextLine();
				}
			}

			proList = new String[tmpList.length];
			System.arraycopy(tmpList, 0, proList, 0, tmpList.length);
		}

		for (int i = 0; i < proList.length; i++) {
			System.out.print(proList[i] + ", ");
		}

	}

	public static void main(String[] args) {
//		practice1();
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice8_1();
//		practice9();
//		practice9_1();
//		practice10();
//		practice10_1();
//		practice11();
//		practice12();
//		practice13();
//		practice14();
		practice15();
//		practice16();

	}

}
