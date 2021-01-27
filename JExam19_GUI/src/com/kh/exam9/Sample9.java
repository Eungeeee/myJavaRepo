package com.kh.exam9;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

class EatWhat {
	
	public String Korean() {
		ArrayList<String> KoreanMenu = new ArrayList<>();
		
		String KoreanMenuArr[] = {"된장찌개", "김치찌개", "불고기정식", "콩나물국밥", "설렁탕", "육회비빔밥", "돌솥비빔밥", "설렁탕", "순대국",
				"뼈해장국", "김치찜", "부대찌개", "청국장", "순두부찌개", "낙지볶음", "제육볶음", "오징어볶음", "김치볶음밥", "우렁쌈밥", "잔치국수", "비빔국수"
				, "닭갈비", "냉면", "생선구이정식", "떡만두국"};
		for (int i = 0; i < KoreanMenuArr.length; i++) {
				KoreanMenu.add(KoreanMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * KoreanMenu.size()) -1;
		String get_KoreanMenu = KoreanMenu.get(ran);
	
		KoreanMenu.remove(ran);
		return get_KoreanMenu;
	}
	
	public String Western() {
		ArrayList<String> WesternMenu = new ArrayList<>();
		
		String WesternMenuArr[] = {"알리오올리오 파스타", "샐러드 파스타", "새우 로제 파스타", "까르보나라", "목살 스테이크", "에그베네딕트", "오믈렛", "햄버거", 
				"함박스테이크", "프렌치토스트", "피자", "샌드위치", "치킨"};
		for (int i = 0; i < WesternMenuArr.length; i++) {
				WesternMenu.add(WesternMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * WesternMenu.size()) -1;
		String get_WesternMenu = WesternMenu.get(ran);
	
		WesternMenu.remove(ran);
		return get_WesternMenu;
	}
	
	public String Chinese() {
		ArrayList<String> ChineseMenu = new ArrayList<>();
		
		String ChineseMenuArr[] = {"짜장면", "짬뽕", "탕수육", "마라탕", "마라샹궈", "온면", "깐풍기", "사천 탕수육", "마파두부", "칠리새우", "크림새우",
				"양장피", "고추잡채", "라조기"};
		for (int i = 0; i < ChineseMenuArr.length; i++) {
				ChineseMenu.add(ChineseMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * ChineseMenu.size()) -1;
		String get_ChineseMenu = ChineseMenu.get(ran);
	
		ChineseMenu.remove(ran);
		return get_ChineseMenu;
	}
	
	public String Japanese() {
		ArrayList<String> JapaneseMenu = new ArrayList<>();
		
		String JapaneseMenuArr[] = {"우동", "메밀소바", "일식돈까스", "초밥", "텐동", "오코노미야끼", "가츠동", "데리야끼덮밥", "라멘", "규카츠", "모츠나베",
				"카이센동", "규동", "일식 카레", "가츠산도"};
		for (int i = 0; i < JapaneseMenuArr.length; i++) {
				JapaneseMenu.add(JapaneseMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * JapaneseMenu.size()) -1;
		String get_JapaneseMenu = JapaneseMenu.get(ran);
	
		JapaneseMenu.remove(ran);
		return get_JapaneseMenu;
	}
	
	public String Snack() {
		ArrayList<String> SnackMenu = new ArrayList<>();
		
		String SnackMenuArr[] = {"떡볶이", "오뎅", "순대", "튀김", "라볶이", "참치김밥", "소고기김밥", "치즈김밥", "라면", "만두라면", "떡라면", "치즈라면",
				"돈까스", "군만두", "비빔만두", "치즈돈까스", "오므라이스", "쫄면"};
		for (int i = 0; i < SnackMenuArr.length; i++) {
				SnackMenu.add(SnackMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * SnackMenu.size()) -1;
		String get_SnackMenu = SnackMenu.get(ran);
	
		SnackMenu.remove(ran);
		return get_SnackMenu;
	}
}

class MainWindow {

	private JFrame frm_main;
	
	public MainWindow() {
		frm_main = new JFrame("점심 메뉴 골라주기");
		frm_main.setSize(new Dimension(550,160));
		
		JPanel pan_text = new JPanel(new BorderLayout());
		JPanel pan_up = new JPanel(new FlowLayout(FlowLayout.CENTER));
		frm_main.add(pan_up, BorderLayout.NORTH);
		pan_up.add(pan_text);
		JLabel lbl_notice = new JLabel("결정이 힘든 당신을 위한 점심메뉴 고르기!!");
		lbl_notice.setFont(new Font("SDSamliphopangcheTTFOutline", Font.PLAIN, 30));
		lbl_notice.setForeground(new Color(75, 0, 130));
		pan_text.add(lbl_notice);
		lbl_notice.setOpaque(true);
		
		JPanel lbl = new JPanel(new BorderLayout());
		JPanel pan_north = new JPanel(new FlowLayout(FlowLayout.CENTER));
		frm_main.add(pan_north, BorderLayout.CENTER);
		pan_north.add(lbl);
		
		JPanel pan_center = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JButton btn1 = new JButton("한식");
		btn1.setForeground(new Color(147, 112, 219));
		btn1.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 18));
		btn1.setBounds(30, 100, 50, 30);
		lbl.add(btn1);
		
		JButton btn2 = new JButton("양식");
		btn2.setForeground(new Color(147, 112, 219));
		btn2.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 18));
		btn2.setBounds(50, 170, 50, 30);
		lbl.add(btn2);
		
		JButton btn3 = new JButton("중식");
		btn3.setForeground(new Color(147, 112, 219));
		btn3.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 18));
		btn3.setBounds(70, 170, 50, 30);
		lbl.add(btn3);
		
