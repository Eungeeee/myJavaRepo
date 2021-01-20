package com.kh.exam1;

/*
 *  GUI
 * 		- 사용자가 프로그램을 편하게 사용할 수 있도록 그래픽으로 처리된 인터페이스를 제공할 수 있게 만들어진 라이브러리
 * 		- Java에서 제공하는 GUI 라이브러리로 AWT, Swing(스윙), JavaFx 가 있다.
 *  
 *  컨테이너(Container)
 *  	- 윈도우의 창과 같은 역할을 수행하는 것
 *  	- 다양한 컴포넌트들이 배치가 된다.
 *  
 *  컴포넌트(Component)
 *  	- 컨테이너에 배치되어 화면을 구성 할 요소들
 *  	- 버튼, 텍스트 입력, 라벨, 체크 박스, 라디오 버튼 등..
 *  
 *  레이아웃(Layout)
 *  	- 컨테이너에 컴포넌트를 배치하는 방법에 대한 정의가 되어 있는 요소
 *  	- FlowLayout, GridLayout, BorderLayout 등..
 */

import java.awt.*;
import javax.swing.*;

class MainWindow{
	private JFrame f;
	
	public MainWindow() {
		init();
	}
	
	private void init() {
		// 초기 설정
		this.f = new JFrame("메인 창");
		// this.f.setTitle("메인 창");
		this.f.setSize(300, 250);
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// this.f.setLayout(new FlowLayout(FlowLayout.LEFT)); // 레이아웃 설정 -> 왼쪽에서 오른쪽 방향으로 컴포넌트 배치
		this.f.setLayout(null); // 레이아웃을 사용하지 않고 자유 배치가 될 수 있게 한다.
		
		// 컴포넌트 생성
		JButton btn = new JButton("버튼");
		JLabel lbl = new JLabel("라벨");
		JTextField txt = new JTextField("텍스트");
		
		// 컴포넌트 위치 및 크기 설정 (레이아웃을 사용하지 않을 때)
		//		   	   x  y width height
		btn.setBounds(10, 10, 75, 25);
		lbl.setBounds(20, 40, 75, 25);
		txt.setBounds(10, 70, 75, 25);
		
		// 생성한 컴포넌트를 컨테이너에 배치 -> 레이아웃 설정에 맞추어 배치가 된다.
		this.f.add(btn);
		this.f.add(lbl);
		this.f.add(txt);
		
		// 컴포넌트의 텍스트 변경
		btn.setText("확인");
		lbl.setText("텍스트를 변경하였습니다.");
		txt.setText("데이터를 입력하세요.");
		
		// 컴포넌트의 텍스트 추출 (콘솔)
		System.out.println(btn.getText());
		System.out.println(lbl.getText());
		System.out.println(txt.getText());
		
	}
	
	public void show() {
		this.f.setVisible(true);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		w.show();
	}

}
