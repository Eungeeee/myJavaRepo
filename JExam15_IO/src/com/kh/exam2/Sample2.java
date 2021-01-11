package com.kh.exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		/**
		 *  FileInputStream
		 * 		- 바이트 단위로 파일을 읽기
		 * 		- 주로 그림, 오디오, 비디오 등과 같은 파일을 읽기 위해 사용
		 */

		// 파일 읽기를 위한 기본 형태
		System.out.println("\n============파일을 읽기 위한 기본 형태============");
		try {
			// FileInputStream fis = new
			// FileInputStream("/Users/moongjee/Desktop/Java/Sample.txt");
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int read;
			while (true) { // 반복문을 사용해서 파일의 모든 바이트 데이터를 읽는다.
				read = fis.read(); // 1 Byte 단위로 읽기
				if (read == -1) { // 읽은 바이트가 -1 이 되면 더 이상 읽을 데이터가 없다.
					break;
				}
				System.out.print(read); // 바이트 코드 출력
				// System.out.print((char)read); // 바이트 코드를 문자 코드로 변환하여 출력
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}

		
		
		// 파일을 읽기 위한 반복문 변형
		System.out.println("\n\n============파일을 읽기 위한 반복문 변형============");
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int read;
			while ((read = fis.read()) != -1) { // 읽은 바이트는 read 저장 후 저장된 값이 -1 이 아니면 반복
				System.out.print(read); // 바이트 코드 출력
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}

		
		
		// 파일을 읽기 위한 방법으로 배열을 사용
		// 배열의 크기만큼 데이터를 읽고 처리
		System.out.println("\n\n============파일을 읽기 위한 방법으로 배열 사용============");
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int read;
			byte[] bArr = new byte[4]; // 읽을 데이터의 크기를 배열의 크기로 정한다.
			while ((read = fis.read(bArr)) != -1) { // 읽은 바이트는 read 저장 후 저장된 값이 -1 이 아니면 반복
				System.out.write(bArr); // write를 사용하면 바이트 배열을 출력할 수 있다.
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
		
		
		/**
		 * 	FileOutputStream
		 * 		- 파일에 바이트 단위로 데이터를 저장
		 * 		- 주로 그림, 오디오, 비디오 등과 같은 파일의 쓰기를 위해 사용
		 */
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			// FileOutputStream fos = new FileOutputStream(f); 		// 기존 파일의 내용을 덮어쓴다.
			FileOutputStream fos = new FileOutputStream(f, true);	// 기존 파일의 내용 마지막에 이어쓴다.
			byte[] bArr = new byte[] {66, 67, 68, 69};
			fos.write(bArr);
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}

	}

}
