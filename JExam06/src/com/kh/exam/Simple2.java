package com.kh.exam;

public class Simple2 {
	
	public static void func1() {
		/*
		 * 2차원배열 생성
		 */
		int[][]arr;			// 2차원배열 선언
		arr = new int[2][3];// 2차원배열 생성 (기본값 0 으로 생성되어 있음)
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("arr[%d][%d] -> %d\n", i, j, arr[i][j]);
		}
//		for(int i = 0; i < 2; i++) {
//			System.out.printf("arr[%d][0] -> %d\n",i, arr[i][0]);
//			System.out.printf("arr[%d][1] -> %d\n",i, arr[i][1]);
//			System.out.printf("arr[%d][2] -> %d\n",i, arr[i][2]);
		}
		
	}
	
	public static void func2() {
		/*
		 * 2020년도 11월 달력
		 */
		int[][]arr = new int[][]{{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21},
			{22,23,24,25,26,27,28},{29,30,0,0,0,0,0}};
			
			int day = 1;
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j< 7; j++) {
					if(day <= 30) {
						arr[i][j] = day;
						day++;
					}
				}
			}
			System.out.println("\t일\t월\t화\t수\t목\t금\t토");
			for(int i = 0; i < 5; i++) {
				System.out.printf("%d주차\t",i + 1);
				for(int j = 0; j< 7; j++) {
					if(arr[i][j] != 0) {
					System.out.print(arr[i][j]+"\t");
				}
			}
				System.out.println();
			}
	}
	
	public static void func3() {
		int[][]arr = new int[][] {{24752,365,147},{26708,357,134}};
		
		System.out.println("구분\t확진자\t\t사망자\t\t치명률");
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				System.out.print("남성\t");
				} else {
					System.out.print("여성\t");
			}
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
	
	public static void func4() {
		
		int[][]arr = new int[][] {{2479,384,1549},{4065,211,519},{8015,88,11},{9582,29,3},{7223,6,8},
			{6518,4,6},{8657,0,0},{3206,0,0},{1715,0,0}};
			
		String[] rowName = {
				"80 이상","70-79","60-69","50-59","40-49","30-39",
				"20-29","10-19","0-9"
		};
			
			System.out.println("구분\t\t확진자\t\t사망자\t\t치명률");
			for(int i = 0; i < 9; i++) {
				System.out.print(rowName[i] + "\t\t");
//				if(i == 0) {
//					System.out.print("80 이상\t\t");
//				} else if(i == 1) {
//					System.out.print("70-79\t\t");
//				}else if(i == 2) {
//					System.out.print("60-69\t\t");
//				}else if(i == 3) {
//					System.out.print("50-59\t\t");
//				}else if(i == 4) {
//					System.out.print("40-49\t\t");
//				}else if(i == 5) {
//					System.out.print("30-39\t\t");
//				}else if(i == 6) {
//					System.out.print("20-29\t\t");
//				}else if(i == 7) {
//					System.out.print("10-19\t\t");
//				}else if(i == 8) {
//					System.out.print("0-9\t\t");
//				}
				for(int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + "\t\t");
				}
				System.out.println();
			}
	}
	
	public static void func5() {
		
		int[][]arr = new int[][] {
			{1092,1060,32,52550,15085,36726,739,10135},{376,373,3,15732,6723,8864,145,16163},
			{32,32,0,1571,461,1082,28,4605},{24,24,0,7581,259,7122,200,31114},{49,46,3,2430,745,1665,20,8220}
		};
		
		// 콘솔에 출력할 때 사용할 행 이름
		String[] rowName = {"합계","서울","부산","대구","인천"};
		
		System.out.println("시도명\t합계\t국내발생\t해외유입\t확진환자\t격리중\t격리해제\t사망자\t발생률");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(rowName[i] + "\t");
			for(int j = 0; j < 8; j++) {
				if(j == 7) {
					System.out.print(arr[i][j]/100.0 + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
					}
			}
			System.out.println();
		}
	}
	
	public static void func6() {
		
		
	}

	public static void main(String[] args) {
//		func1();
//		func2();
//		func3();
//		func4();
//		func5();
		func6();

	}

}
