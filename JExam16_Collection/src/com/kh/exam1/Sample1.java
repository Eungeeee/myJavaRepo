package com.kh.exam1;

/**
 * 제네릭(Generic)
 * 		- 타입 안정성 향상 : 의도하지 않은 타입의 객체가 사용되는 것을 컴파일 단계에서 확인할 수 있게 한다.
 * 		- 메서드 오버로드를 할 필요 없이 다양한 자료형을 받아서 반환하는 메서드 생성 가능
 *		- 컬렉션, 스트림, NIO 등에서 많이 사용
 *		- 사용자 측 : <> 다이아몬드 연산자를 사용하여 사용 데이터 타입을 지정
 *		  제공자 측 : <> 다이아몬드 연산자를 사용하여 사용자 측이 사용해야 할 타입을 매개변수화 한다.
 *		- 제공자 측이 사용하는 매개변수명으로는 다음과 같은 약자를 많이 사용한다.
 *			<E> : Element 약자		-> 컬렉션에 저장할 데이터 타입
 *			<T> : Type 약자			-> 데이터 타입
 *			<K, V> : Key, Value 약자 -> 컬렉션(map 자료)에 저장할 데이터 타입
 *			<N> : Number 약자			-> 숫자와 관련된 데이터 타입
 *			<?> : 와일드 카드			-> 타입에 대한 제한 없음
 *			<? extends T>			-> T 타입과 T 타입의 파생 타입만 사용
 *			<? super T>				-> T 타입과 T 타입의 상위 타입만 사용
 */

import java.util.*;

public class Sample1 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(1);	strList.add("A");
		intList.add(2);	strList.add("B");
		intList.add(3);	strList.add("C");
		
		System.out.println(intList.toString() + " -> " + intList.get(0));
		System.out.println(strList.toString() + " -> " + strList.get(1));
		

	}

}
