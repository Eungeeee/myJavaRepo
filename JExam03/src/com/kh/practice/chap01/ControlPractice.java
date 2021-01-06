package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		
		int num;
		
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (num == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (num == 3) {
			System.out.println("조회 메뉴입니다.");		
		} else if (num == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (num == 7) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("해당하는 메뉴가 없습니다.");
		}
		
	}
	
	public static void practice2() {
		/*
		 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		 * 짝수가 아니면 “홀수다“를 출력하세요. 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 */
		int num;
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		num = sc.nextInt();
		
		if(num>0 && num%2==0) {
			System.out.println("짝수다");
		} else if (num<0) {
			System.out.println("양수가 아니다");
		} else {
			  System.out.println("홀수다");
		  }
		}
	
	public static void practice3() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		 * 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */
		
		int score1, score2, score3, tot;
		double avg;
		
		System.out.println("국어 점수 : ");
		score1 = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		score2 = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		score3 = sc.nextInt();
		
		tot = score1 + score2 + score3;
		avg = tot/3;
		
		if (score1>=40 && score2>=40 && score3>=40 && avg>=60) {
			System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n"
					+ "평균 : %.1f\n축하합니다, 합격입니다!",score1,score2,score3,tot,avg);
		} else {
			System.out.println("불합격 입니다.");
		}
	}
	
	public static void practice4() {
		// if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요
		
		int month;
		String season;
		
		System.out.println("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1:
			season = "겨울"; break;
		case 2:
			season = "겨울"; break;
		case 3:
			season = "봄"; break;
		case 4:
			season = "봄"; break;
		case 5:
			season = "봄"; break;
		case 6:
			season = "여름"; break;
		case 7:
			season = "여름"; break;
		case 8:
			season = "여름"; break;
		case 9:
			season = "가을"; break;
		case 10:
			season = "가을"; break;
		case 11:
			season = "가을"; break;
		case 12:
			season = "겨울"; break;
		default:
			season = "잘못 입력된 달";
		}
		System.out.printf("%d월은 %s입니다.",month, season);
		}
	
	public static void practice5(){
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”,
		 * 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		 */
		
		String id, pw;
		String id_input, pw_input;
		
		id = "myId";	pw = "myPassword12";
		
		System.out.print("아이디 입력 : ");
		id_input = sc.next();
		
		System.out.print("패스워드 입력 : ");
		pw_input = sc.next();
		
		if(id.equals(id_input) && pw.equals(pw_input)) {
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(id_input) && !pw.equals(pw_input)) {
				System.out.println("아이디와 패스워드가 틀렸습니다.");
			} else if(!id.equals(id_input)) {
				System.out.println("아이디가 틀렸습니다.");
			} else if(!id.equals(pw_input)) {
				System.out.println("패스워드가 틀렸습니다.");
			}
		}
		
	}
		
	public static void practice6(){
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만 가능합니다.
		 */
		
		String perm;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 (관리자, 회원, 비회원) : ");
		perm = sc.next();
		
//(1)
//		if (perm.equals("관리자")) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (perm.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (perm.equals("비회원")) {
//			System.out.println("게시글 조회");
//		} else {
//			System.out.println("잘못된 권한 등급입니다.");
//		}
	
//(2)		
//		String res = ""; //= ""; -> 매 줄 초기화 시켜주는 것 (복합할당 연산자를 사용할 경우 필요함 (+=) )
//		
//		switch(perm) {
//			case "관리자":
//				res += "회원관리, 게시글 관리, ";
//			case "회원":
//				res += "게시글 작성, 댓글 작성, ";
//			case "비회원":
//				res += "게시글 조회";
//				break;
//			default:
//				res = "잘못된 권한 등급입니다.";
//		}
//		System.out.println(res);

//(3)		
		String res;
		
		switch(perm) {
			case "관리자":
				res = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성"; break;
			case "회원":
				res = "시글 작성, 게시글 조회, 댓글 작성"; break;
			case "비회원":
				res = "게시글 조회"; break;
			default:
				res = "잘못된 권한 등급입니다.";
		}
		System.out.println(res);
		
	}

	public static void practice7(){
		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 BMI가 23이상 25미만일 경우 과체중
		 * 25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만
		 */	
		
		double height, weight, bmi;
		String res;
		
		System.out.print("키를 입력해 주세요 : ");
		height = sc.nextDouble();
		height = height/100;
		
		System.out.print("몸무게를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height * height);
		
		if (bmi<18.5) {
			res = "저체중";
		} else if (bmi>=18.5 && bmi<23) {
			res = "정상체중";
		} else if (bmi>=23 && bmi<25) {
			res = "과체중";
		} else if (bmi>=25 && bmi<30) {
			res = "비만";
		} else {
			res = "고도비만";
		}
		
		System.out.printf("BMI 지수 : %.2f\n" , bmi);
		System.out.print(res);
	}

	public static void practice8(){
		
		/*
		 * 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		 * (단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		 */
		
		int x, y;
		char op;
		
		System.out.print("피연산자 1 : ");
		x = sc.nextInt();
		
		System.out.print("피연산자 2 : ");
		y = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/,%) : ");
		op = sc.next().charAt(0);
		
		if(x>0 && y>0) {
		switch(op) {
			case'+':
				System.out.printf("%d + %d = %d", x, y, x+y);
				break;
			case'-':
				System.out.printf("%d - %d = %d", x, y, x-y);
				break;
			case'*':
				System.out.printf("%d * %d = %d", x, y, x*y);
				break;
			case'/':
				System.out.printf("%d / %d = %f", x, y, (double)x/y);
				break;
			case'%':
				System.out.printf("%d %% %d = %d", x, y, x%y);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");	
		}
		
		}
		
		
	}
	
	public static void practice9(){	
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		 * 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 */
		
		double mid, fin, hmk, score, atd, atd_res;
		String res;
		
		System.out.print("중간고사 점수 : ");
		mid = sc.nextDouble();

		System.out.print("기말고사 점수 : ");
		fin = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		hmk = sc.nextDouble();
		
		System.out.print("출석 회수 : ");
		atd = sc.nextInt();
		
		atd_res = (atd/20)*100;
		
		score = (mid*0.2)+(fin*0.3)+(hmk*0.3)+(atd_res*0.2);
		
		System.out.println("================= 결과 =================");
		System.out.println("중간 고사 점수(20) : "+mid*0.2);
		System.out.println("기말 고사 점수(30) : "+fin*0.3);
		System.out.println("과제 점수    (30) : "+hmk*0.3);
		System.out.println("출석 점수    (20) : "+atd_res*0.2);
		System.out.println("총 점 : "+score);
		
		if(score>=70) {
			res = "Pass";
		} else {
			res = "Fail [점수 미달]";
		} if(atd<14) {
			res = "Fail [출석 회수 부족 (" +atd+ "/20)";
		} 
		
		System.out.print(res);
		
	}
	
	public static void practice10(){	
		
		int select;
		
		System.out.printf("실행할 기능을 선택하세요.\n1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n"
				+ "4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F\n선택 : ");
		select = sc.nextInt();
		
		switch(select) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
				
		}
		
	}

	public static void main(String[] args) {
		practice10();
		sc.close();
	}

}
