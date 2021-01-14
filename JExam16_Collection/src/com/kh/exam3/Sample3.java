package com.kh.exam3;

import java.util.*;

public class Sample3 {

	public static void main(String[] args) {
		/*
		 *  List 계열
		 *  	- 순서 유지 및 중복 저장이 가능한 컬렉션
		 *  	- ArrayList, Vector, LinkedList 가 있다.
		 *  
		 *  ArrayList
		 *  	- 단방향 포인터 구조로 자료에 대한 순차 접근에 강점을 가진다.
		 *  
		 *  Vector
		 *  	- 동기화(synchronized)된 메서드로 구성되어 멀티스레드 환경에서의 안정성을 가진다.
		 *  
		 *  LinkedList
		 *  	- 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번한 경우 빠른 성능을 보장하며,
		 *  	  앞/뒤로 검색이 가능하기 때문에 가장 빠른 검색이 가능한 방향으로 접근하여 수정할 수 있다.
		 */
		
		ArrayList<Integer> lst = new ArrayList<>();
		// Vector<Integer> lst = new Vector<>();
		// LinkedList<Integer> lst = new LinkedList<>();
		
		// 데이터 추가
		lst.add(10);	lst.add(20);	lst.add(30);
		System.out.println(lst);
		
		lst.add(1, 15);				// 1번 인덱스 위치에 15 요소 추가
		System.out.println(lst);
		
		lst.add(3, 25);				// 3번 인덱스 위치에 25 요소 추가
		System.out.println(lst);
		
		lst.add(lst.size(),35);		// 마지막 인덱스 위치에 35 요소 추가
		System.out.println(lst);
		
		// 데이터 수정
		lst.set(0, 12);		lst.set(2, 22);		lst.set(4, 32);
		System.out.println(lst);
		
		// 데이터 검색
		System.out.println(lst.get(0) + ", " + lst.get(2) + ", " + lst.get(4));
		System.out.println("12의 위치값 -> " + lst.indexOf(12));
		System.out.println("22의 위치값 -> " + lst.indexOf(22));
		System.out.println("32의 위치값 -> " + lst.indexOf(32));
		System.out.println("42의 위치값 -> " + lst.indexOf(42));	// 존재하지 않으면 -1 이 나옴
		
		System.out.println("32가 존재하는가 -> " + lst.contains(32));
		System.out.println("42가 존재하는가 -> " + lst.contains(42));
		
		System.out.println("빈 컬렉션인가 -> " + lst.isEmpty());
		
		// 데이터 삭제
		/*
			lst.remove(0);		lst.remove(1);		lst.remove(2);
			System.out.println(lst);
		
			lst.remove(new Integer(15));
		 	System.out.println(lst);
		 */
		
		System.out.println(lst.subList(1, 4)); 	// 1에서 4번 전까지
		
		// 리스트의 마지막 요소는 빼고 반복(foreach 반복)
		for(int x : lst.subList(0, lst.size()-1)) {
			System.out.print(x + " ");
		}
		
		System.out.println();

		// 리스트의 첫 요소는 빼고 반복(foreach 반복)
		for(int x : lst.subList(1, lst.size())) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		// 정렬
		Collections.sort(lst);	// 오름차순
		System.out.println(lst);
		Collections.reverse(lst);	// 내림차순
		System.out.println(lst);
		
	}

}
