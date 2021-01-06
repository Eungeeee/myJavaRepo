package com.kh.class3.run;

//import com.kh.class3.user.UserInfo;
import com.kh.class3.user.*;

public class Run {

	public static void main(String[] args) {
		
		UserInfo info = new UserInfo();
		
		info.setName("홍길동");
		info.setAge(25);
		info.setGender('M');
		
		System.out.println("이름 : "+info.getName());
		System.out.println("나이 : "+info.getAge());
		System.out.println("성별 : "+info.getGender());


	}

}
