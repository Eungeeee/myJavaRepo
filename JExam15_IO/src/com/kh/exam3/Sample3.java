package com.kh.exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {

	public static void main(String[] args) {
		/**
		 * 	FileReader / FileWriter
		 * 		- 파일로 부터 문자 단위의 데이터 읽기 / 쓰기
		 * 		- 주로 텍스트 파일에 대한 처리를 담당
		 */
		// 파일 읽기
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileReader fr = new FileReader(f);
			int read;
			char[] cArr = new char[4];
			// 문자 배열로 읽은 데이터를 하나의 문자열로 만들어 출력
			String s = "";
			StringBuffer sb = new StringBuffer();
			while((read = fr.read(cArr)) != -1) {
				s += new String(cArr, 0, read);
				sb.append(cArr, 0, read);
				/* if(cArr.length == read) {
				s += new String(cArr);
				sb.append(cArr);
				} else {
					for(int i = 0; i < read; i++) {
						s += cArr[i];
						sb.append(cArr[i]);
					}
				}
				// System.out.print(cArr);
				// 반복문에서 출력하지 않고 반복이 끝난 이후에 출력하기 위해서 문자열 이용하여 수정
				 */
			}
			System.out.println(s);
			System.out.println(sb.toString());
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoungException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
		
		// 파일 쓰기
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("파일에 문자열 쓰기");
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoungException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
	}

}
