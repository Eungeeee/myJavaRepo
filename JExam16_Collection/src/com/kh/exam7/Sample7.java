package com.kh.exam7;

import java.util.*;

class Student{
	private String name;
	private char gender;
	private int classLevel;
	private int classNumber;
	private int classId;
	
	public Student(String name, char gender, int lvl, int num, int id) {
		this.name = name;
		this.gender = gender;
		this.classLevel = lvl;
		this.classNumber = num;
		this.classId = id;
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
	public int getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	@Override
	public String toString() {
		return "<Stdent : name = \"" + name + "\">";
	}

}

class Grade{
	private String subject;
	private double score;
	
	public Grade(String subject) {
		this.subject = subject;
	}
	
	public Grade(String subject, double score) {
		this.subject = subject;
		this.score = score;
	}
	
	public Grade(String subject, int score) {
		this.subject = subject;
		this.score = (double)score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public String toString() {
		return "<Grade : subject = \"" + subject + "\">";
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student("홍길동",'남',1,1,25));
		stdList.add(new Student("박지은",'여',1,2,13));
		stdList.add(new Student("김주완",'남',2,1,5));
		stdList.add(new Student("최정은",'여',2,3,19));
		
		System.out.println(stdList);
		
		System.out.println(stdList.get(0));
		System.out.println(stdList.get(1));
		System.out.println(stdList.get(2));
		System.out.println(stdList.get(3));
		
		ArrayList<Grade> grdList1 = new ArrayList<>();
		grdList1.add(new Grade("수학", 60));
		grdList1.add(new Grade("과학", 70));
		grdList1.add(new Grade("국어", 80));
		grdList1.add(new Grade("영어", 90));
		
		ArrayList<Grade> grdList2 = new ArrayList<>();
		grdList2.add(new Grade("수학", 70));
		grdList2.add(new Grade("과학", 90));
		grdList2.add(new Grade("국어", 60));
		grdList2.add(new Grade("영어", 80));
		
		System.out.println(grdList1);
		
		System.out.println(grdList1.get(0));
		System.out.println(grdList1.get(1));
		System.out.println(grdList1.get(2));
		System.out.println(grdList1.get(3));
		
		HashMap<Student, ArrayList<Grade>> stdInfo = new HashMap<>();
		stdInfo.put(new Student("홍길동",'남',1,1,25), grdList1);
		stdInfo.put(new Student("박지은",'여',1,2,13), grdList2);
		
		System.out.println(stdInfo);
		
	}

}
