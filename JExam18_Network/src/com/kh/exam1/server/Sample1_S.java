package com.kh.exam1.server;

import java.io.*;
import java.net.*;

public class Sample1_S {

	public static void main(String[] args) {
		/*
		 *  UDP
		 *  Server						Client
		 *  	1. 소켓 생성					1. 소켓 생성
		 *  	2. 포트 바인딩					2. 포트 바인딩(옵션-안해도 자동으로 되어있음)
		 *  	3. 수신 대기					3. 송신
		 *  	4. 송신(필요한 경우)			4. 수신 대기(필요한 경우)
		 *  	5. 3 ~ 4 번 과정이 반복			5. 3 ~ 4 번 과정이 반복
		 *  	6. 종료						6. 종료
		 */
		
		// UDP 소켓 생성 -> 51000 번 포트에 바인딩
		try {
		DatagramSocket dSocket = new DatagramSocket(51000);
		
		while(true) {
			// 수신 대기, DatagramPacket이 필요
			byte[] buffer = new byte[512];
			DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length);
			System.out.println("서버 동작 완료 -> 수신 대기 중입니다.");
			dSocket.receive(dPacket);
			
			// 수신받은 메시지를 문자열로 변환 후 출력
			String recv = new String(dPacket.getData(),0,dPacket.getData().length);
			System.out.print("[" + dPacket.getAddress() + " : " + dPacket.getPort() + "] - ");
			System.out.println(recv);
			
			// 수신 잘 받았음을 클라이언트에 송신
			//String send = "수신 완료!!";
			//dPacket = new DatagramPacket(send.getBytes(), send.getBytes().length,
			//		dPacket.getAddress(), dPacket.getPort());
			//dSocket.send(dPacket);
		}
		
		} catch (SocketException e) {
			// DatagramSocket을 사용하기 위해 필요
			e.printStackTrace();
		} catch (IOException e) {
			// dSocket의 receive()를 사용하기 위해 필요
			e.printStackTrace();
		}
		

	}

}
