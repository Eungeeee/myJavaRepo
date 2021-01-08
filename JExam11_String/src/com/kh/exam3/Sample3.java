package com.kh.exam3;

import java.util.Date;
// import java.lang.String; 	// 기본 패키지이기 때문에 별도의 import 필요 없음

public class Sample3 {
	
	/*
	 *  성능 측정하기
	 *  	- 동일한 기능을 하는 메서드가 존재하는 경우 어떠한 메서드가 더 빠른 결과를
	 *  	  도출하는지 시간 측정으로 성능을 따진다.
	 *  	- 시작 시간, 종료 시간을 체크 후 (종료 시간 - 시작 시간)으로 성능을 측정
	 */

	public static void main(String[] args) {
		String s1 = new String("");
		String s2 = new String("");
		StringBuilder s3 = new StringBuilder();
		int max = 9999;
		
		Date stDate = new Date();
		for(int i = 0; i <= max; i++) {
			s1 += "1";
		}
		Date edDate = new Date();
		
		System.out.println("문자열 + 연산을 했을 때 -> " + ((long)edDate.getTime() - (long)stDate.getTime()));
		
		stDate = new Date();
		for(int i = 0; i <= max; i++) {
			s2 = s2.concat("1");
		}
		edDate = new Date();
		
		System.out.println("문자열 메서드 .concat()을 했을 때 -> " + ((long)edDate.getTime() - (long)stDate.getTime()));

		stDate = new Date();
		for(int i = 0; i <= max; i++) {
			s3.append("1");
		}
		edDate = new Date();
		
		System.out.println("StringBuilder를 사용 했을 때 -> " + ((long)edDate.getTime() - (long)stDate.getTime()));

		
	}

}
