package com.kh.class2;

public class Run {

	public static void main(String[] args) {
		UserInfo info = new UserInfo();
		info.setName("홍길동");
		info.setAge(25);
		info.setGender('M');
		
		System.out.println("이름 : "+info.getName());
		System.out.println("나이 : "+info.getAge());
		System.out.println("성별 : "+info.getGender());
		
		// private 접근제한자로 인해 외부 클래스에서 접근 불가
		// info.name = "홍길동";
		// info.age = 25;
		// info.gender = 'M';
	}

}
