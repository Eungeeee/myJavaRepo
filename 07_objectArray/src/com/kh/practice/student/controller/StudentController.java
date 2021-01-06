package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.*;

public class StudentController {

	private Student[] sArr;
	public static final int CUT_LINE1 = 60; // 클래스(정적) 변수 (상수) 대문자는 상수를 의미
	public final int CUT_LINE2 = 60; // 인스턴스 변수(상수)

	public StudentController() {
//		sArr[0] = new Student("김길동","자바",100);
//		sArr[1] = new Student("박길동","디비",50);
//		sArr[2] = new Student("이길동","화면",85);
//		sArr[3] = new Student("정길동","서버",60);
//		sArr[4] = new Student("홍길동","자바",20);
	}

	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}

	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = this.sumScore();
		avg[1] = (double) avg[0] / sArr.length;
		return avg;
	}

	public void add(String name, String subject, int score) {
		if (sArr == null) {
			sArr = new Student[1];
			sArr[0] = new Student(name, subject, score);
		} else {
			Student[] tmp = new Student[sArr.length + 1];
			System.arraycopy(sArr, 0, tmp, 0, sArr.length);
			tmp[tmp.length - 1] = new Student(name, subject, score);
			sArr = tmp; // 얕은 복사
		}
	}

	public void modify(String name, String subject, int score) {
		int index = -1;
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println(name + "에 해당하는 학생이 존재하지 않습니다.");
		} else {
			sArr[index].setSubject(subject);
			sArr[index].setScore(score);
			System.out.println(name + "에 해당하는 학생의 정보를 수정했습니다.");
		}
	}

	public void delete(String name) {
		// 새로운 객체 배열 생성 (기존 객체 배열보다 길이가 하나 적게 생성)
		// 삭제할 학생의 위치를 찾은 후 새로 생성한 객체 배열에 찾은 학생의 정보만 빼고 복사
		int index = -1;
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println(name + "에 해당하는 학생이 존재하지 않습니다.");
		} else {
			Student[] tmp = new Student[sArr.length - 1];
			int idx = 0;
			for (int i = 0; i < sArr.length; i++) {
				if (i == index) {
					continue;
				} else {
					tmp[idx] = sArr[i];
					idx++;
				}
			}
			sArr = tmp;		// 얕은 복사
			System.out.println(name + "에 해당하는 학생 정보를 삭제했습니다.");
		}
	}

	public void printAll() {
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
	}

}
