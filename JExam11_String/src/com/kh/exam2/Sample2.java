package com.kh.exam2;

import java.util.StringTokenizer;

public class Sample2 {

	public static void main(String[] args) {
		// StringBuffer / StringBuilder
		//	- 두 클래스의 기능은 동일하나, 쓰레드 safe 기능의 차이만 있다.
		//	- 16문자를 처리하기 위한 크기로 생성(버퍼크기가 16문자를 처리할 수 있는 크기로 생성)
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("First StringBuilder");
		System.out.println(sb1);
		
		sb1.insert(0, "My");
		System.out.println(sb1);
		
		sb1.insert(2, " ");
		System.out.println(sb1);
		
//		sb1.delete(3, 9);
//		System.out.println(sb1);
		
		String find = "String";
		int startIdx = sb1.indexOf(find);
		System.out.println("sb1.indexOf(find) -> " + startIdx);
		sb1.delete(startIdx, startIdx + find.length());
		System.out.println(sb1);
		
		// 지정된 위치의 문자열만 변경해준다.
		find = "Builder";
		startIdx = sb1.indexOf(find);
		sb1.replace(startIdx, startIdx + find.length(), "StringBuilder");
		System.out.println(sb1);
		
		// StringTokenizer
		//	- 문자열을 구분문자열로 분리하는 기능을 가진 클래스
		//	- 파일입출력에서 형식화된 파일(CSV 파일)을 StringTokenizer 활용하여 데이터 분리/추출 작업
		StringTokenizer st = new StringTokenizer("My StringBuilder First Builder new String"," ");
		while(st.hasMoreTokens()) {
			System.out.println("st.nextToken() -> " + st.nextToken());
		}
		
		st = new StringTokenizer("2021-01-07");
		while(st.hasMoreTokens()) {
			System.out.println("st.nextToken() -> " + st.nextToken("-"));
		}
	}
}
