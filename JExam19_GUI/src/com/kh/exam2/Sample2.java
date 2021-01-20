package com.kh.exam2;

/*
 *  GUI를 사용하여 자신의 PC의 IP 주소를 라벨에 출력하여 보여주는 프로그램
 *  Label -> lbl
 *  Button -> btn
 *  TextField -> txt
 *  CheckBox -> chk
 *  Radio -> rdo
 */

import java.net.*;		// 네트워크 관련 프로그래밍을 위한 import
import javax.swing.*;	// Swing GUI 프로그래밍을 위한 import

// 메인 창 구성을 위한 클래스
class MainWindow {
	// 프레임 컨테이너 참조변수 생성
	private JFrame f;
	
	// 프레임에 배치할 라벨 컴포넌트 참조변수 생성
	private JLabel lbl_Ip;

	// 기본 생성자
	public MainWindow() {
		// 메인 화면 초기화
		init();
	}

	private void init() {
		// 프레임 생성
		f = new JFrame("나의 IP 주소");
		
		// 프레임 크기 설정 (창 크기를 너비 : 250, 높이 : 100 으로 설정)
		f.setSize(250, 100);

		// 라벨 생성
		lbl_Ip = new JLabel();
		
		// 생성한 라벨을 프레임에 추가(배치)
		f.add(lbl_Ip);
	}

	// 라벨에 텍스트를 설정하기 위한 메서드
	public void setLabelIp(String ip) {
		lbl_Ip.setText("IP Address : " + ip);
	}
	
	// 프레임은 가시화 되어 있지 않기 때문에 가시화 시켜주기 위한 메서드
	public void show() {
		// 프레임의 기본 종료 버튼을 누르면 프로그램 종료로 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프로그램 가시화
		f.setVisible(true);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// 메인 윈도우 생성
		MainWindow w = new MainWindow();

		try {
			// 자신의 IP 주소 추출
			String myIp = InetAddress.getLocalHost().getHostAddress();
			
			// 생성된 윈도우의 라벨에 추출하 IP 주소 설정
			w.setLabelIp(myIp);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// 메인 윈도우 가시화
		w.show();
	}

}
