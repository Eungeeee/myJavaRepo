package com.kh.exam6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Map;

public class Sample6 {

	public static void main(String[] args) {
		/*
		 * 	Map
		 * 		- 키와 값의 쌍으로 구성된 객체를 저장(키, 값 모두 객체이다.)
		 * 		- 키는 중복될 수 없으나 값은 중복 가능하다.
		 * 		- 사전과 같은 형태의 자료구조이다.
		 * 		- HashMap, HashTable, LinkedHashMap, Properties, TreeMap
		 */
		
		/*
		 *  HashMap
		 *  
		 *  HashTable
		 *  	- HashMap 과 동일한 구조를 가지나 동기화된 메서드로 구성되어 있어
		 *  	  멀티스레드 환경에서의 안정성을 가진다.
		 */
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 추가
		hm.put("가", 10);	hm.put("나", 20);	hm.put("다", 30);
		System.out.println(hm);
		
		// 수정 : 동일한 키의 값을 사용하면 수정이 됨
		hm.put("가", 40);
		System.out.println(hm);
		
		// 검색
		System.out.println("키 검색 -> " + hm.containsKey("가"));
		System.out.println("키 검색 -> " + hm.containsKey("마"));
		
		// 값 검색
		System.out.println("키 검색 -> " + hm.containsValue(30));
		System.out.println("키 검색 -> " + hm.containsValue(10));
		
		// 키/값 쌍 추출
		Set<Map.Entry<String, Integer>> entry = hm.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + " | " + m.getValue());
		}
		
		// 키만 추출
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		// 값만 추출
		ArrayList<Integer> values = new ArrayList<>(hm.values());
		System.out.println(values);
		
		// 크기
		System.out.println(hm.size());
		
		// 삭제
		int res = hm.remove("가");
		System.out.println(hm + " | " + res);
		
		if(hm.remove("가") == null) {
			System.out.println("이미 삭제 되었습니다.");
		}
		
		/*
		 *  Properties
		 *  	- 키와 값의 데이터 타입을 String으로 제한되어 있다.
		 *  	- 프로퍼티 파일에 대한 데이터 처리를 할 때 주로 사용
		 *  	  프로퍼티 파일 : 특정 프로그램이 동작할 때 추가로 적용할 또는
		 *  				   기본적으로 적용된 속성이 저장된 파일
		 */
		Properties prop = new Properties();
		
		// 추가 / 수정
		prop.setProperty("가", "딸기");
		prop.setProperty("나", "수박");
		prop.setProperty("다", "포도");
		System.out.println(prop);
		
		// 검색
		System.out.println(prop.getProperty("가"));
		
		// 파일로 저장
		try {
			prop.store(new FileWriter(new File("/Users/moongjee/Desktop/Java/program.ini")), "프로퍼티 파일");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// 저장된 프로퍼티 불러오기
		try {
			prop.load(new FileReader(new File("/Users/moongjee/Desktop/Java/program2.ini")));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
	}

}
