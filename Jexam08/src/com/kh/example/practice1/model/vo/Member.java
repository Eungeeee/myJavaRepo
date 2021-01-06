package com.kh.example.practice1.model.vo;

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Member() {};
		// 초기화

	public void changeName(String name) {
		// name 멤버 변수의 값을 변경하기 위한 메서드
		this.memberName = name;
	}

	public void printName() {
		// name 멤버 변수의 값을 출력하기 위한 메서드
		System.out.println("이름 : " + this.memberName);
	}
}