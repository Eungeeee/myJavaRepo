package com.kh.exam5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample5 {

	public static void main(String[] args) {
		/*
		 *  Set
		 *  	- 데이터를 순서대로 저장하지 않으며, 중복 데이터를 저장할 수 없다.
		 *  	- 인덱스를 사용하지 않기 때문에 인덱스를 매개변수로 사용하는 메서드가 없다.
		 */
		
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		
		// 추가
		hs.add("가");	hs.add("나");	hs.add("다");	hs.add("라");
		System.out.println(hs);
		
		hs.add("나");	// 중복 데이터
		System.out.println(hs);	// 변화 없음
		
		// 데이터 수 확인
		System.out.println(hs.size());
		
		// 검색
		System.out.println("가 존재? ->" + hs.contains("가"));
		System.out.println("마 존재? ->" + hs.contains("마"));
		
		// HashSet을 String 배열로 변환
		String[] sArr = new String[hs.size()];
		hs.toArray(sArr);
		
		System.out.println("문자열 배열로 변환하여 0번 인덱스 출력 ->" + sArr[0]);
		
		// HashSet을 ArrayList로 변환
		sArr = new String[hs.size()];
		hs.toArray(sArr);
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(sArr));
		// ArrayList<String> al = new ArrayList<>(Array.asList(hs.toArray(new String[hs.size()])))'
		System.out.println("ArrayList로 변환하여 1번 인덱스 출력 -> " + al.get(1));
		
		// 삭제
		hs.remove("나");
		System.out.println(hs);
		
		/*
		 *  LinkedHashSet
		 *  	- 추가된 데이터의 순서를 유지해준다.
		 */
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("가");	lhs.add("나");	lhs.add("다");	lhs.add("라");
		System.out.println(lhs);
		
		for(String s: lhs) {
			System.out.println("foreach -> " + s);
		}
		
		// iterator(반복자) 메서드
		Iterator<String> itor = lhs.iterator();
		// itor.has.next() -> 반복 할 객체가 있는지 확인
		while(itor.hasNext()) {
			// itor.next() 객체를 추출
			System.out.println("iterator -> " + itor.next());
		}
		
		/*
		 *  TreeSet
		 *  	- 정렬 기능이 추가된 Set 객체
		 *  	- HashSet 보다 성능상 느리지만 객체 추가와 동시에 정렬이 이루어 진다.
		 */
		TreeSet<String> ts = new TreeSet<>();
		ts.add("라"); 	ts.add("다"); 	ts.add("가"); 	ts.add("나");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		System.out.print("오름차순 출력 -> ");
		for(String s: ts) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.print("내림차순 출력 -> ");
		for(String s: ts.descendingSet()) {
			System.out.print(s + " ");
		}

	}

}
