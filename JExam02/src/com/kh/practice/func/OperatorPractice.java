package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void practice1()	{
		/*
		 *  키보드로 입력 받은 정수가 양수면 "양수다"를 출력, 아니면 "양수가 아니다"를 출력
		 *  1. 사용자 입력받기
		 *  2. 입력받은 값에 대해 양수인지 비교
		 *  	a.양수면 "양수다 출력"
		 *  	b.양수가 아니면 "양수가 아니다" 출력
		 */
		System.out.println("1번 실습문제");		
		int num;
		String res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		res = num<0 ? "양수가 아니다." : "양수다.";
		System.out.println(res);
		
	}

	public static void practice2()	{
		System.out.println("2번 실습문제");
		/*
		 * 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
			양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		 *  1. 사용자 입력받기
		 *  2. 입력받은 값에 대해 양수인지 비교
		 *  	a.양수면 "양수다 출력"
		 *  	b.0이 아니면 "양수가 아니다" 출력
		 *  	c.0이면 "0이다" 출력
		 */
		int num;
		String res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		res = num<0 ? "음수다." : num == 0 ? "0이다." : "양수다.";
		System.out.println(res);
		
	}
	public static void practice3()	{
		System.out.println("3번 실습문제");
		/*
		 * 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		 * 1. 사용자 입력받기
		 *  2. 입력받은 값에 대해 짝수인지 비교
		 *  	a.짝수면 "짝수다" 출력
		 *  	b.짝수가 아니면 "홀수다" 출력
		 */
		int num;
		String res;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		res = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(res);
	}
	
	public static void practice4()	{
		System.out.println("4번 실습문제");
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		 * 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		 * 
		 */
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		x = sc.nextInt();
		
		System.out.print("사탕 수 : ");
		y = sc.nextInt();
		
		System.out.println("1인당 사탕 수 : " + y/x);
		System.out.println("남은 사탕 수 : " + y%x);	
	}
	
	public static void practice5()	{
		System.out.println("5번 실습문제");
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		 * 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		 * 이름, 학년, 반, 번호, 성별(M/F), 성적(소수점 아래 둘째자리까지)
		 */		
		String name;
		int lvl,cls,num;
		char gender;
		double grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		name = sc.next();
		
		System.out.println("학년 : ");
		lvl = sc.nextInt();
		
		System.out.println("반 : ");
		cls = sc.nextInt();
		
		System.out.println("번호 : ");
		num = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		gender = sc.next().charAt(0);
		
		System.out.println("성적 : ");
		grade = sc.nextDouble();
		
		System.out.printf("%d 학년 %d 반 %d번 %s %s의 성적은 %.2f이다.",
				lvl,cls,num,name,gender == 'M' ? "남학생" : "여학생",grade);
		
	}
	
	public static void practice6()	{
		System.out.println("6번 실습문제");
		/*
		 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
		 * 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		 */
		int age;
		String f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		age = sc.nextInt();
		
		f = age <= 13 ? "어린이" : age > 13 && age <= 19 ? "청소년" : "성인";
		System.out.println(f);
		
	}
	
	public static void practice7()	{
		System.out.println("7번 실습문제");
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
			세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
			세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
			세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		 */
		int k, e, m, sum;
		double avg;
		String d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		k = sc.nextInt();
		
		System.out.println("영어 : ");
		e = sc.nextInt();
		
		System.out.println("수학 : ");
		m = sc.nextInt();
		
		sum = k+e+m;
		avg = sum/3.0;
				
		System.out.printf("합계 : %d\n평균 : %.2f\n" ,sum,avg);
		
		d = k >= 40 && e >= 40 && m >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(d);
	}
	
	public static void practice8()	{
		System.out.println("8번 실습문제");
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
			String s;
			char jumin;
			
			System.out.print("주민번호 입력(- 포함 입력) : ");
			
			jumin = sc.next().charAt(7);
			s = jumin == '1' || jumin == '3' ? "남자" : "여자";
			
			System.out.println(s);
	}
	
	public static void practice9()	{
		System.out.println("9번 실습문제");
		/*
		 * num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, x;
		boolean b;
		
		System.out.println("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.println("정수 2 : ");
		num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		x = sc.nextInt();
		
		b = x <= num1 || x > num2;
		
		System.out.println(b);
	}
	
	public static void practice10()	{
		System.out.println("10번 실습문제");
		/*
		 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		boolean b;
		
		System.out.println("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.println("정수 2 : ");
		num2 = sc.nextInt();
		
		System.out.println("정수 3 : ");
		num3 = sc.nextInt();
		
		b = num1 == num2 && num2 == num3;
		
		System.out.println(b);
	}


	public static void main(String[] args) {
//		practice1();	// 메서드 호출
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
//		practice10();
}


}