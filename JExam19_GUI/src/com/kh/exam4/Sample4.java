package com.kh.exam4;

import java.awt.*;
import javax.swing.*;

/*
 *  Layout
 *  	- 컴포넌트를 배치하기 위한 방법이 정의된 것
 *  
 *  FlowLayout
 *  	- 컴포넌트를 배치할 때 왼쪽에서 오른쪽으로 순차 배치 또는 오른쪽에서 왼쪽으로 순차 배치
 *  	- 컴포넌트를 배치할 때 가운데에 위치하도록 배치
 *  	- 창의 크기를 넘기는 컴포넌트들이 사용되면 다음 줄로 자동 배치가 된다.
 *  
 *  BorderLayout
 *  	- 컨테이너의 영역을 동, 서, 남, 북, 중앙 다섯 개의 영역으로 나누어 컴포넌트를 배치
 *  
 *  GridLayout
 *  	- 주어진 row, col의 크기로 컨테이너 영역을 나누어 컴포넌트를 배치 (격자 형식)
 *  
 *  BoxLayout
 *  	- 컴포넌트를 가로 또는 세로 방향으로 배치
 *  	- 영역을 가득 채우는 형태로 배치
 *  
 *  CardLayout
 *  	- 여러장의 카드를 겹쳐 놓은 형태로 컴포넌트를 배치
 *  
 *  GridBagLayout
 *  	- GridLayout과 동일하나 여러 셀을 차지하는 형태로 구성을 할 수 있다.
 */

class FlowWindow{
	private JFrame frm_main;
	
	public FlowWindow() {
		init();
	}
	private void init() {
		frm_main = new JFrame("FlowLayout Window");
		frm_main.setSize(250, 200);
		// FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.CENTER
		frm_main.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15)); 	// 뒤의 숫자는 여백 부여
		
		frm_main.add(new JButton("버튼 1"));
		frm_main.add(new JButton("버튼 2"));
		frm_main.add(new JButton("버튼 3"));
		frm_main.add(new JButton("버튼 4"));
		frm_main.add(new JButton("버튼 5"));
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

class BorderWindow{
	private JFrame frm_main;
	
	public BorderWindow() {
		init();
	}
	private void init() {
		frm_main = new JFrame("BorderLayout Window");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new BorderLayout(20, 20)); 	// 뒤의 숫자는 여백 부여
		
		frm_main.add(new JButton("버튼 1"), BorderLayout.NORTH);
		frm_main.add(new JButton("버튼 2"), BorderLayout.EAST);
		frm_main.add(new JButton("버튼 3"), BorderLayout.SOUTH);
		frm_main.add(new JButton("버튼 4"), BorderLayout.WEST);
		frm_main.add(new JButton("버튼 5"), BorderLayout.CENTER);
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

class BorderFlowWindow{
	private JFrame frm_main;
	
	public BorderFlowWindow() {
		init();
	}
	private void init() {
		// 컨테이너에 컨테이너를 추가하여 사용
		frm_main = new JFrame("BorderFlowLayout Window");
		frm_main.setSize(350, 200);
		frm_main.setLayout(new BorderLayout());
		
		// Panel 컨테이너 추가
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
		frm_main.add(pan, BorderLayout.NORTH);
		pan.add(new JButton("버튼 1-1"));
		pan.add(new JButton("버튼 1-2"));
		pan.add(new JButton("버튼 1-3"));
		
		frm_main.add(new JButton("버튼 2"), BorderLayout.EAST);
		frm_main.add(new JButton("버튼 3"), BorderLayout.SOUTH);
		frm_main.add(new JButton("버튼 4"), BorderLayout.WEST);
		frm_main.add(new JButton("버튼 5"), BorderLayout.CENTER);
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

class GridWindow{
	private JFrame frm_main;
	
	public GridWindow() {
		init();
	}
	private void init() {
		frm_main = new JFrame("GridLayout Window");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new GridLayout(2, 3));
		
		frm_main.add(new JButton("버튼 1"));
		frm_main.add(new JButton("버튼 2"));
		frm_main.add(new JButton("버튼 3"));
		frm_main.add(new JButton("버튼 4"));
		frm_main.add(new JButton("버튼 5"));
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

public class Sample4 {

	public static void main(String[] args) {
		GridWindow grid = new GridWindow();
		grid.show();
		
//		BorderFlowWindow borderflow = new BorderFlowWindow();
//		borderflow.show();
		
//		BorderWindow border = new BorderWindow();
//		border.show();
		
//		FlowWindow flow = new FlowWindow();
//		flow.show();

	}

}
