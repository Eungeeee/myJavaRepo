package com.kh.exam1.client;

import java.io.IOException;
import java.util.*;
import java.net.*;

public class Sample1_C {
	
	public static Scanner sc = new Scanner(System.in);

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
		
		byte[] ip = new byte[] { 127, 0, 0, 1 };
		InetAddress serverIp = null;
		
		try {
			serverIp = InetAddress.getByAddress(ip);
			// UDP 소켓 생성 -> 랜덤 포트 사용
			DatagramSocket dSocket = new DatagramSocket(51000);

			while(true) {
				// 서버에 메세지 송신
				// String send = "Hello~ Server!!";
				System.out.print(">>> ");
				String send = sc.nextLine();
				DatagramPacket dPacket = new DatagramPacket(send.getBytes(), send.getBytes().length,
						serverIp, 51000);
				dSocket.send(dPacket);
	
				// 수신 대기, DatagramPacket이 필요
				//byte[] buffer = new byte[512];
				//dPacket = new DatagramPacket(buffer, buffer.length);
				//System.out.println("서버에 메세지를 전송했습니다. 서버로 부터의 응답을 대기합니다.");
				//dSocket.receive(dPacket);
	
				// 수신받은 메세지를 문자열로 변환 후 출력
				//String recv = new String(dPacket.getData(), 0, dPacket.getData().length);
				//System.out.print("[" + dPacket.getAddress() + " : " + dPacket.getPort() + "] - ");
				//System.out.println(recv);
				}

		} catch (SocketException e) {
			// DatagramSocket을 사용하기 위해 필요
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// InetAddress.getByAddress(ip)를 사용하기 위해 필요
			e.printStackTrace();
		} catch (IOException e) {
			// dSocket의 receive()를 사용하기 위해 필요
			e.printStackTrace();
		}

	}

}
