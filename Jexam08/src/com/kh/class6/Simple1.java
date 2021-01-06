package com.kh.class6;

class Sample{
	public String name;
	public int age;
	public char gender;
	
	public Sample() {}
	public Sample(String name) {
		this.name = name;
	}
	public Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Sample(String name, int age, char gender) {
		this(name, age);
		this.gender = gender;
	}
	public Sample(String name, int age, String gender) {
		this(name, age);
		this.gender = gender.charAt(0);
	}
	
	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gender);
	}
}

public class Simple1 {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample("홍길동");
		Sample s3 = new Sample("홍길동", 30);
		Sample s4 = new Sample("홍길동", 30, '남');
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		

	}

}
