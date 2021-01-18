package com.kh.exam_practice1;

import java.util.*;
import java.io.*;

public class Run {
	
	public static Scanner sc = new Scanner(System.in);
	public int w = 0, l = 0, d = 0;
	
	public void printMainMenu() {
		String menu = "";
		menu += "┌-----------------------------┐\n";
		menu += "| ┌-------------------------┐ |\n";
		menu += "| |    가위 바위 보 게임  	  	 | |\n";
		menu += "| └-------------------------┘ |\n";
		menu += "├-----------------------------┤\n";
		menu += "| 1. 새 게임						|\n";
		menu += "| 2. 게임 불러오기					|\n";
		menu += "| 3. 기록 확인하기					|\n";
		menu += "| 4. 게임 종료					|\n";
		menu += "└-----------------------------┘\n";
		menu += " : ";
		System.out.print(menu);
	}
	
	public void printCRPMenu() {
		String strCPR = "";
		strCPR += "┌-----------------------------┐\n";
		strCPR += "| 1. 가위                     |\n";
		strCPR += "| 2. 바위                     |\n";
		strCPR += "| 3. 보                       |\n";
		strCPR += "| 4. 그만!                    |\n";
		strCPR += "└-----------------------------┘\n";
		strCPR += " : ";
		System.out.print(strCPR);
	}
	
	
	public void playGame(int player) {
		int computer = new Random().nextInt(3) + 1;
		
		if(player != 4) {
			if(computer == player) {
				System.out.println("비겼습니다.");
				d++;
			} else {
				if(computer == 1) {
					if(player == 2) {
						System.out.println("이겼습니다.");
						w++;
					} else if(player == 3) {
						System.out.println("졌습니다.");
						l++;
					}
				} else if(computer == 2) {
					if(player == 1) {
						System.out.println("졌습니다.");
						l++;
					} else if(player == 3) {
						System.out.println("이겼습니다.");
						w++;
					}
				} else if(computer == 3) {
					if(player == 1) {
						System.out.println("이겼습니다.");
						w++;
					} else if(player == 2) {
						System.out.println("졌습니다.");
						l++;
					}
				}
			}
		}
	}
	
	public void save() {
		File f = new File("D:/score.txt");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(String.format("%d,%d,%d", this.w, this.l, this.d));
			fw.close();
		} catch (IOException e) {
			System.out.println("파일 입출력에 문제가 발생 했습니다.");
		}
	}
	
	public void load() {
		File f = new File("D:/score.txt");
		String[] score = new String[] { "0", "0", "0" };
		try {
			FileReader fr = new FileReader(f);
			String strRead = "";
			int len;
			char[] buff = new char[32];
			while((len = fr.read(buff)) != -1) {
				strRead += new String(buff, 0, len);
			}
			score = strRead.split(",");
			fr.close();
		} catch (IOException e) {
			System.out.println("파일 입출력에 문제가 발생 했습니다.");
		}
		
		this.w = Integer.parseInt(score[0]);
		this.l = Integer.parseInt(score[1]);
		this.d = Integer.parseInt(score[2]);
	}
	
	public static void main(String[] args) {
		
		Run r = new Run();
		r.printMainMenu();
		int menuNumber = sc.nextInt();	sc.nextLine();
		
		if(menuNumber == 1) {
			// 새 게임
			r.printCRPMenu();	// 가위 바위 보 선택 출력
			int player = sc.nextInt();	sc.nextLine();
			r.playGame(player);
			
			System.out.printf("현재 까지의 전적은 %d승 %d패 %d무 입니다.\n", r.w, r.l, r.d);
			r.save();
		} else if(menuNumber == 2) {
			// 게임 불러오기
			r.load();
			
			r.printCRPMenu();	// 가위 바위 보 선택 출력
			int player = sc.nextInt();	sc.nextLine();
			r.playGame(player);
			
			System.out.printf("현재 까지의 전적은 %d승 %d패 %d무 입니다.\n", r.w, r.l, r.d);
			r.save();
		} else if(menuNumber == 3) {
			// 기록 확인하기
			r.load();
			
			System.out.printf("현재 까지 스코어 %d승 %d패 %d무 입니다.\n", r.w, r.l, r.d);
		} else if(menuNumber == 4) {
			System.exit(0);
		}
	}

}
