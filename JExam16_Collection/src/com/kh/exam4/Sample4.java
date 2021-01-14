package com.kh.exam4;

import java.util.*;

/*
 * 로또 자동 추출 프로그램 만들기
 * 		- 1 ~ 45 까지의 랜덤 정수를 6개 생성
 * 		- 생성된 정수는 리스트 컬렉션에 저장(중복 데이터는 없어야 한다.)
 * 		- 자동, 반자동 기능을 넣도록 한다.
 * 			자동 : 6개의 정수가 모두 랜덤 생성
 * 			반자동 : 일부 정수를 매개변수로 받고 나머지 정수값을 랜덤 생성
 * 
 * 계획 먼저 세우기
 * 		- 필요한 멤버 필드 작성
 * 		- 필요한 메서드 작성 (매개변수 타입, 값 / 반환 타입, 값)
 * 		- 클래스 사용 방식 -> 생성자
 */
class Lotto {
	private Random rand = new Random();
	private ArrayList<Integer> numbers;
	
	public Lotto() {
		numbers = new ArrayList<>();
	}

	public Lotto(int n1) {
		this();
		numbers.add(n1);
	}
	public Lotto(int n1, int n2) {
		this(n1);
		numbers.add(n2);
	}
	public Lotto(int n1, int n2, int n3) {
		this(n1, n2);
		numbers.add(n3);
	}
	public Lotto(int n1, int n2, int n3, int n4) {
		this(n1, n2, n3);
		numbers.add(n4);
	}
	public Lotto(int n1, int n2, int n3, int n4, int n5) {
		this(n1, n2, n3, n4);
		numbers.add(n5);
	}
	public Lotto(int n1, int n2, int n3, int n4, int n5, int n6) {
		this(n1, n2, n3, n4, n5);
		numbers.add(n6);
	}
	
	private boolean duplicate(int n1, int n2) {
		return n1 == n2 ? true : false;
	}
	
	private int generate() {
		int num = rand.nextInt(45) + 1;
		for(int x : numbers) {
			if(duplicate(x,num)) {
				return -1;
			}
		}
		return num;
	}
	
	public ArrayList<Integer> getLotto(){
		while(numbers.size() < 6) {
			int num = generate();
			if(num != -1) {
				numbers.add(num);
			}
		}
		Collections.sort(numbers);
		return numbers;
	}
//	
//	public ArrayList<Integer> getLotto(int... nums){
//		int idx = 0;
//		for(int x : nums) {
//			if(!numbers.isEmpty()) {
//				if(idx < numbers.size()) {
//					numbers.set(idx, x);
//				} else {
//					numbers.add(x);
//				}
//			} else {
//				numbers.add(x);
//			}
//			idx++;
//			if(idx >= 6) {
//				break;
//			}
//		}
//		return getLotto();
//	}
	
	public void clear() {
		numbers.clear();
	}

public class Sample4 {
	
	public static void main(String[] args) {
		Lotto l = new Lotto();
		System.out.println(l.getLotto())
	}

}
