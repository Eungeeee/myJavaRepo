package com.kh.practice.student.view;

import com.kh.practice.student.controller.*;
import java.util.Scanner;

public class StudentMenu {
	private Scanner sc = new Scanner(System.in);
	private StudentController ssm = new StudentController();
	
	public void loopMenu() {
		String menu;
		String name, subject;
		int score;
		while(true) {
			System.out.println("1. 성적추가");
			System.out.println("2. 성적수정");
			System.out.println("3. 성적삭제");
			System.out.println("4. 모든정보출력");
			System.out.println("exit를 입력하면 프로그램이 종료 됩니다.");
			System.out.print("입력 : "); 		menu = sc.next();
			
			switch(menu) {
				case "1":
					// 성적 추가 기능 동작
					System.out.print("이름 : ");		name = sc.next();
					System.out.print("과목 : ");		subject = sc.next();
					System.out.print("성적 : ");		score = sc.nextInt();
					ssm.add(name, subject,score);
					break;
				case "2":
					// 성적 수정 기능 동작
					System.out.print("이름 : ");		name = sc.next();
					System.out.print("과목 : ");		subject = sc.next();
					System.out.print("성적 : ");		score = sc.nextInt();
					ssm.modify(name, subject, score);
					break;
				case "3":
					// 성적 삭제 기능 동작
					System.out.print("이름 : ");		name = sc.next();
					ssm.delete(name);
					break;
				case "4":
					ssm.printAll();
					break;
				case "exit":
					System.exit(0);
				default :
					System.out.println("올바르지 않은 메뉴 입력입니다.");
			}
		}
	}
/*
	public StudentMenu() {
		System.out.println("==========학생 정보 출력==========");
		for(int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		
		System.out.println("==========학생 성적 출력==========");
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+ (int)avg[0]);
		System.out.println("학생 점수 평균 : "+ avg[1]);
		
		System.out.println("==========성적 결과 출력==========");
		for(int i = 0; i < ssm.printStudent().length; i++) {
			if(StudentController.CUT_LINE1 > ssm.printStudent()[i].getScore()) {
				System.out.println(ssm.printStudent()[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + " 학생은 통과입니다");
			}
		}
	}
*/
}
