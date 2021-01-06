package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.*;

public class SnackController {
	
	private Snack s;
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s = new Snack(kind, name, flavor, numOf,price);
		
		return"저장 완료되었습니다.";
	}
	
	public String confirmData() {
		// 저장된 데이터를 반환하는 메서드
		return s.information();
	}

}
