package com.kh.exam2;

/*
 * Student 클래스
 * 		1. 멤버 필드로 이름, 성별, 나이, 학년, 반, 번호를 사용한다.
 * 		2. 모든 멤버 필드에 대한 getter/setter 생성
 */

class Student{
	private String name;
	private char gender;
	private int age;
	private int classLevel;
	private int classRoom;
	private int number;
	
	public Student(String name, char gender, int age, int classLevel, int classRoom, int number) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.classLevel = classLevel;
		this.classRoom = classRoom;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

class GenStudent<T>{
	private String name;
	private char gender;
	private int age;
	private T classLevel;
	private T classRoom;
	private int number;
	
	public GenStudent(String name, char gender, int age, T classLevel, T classRoom, int number) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.classLevel = classLevel;
		this.classRoom = classRoom;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public T getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(T classLevel) {
		this.classLevel = classLevel;
	}
	public T getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(T classRoom) {
		this.classRoom = classRoom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

/*
 * Grade 클래스
 * 		1. 시험 성적 점수를 데이터를 관리하기 위한 클래스
 * 		2. 멤버 필드로 과목, 점수를 사용한다.
 * 		3. 모든 멤버 필드에 대한 getter/setter 생성
 * 		4. 점수의 경우 정수 자료로 사용할 수 도 있지만 A, B, C 또는 수, 우, 미 등과 같은 문자/문자열도 사용할 수 있게 한다.
 */

class GenScore<ST>{
	private String subject;
	private ST score;
	
	public GenScore(String subject, ST score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ST getScore() {
		return score;
	}

	public void setScore(ST score) {
		this.score = score;
	}
}



public class Sample2 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",'남',12,6,3,15);
		Student s2 = new Student("박철수",'남',12,6,4,5);
		
		System.out.println(s1.getClassLevel() + "학년 " + s1.getClassRoom() + "반 " + s1.getName());
		System.out.println(s2.getClassLevel() + "학년 " + s2.getClassRoom() + "반 " + s2.getName());

		GenStudent<String> s3 = new GenStudent<>("고난정",'여',7,"초6","D",8);
		GenStudent<String> s4 = new GenStudent<>("김나연",'여',7,"유치원","기린",5);
		GenStudent<Integer> s5 = new GenStudent<>("김지후",'남',7,9,3,5);
		
		System.out.println(s3.getClassLevel() + " " + s3.getClassRoom() + "반 " + s3.getName());
		System.out.println(s4.getClassLevel() + " " + s4.getClassRoom() + "반 " + s4.getName());
		System.out.println(s5.getClassLevel() + "학년 " + s5.getClassRoom() + "반 " + s5.getName());

		GenScore<Integer> ss1 = new GenScore<>("자바",90);
		GenScore<String> ss2 = new GenScore<>("프로그램 활용","수");
		GenScore<String> ss3 = new GenScore<>("프로그램 구현","A");
		
		System.out.println("과목 " + ss1.getSubject() + "의 시험 점수는 " + ss1.getScore() + "점 입니다.");
		System.out.println("과목 " + ss2.getSubject() + "의 시험 결과는 수,우,미,양,가 중 '" + ss2.getScore() + "' 입니다.");
		System.out.println("과목 " + ss3.getSubject() + "의 시험 결과 등급은 A,B,C,D 중 '" + ss3.getScore() + "' 입니다.");
	}

}
