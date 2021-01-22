package com.kh.exam8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// https://docs.oracle.com/javase/tutorial/uiswing/components/index.html

class SubWindow{
	private JFrame frm_sub;
	
	public SubWindow() {
		frm_sub = new JFrame("서브 창");
		frm_sub.setSize(new Dimension(150, 100));
		
		JButton btn1 = new JButton("닫기");
		frm_sub.add(btn1, BorderLayout.CENTER);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_sub.dispose(); // 프레임 닫기 : 프레임만 닫고 프로그램 종료는 하지 않는다.
			}
		});
	}
	
	public void show() {
		// 프레임 닫기 : 프레임만 닫고 프로그램 종료는 하지 않는다.
		frm_sub.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm_sub.setVisible(true);
	}
	
}

class MainWindow{
	private JFrame frm_main;
	
	public MainWindow() {
		frm_main = new JFrame("메인 창");
		frm_main.setSize(new Dimension(350, 200));
		
		JButton btn1 = new JButton("서브 창 열기");
		frm_main.add(btn1, BorderLayout.WEST);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SubWindow().show();
			}
		});
		
		JButton btn2 = new JButton("종료");
		frm_main.add(btn2, BorderLayout.CENTER);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JButton btn3 = new JButton("다이얼로그");
		frm_main.add(btn3, BorderLayout.EAST);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frm_main, "알림메세지 입니다.");
				// 마크가 다르게 나옴
				// JOptionPane.showMessageDialog(frm_main, "주의 메세지 입니다.", "주의!!", JOptionPane.WARNING_MESSAGE);
				// JOptionPane.showMessageDialog(frm_main, "에러 메세지입니다.", "에러!!", JOptionPane.ERROR_MESSAGE);
				// JOptionPane.showMessageDialog(frm_main, "질문 메세지입니다.", "질문!!", JOptionPane.QUESTION_MESSAGE);
				
				// JOptionPane.showConfirmDialog(frm_main, "확인 다이얼로그");
				// JOptionPane.showInputDialog(frm_main, "값을 입력하세요.");
				
				// 질문에 효과적인 코드
				// JOptionPane.showConfirmDialog(frm_main, "확인 다이얼로그", "예/아니오", JOptionPane.YES_NO_OPTION);
				// JOptionPane.showInputDialog(frm_main, "너 몇살이야?", JOptionPane.QUESTION_MESSAGE);
			}
		});
		
		// 생성된 화면 어디에서든 키 입력 이벤트를 처리 할 수 있다.
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher(){
			@Override
			public boolean dispatchKeyEvent(KeyEvent e) {
				if(e.getID() == KeyEvent.KEY_PRESSED) {
					System.out.println(e.getKeyCode());
				}
				return false;
			}
		});
		
/*		btn1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				switch (e.getKeyCode()) {
					case KeyEvent.VK_ALT :
						System.out.println("알트 키를 눌렀습니다."); break;
					case KeyEvent.VK_CONTROL :
						System.out.println("컨트롤 키를 눌렀습니다."); break;
					case KeyEvent.VK_WINDOWS :
						System.out.println("윈도우 키를 눌렀습니다."); break;
						
				}
			}
		});
*/	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

public class Sample8 {

	public static void main(String[] args) {
		new MainWindow().show();
	}

}
