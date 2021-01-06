package com.kh.class2;

	public class UserInfo {
		
		private String name;
		private int age;
		private char gender;
		
		public UserInfo() {};	
	
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public char getGender() {
			return gender;
		}
	
		public void setName(String name) {
		
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setGender(char gender) {
			this.gender = gender;
		}

	
		public static void main(String[] args) {
		
			UserInfo info = new UserInfo();
			info.setAge(20);
			info.setName("홍길동");
			info.setGender('M');
			
			System.out.println("이름 : "+ info.getName());
			System.out.println("나이 : "+ info.getAge());
			System.out.println("성별 : "+ info.getGender());
			
			UserInfo kim = new UserInfo();
			kim.setAge(25);
			kim.setName("김철수");
			kim.setGender('M');
			
			System.out.println("이름 : "+ kim.getName());
			System.out.println("나이 : "+ kim.getAge());
			System.out.println("성별 : "+ kim.getGender());

		}
}
