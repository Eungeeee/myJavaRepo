package com.kh.exam5;

import java.io.*;

class Member implements Serializable {
	private String name;
	private char gender;
	private int age;

	public Member(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c", name, age, gender);
	}
}

public class Sample5 {

	public static void main(String[] args) {

		Member m1 = new Member("홍길동", '남', 30);
		Member m2 = new Member("김철수", '남', 32);

		// 직렬화 : 프로그램 안에서 사용하는 데이터를 다른 포맷 형식으로 변환하는 과정
		try {
			File f = new File("/Users/moongjee/Desktop/Java/member.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(m1);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 역직렬화
		try {
			File f = new File("/Users/moongjee/Desktop/Java/member.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			Member m3 = (Member) obj;
			m3.printInfo();

			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
