package com.kh.exam2.client;

import java.io.*;
import java.net.*;
import java.util.*;

public class Sample2_C {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			String recv = "", send = "";
			
			// 서버 접속용 소켓 생성 -> 포트 바인딩 -> 접속 요청
			Socket sock = new Socket("127.0.0.1", 51000);
			
			// 통신용 입출력 스트림 생성
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				System.out.print("Client > ");
				send = sc.nextLine();

				// 출력 스트림을 사용하여 서버에 메세지 전송
				sockOut.write(send);
				
				// 버퍼에 쌓여 있는 문자열을 즉시 전송하기 위해 사용
				sockOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}