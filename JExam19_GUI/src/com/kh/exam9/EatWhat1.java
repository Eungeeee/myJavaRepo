package com.kh.exam9;
import java.util.ArrayList;

public class EatWhat1 {
	
	private void Korean() {
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
		System.out.println(get_KoreanMenu);
	}
	
	private void Western() {
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
		System.out.println(get_WesternMenu);
	}
	
	private void Chinese() {
		ArrayList<String> ChineseMenu = new ArrayList<>();
		
		String ChineseMenuArr[] = {"자장면", "짬뽕", "탕수육", "마라탕", "마라샹궈", "온면", "깐풍기", "사천 탕수육", "마파두부", "칠리새우", "크림새우",
				"양장피", "고추잡채", "라조기"};
		for (int i = 0; i < ChineseMenuArr.length; i++) {
				ChineseMenu.add(ChineseMenuArr[i]);
			}
			
		double randomValue = Math.random();
		int ran = (int)(randomValue * ChineseMenu.size()) -1;
		String get_ChineseMenu = ChineseMenu.get(ran);
	
		ChineseMenu.remove(ran);
		System.out.println(get_ChineseMenu);
	}
	
	private void Japanese() {
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
		System.out.println(get_JapaneseMenu);
	}
	
	private void Snack() {
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
		System.out.println(get_SnackMenu);
	}
	
	public static void main(String[] args) {
		EatWhat e1 = new EatWhat();
		e1.Korean();
		
		EatWhat e2 = new EatWhat();
		e1.Western();
		
		EatWhat e3 = new EatWhat();
		e1.Chinese();
		
		EatWhat e4 = new EatWhat();
		e1.Japanese();
		
		EatWhat e5 = new EatWhat();
		e1.Snack();
		
		}
	}
