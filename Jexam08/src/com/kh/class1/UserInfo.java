package com.kh.class1;

public class UserInfo {
	// 멤버변수(필드) : 속성이라는 이름으로도 사용
	private String name;
	private int age;
	private char gender;
	
	// 생성자 : 클래스 명과 동일한 이름으로 생성
	// UserInfo info = new UserInfo();를 통해서 자동 실행이 된다.
	public UserInfo() {};
	
	
	// 멤버 메서드 : 해당 클래스의 기능(함수) 구현 부분
	// [접근제한자][예약어] 반환타입 메서드명(){}
	// 반환타입 : 함수가 동작하고 나온 결과를 반환할 때 반환하는 데이터의 타입을 설정(void는 반환 데이터가 없는 경우 사용)
	// 반환 : 함수를 실행한 위치로 데이터를 돌려주는 것
	//		 return 키워드를 사용하여 데이터를 반환(오직 하나의 데이터만 반환)
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	// 인자 : 함수를 실행에 필요한 데이터를 전달하기 위해 사용
	// [접근제한자][예약어] 반환타입 메서드명(인자타입 인자명)
	// [접근제한자][예약어] 반환타입 메서드명(인자타입 인자명, 인자타입 인자명, ...)
	public void setName(String name) {
		// this : 자기 자신을 의미, 인자명과 멤버변수명이 동일한 경우
		//		  멤버변수와 인자를 구분하기 위해 사용.
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	// Java에서 가장 먼저 실행이 되는 함수 -> main
	public static void main(String[] args) {
		//	인스턴스화 : UserInfo 클래스를 사용하여 새로운 객체(UserInfo) 생성
		UserInfo info = new UserInfo();
		info.setAge(20);
		info.setName("홍길동");
		info.setGender('M');
		
		System.out.println("이름 : "+ info.getName());
		System.out.println("나이 : "+ info.getAge());
		System.out.println("성별 : "+ info.getGender());
		
		UserInfo kim = new UserInfo();
		kim.setAge(25);
		kim.setName("김철수");
		kim.setGender('M');
		
		System.out.println("이름 : "+ kim.getName());
		System.out.println("나이 : "+ kim.getAge());
		System.out.println("성별 : "+ kim.getGender());
		
		// 동일 클래스에서 접근을 하고 있기 때문에 private 제한자를 사용해도 접근
		
	}

}
