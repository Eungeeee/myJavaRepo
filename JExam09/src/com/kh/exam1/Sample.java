package com.kh.exam1;

import java.util.Scanner;

class UserInfo{
	private String name;
	private int age;
	private char gender;
	
	public UserInfo(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public UserInfo(String name, int age, char gender) {
		this(name,age);
		this.gender = gender;
	}
	
	public String information() {
		// information 메서드로 이름/나이 확인가능하기 때문에
		// getName(), getAge()는 안만들었다
		return this.name+"님의 나이는 "+this.age+"세 입니다";
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Sample {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int age;
		String name;
		
		UserInfo[] info = new UserInfo[3];
		for(int i = 0; i < info.length; i++) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			info[i] = new UserInfo(name, age);
		}
		
		for(int i = 0; i < info.length; i++) {
			System.out.println(info[i].information());
		}
	}

}
