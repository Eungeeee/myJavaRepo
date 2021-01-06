package com.kh.exam;

import java.util.Arrays;

public class Sample1 {

	public static void func1() {
		int[]arr1;	// heap에 생성할 배열의 주소를 저장하기 위한 참조주소 공간 생성
		
		// heap에 5개의 정수 데이터를 저장할 배열 공간 생성
		// 생성된 공간의 주소를 arr1에 저장 (arr1는 참조주소(값)가 저장)
		arr1 = new int[5];
		
		// 배열을 사용하면 배열에는 기본값이 자동으로 저장된다.
		System.out.print(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
	
	}
	
	public static void func2() {
		int[]arr1 = {1,2,3,4,5};
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = (i*100) + 100;
		}
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
	}
	
	public static void func3() {
		char[] chArr1 = new char[5];
		
		for(int i = 0; i < chArr1.length; i++) {
			/*
			 * 			  65 + i
			 * A -> 65 -> 65 + 0
			 * B -> 66 -> 65 + 1
			 * C -> 67 -> 65 + 2
			 */
			chArr1[i] = (char)(65 + i);
		}
		
		System.out.println(chArr1[0] + "" + chArr1[1] + "" + chArr1[2]);
	}
	
	public static void func4() {
		String[] strArr1 = {"Java","JavaScript","HTML","CSS","SQL"};
		
		for(int i = 0; i < strArr1.length; i++) {
			System.out.println("프로그래밍 언어 : " + strArr1[i]);
		}
//		System.out.println(strArr1[0] + " " + strArr1[1] + " " + strArr1[2]);
	}
	
	public static void func5() {
		
		/* 
		 * 복사
		 * 일반적인 변수에 저장된 값을 복사.(값을 복사하여 저장.)
		 * int x = 10;
		 * int y = x;
		 * x = 15; 	y = 20;
		 * System.out.print("x -> " + x "\ty -> " +y);
		 * 
		 * 배열 변수에 저장된 값을 복사. (참조값 복사하여 저장.)
		 * 참조값만을 복사하기 때문에 원본과 복사본은 동일한 heap의 메모리를 참조한다.
		 */
		int[]arr1 = {1, 2, 3};
		int[]arr2 = arr1;	//	 얕은 복사 -> 참조값만 복사.
		
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr2[1] = 20;
		System.out.println("arr2[1] = 20; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func6() {
		int[]arr1 = {1, 2, 3};
		int[]arr2 = new int[3];
		
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func7() {
		/*
		 * .clone() : 배열을 복사하기 위한 메서드
		 */
		int[]arr1 = {1, 2, 3};
		int[]arr2 = new int[3];
		
		arr2 = arr1.clone();
		
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func8() {
		/*
		 * System.arraycopy() : 배열을 복사하기 위한 메서드
		 */
		int[]arr1 = {1, 2, 3};
		int[]arr2 = new int[3];
		
		//				 원본, 원본시작위치, 복사본, 복사본시작위치, 복사길이(원하는 크기만큼 잘라서 복사 가능)
//		System.arraycopy(src,   srcPos,  dest, destPos,    length);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 100;
		System.out.println("arr1[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func9() {
		/*
		 * import java.util.Arrays;
		 * Array.copyOf() : 배열을 복사하기 위한 Arrays 객체의 메서드
		 */
		
		int[]arr1 = {1, 2, 3};
		int[]arr2 = new int[3];
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 100;
		System.out.println("arr1[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+ arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> "+ arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void main(String[] args) {
//		func1();
//		func2();
//		func3();
//		func4();
//		func5();
//		func6();
//		func7();
//		func8();
		func9();

	}

}
