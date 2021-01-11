package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		String name, before, after;
		String menu = "";
		menu += "1. 파일 목록 보기\n";
		menu += "2. 파일 생성\n";
		menu += "3. 파일 읽기\n";
		menu += "4. 파일 수정\n";
		menu += "5. 파일 삭제\n";
		menu += "9. 프로그램 종료\n";
		menu += "메뉴 선택 : ";
		System.out.print(menu);
		switch(sc.next()) {
		case "1":
			// FileController의 listFile 메서드 호출하여 파일 목록 출력
			fc.listFile();
			break;
		case "2":
			// FileController의 addFile 메서드 호출하여 파일 생성
			System.out.print("생성 할 파일명 입력 : ");  name = sc.next();
			fc.addFile(name);
			break;
		case "3":
			// FileController의 readFile 메서드 호출하여 파일 내용 출력
			System.out.print("읽을 파일명 입력 : ");  name = sc.next();
			fc.readFile(name);
			break;
		case "4":
			// FileController의 editFile 메서드 호출하여 파일 내용 수정
			System.out.print("수정 할 파일명 입력 : ");  name = sc.next();
			System.out.print("변경 전 내용 입력 : ");	before = sc.next();
			System.out.print("변경 후 내용 입력 : ");	after = sc.next();
			fc.editFile(name, before, after);
			break;
		case "5":
			// FileController의 deleteFile 메서드 호출하여 파일 삭제
			System.out.print("삭제 할 파일명 입력 : ");  name = sc.next();
			fc.deleteFile(name);
			break;
		case "9":
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 메뉴 번호 입니다. 다시 입력하세요.");
		}
	}

}