		JButton btn4 = new JButton("일식");
		btn4.setForeground(new Color(147, 112, 219));
		btn4.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 18));
		btn4.setBounds(90, 170, 50, 30);
		lbl.add(btn4);
		
		JButton btn5 = new JButton("분식");
		btn5.setForeground(new Color(147, 112, 219));
		btn5.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 18));
		btn5.setBounds(110, 170, 50, 30);
		lbl.add(btn5);
		
		frm_main.add(pan_center, BorderLayout.CENTER);
		pan_center.add(btn1);	pan_center.add(btn2);	pan_center.add(btn3);	pan_center.add(btn4);	pan_center.add(btn5);
		
		JLabel Res = new JLabel("결과!!");
		
		Res.setFont(new Font("SDSamliphopangcheTTFBasic", Font.PLAIN, 25));
		Res.setForeground(new Color(55, 0, 120));
		Res.setBounds(50, 100, 200, 60);
		lbl.add(Res);


		
//		ImageIcon ico_img = null;
//		try {
//			ico_img = new ImageIcon(ImageIO.read(new File("/Users/moongjee/FoodImg/Korean/부대찌개.jpg")));
//		} catch (IOException e6) {
//			e6.printStackTrace();
//		}
//		JLabel lbl_img = new JLabel();
//		lbl_img.setIcon(ico_img);
//		lbl_img.setPreferredSize(new Dimension(50, 50));
//		pan_bottom.add(lbl_img);
		
//		JLabel lbl_menuRes = new JLabel();
//		pan_bottom.add(lbl_menuRes);
//		
//		frm_main.add(pan_bottom, BorderLayout.SOUTH);
//		lbl_menuRes.setOpaque(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EatWhat e1 = new EatWhat();
				Res.setText("오늘 당신의 점심 메뉴는 " + e1.Korean() + "입니다.");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EatWhat e2 = new EatWhat();
				Res.setText("오늘 당신의 점심 메뉴는 " + e2.Western() + "입니다.");
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EatWhat e3 = new EatWhat();
				Res.setText("오늘 당신의 점심 메뉴는 " + e3.Chinese() + "입니다.");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EatWhat e4 = new EatWhat();
				Res.setText("오늘 당신의 점심 메뉴는 " + e4.Japanese() + "입니다.");
			}
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EatWhat e5 = new EatWhat();
				Res.setText("오늘 당신의 점심 메뉴는 " + e5.Snack() + "입니다.");
			}
		});
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}
public class Sample9 {
	
	public static void main(String[] args) {
		MainWindow main = new MainWindow();
		main.show();
	}
}
