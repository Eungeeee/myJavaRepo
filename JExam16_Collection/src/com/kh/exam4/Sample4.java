package com.kh.exam4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * 로또 자동 추출 프로그램 만들기
 * 		- 1 ~ 45 까지의 랜덤 정수를 6개 생성
 * 		- 생성된 정수는 리스트 컬렉션에 저장(중복 데이터는 없어야 한다.)
 * 		- 자동, 반자동 기능을 넣도록 한다.
 * 			자동 : 6개의 정수가 모두 랜덤 생성
 * 			반자동 : 일부 정수를 매개변수로 받고 나머지 정수값을 랜덤 생성
 * 
 * 계획 먼저 세우기
 * 		- 필요한 멤버 필드 작성
 * 		- 필요한 메서드 작성 (매개변수 타입, 값 / 반환 타입, 값)
 * 		- 클래스 사용 방식 -> 생성자
 * 
 * 추가 기능 구현
 * 		- 생성된 로또 번호를 파일로 출력할 수 있게 하시오.
 */
class Lotto {

	private Random rand = new Random();
	private ArrayList<Integer> numbers;

	public Lotto() {
		numbers = new ArrayList<>();
	}

	// 가변 매개변수
	public Lotto(int... nums) {
		this();
		addArray(nums);
	}

	private void addArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i >= 6) {
				break;
			}
			numbers.add(nums[i]);
		}
	}

	private int generate() {
		int num;
		do {
			num = rand.nextInt(45) + 1;
		} while (numbers.contains(num));
		return num;
	}

	public ArrayList<Integer> getLotto() {
		while (numbers.size() < 6) {
			numbers.add(generate());
		}
		Collections.sort(numbers);
		return numbers;
	}

	public ArrayList<Integer> getLotto(int... nums) {
		numbers = new ArrayList<Integer>();
		addArray(nums);
		return getLotto();
	}

	public void clear() {
		numbers.clear();
	}
}


public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto l = new Lotto();
		System.out.println(l.getLotto(3, 6, 18));
		System.out.println(l.getLotto(8, 13));
		System.out.println(l.getLotto());
		
		String[] sArr = new String[l.getLotto().size()];
		l.getLotto().toArray(sArr);
		
		try {
			File f = new File("/Users/moongjee/Desktop/Java/LOTTO.txt");
			FileWriter fw = new FileWriter(f);
			fw.write(sArr[0]);
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoungException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
	}

	}
