package com.kh.exam6;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


/*
 *  이벤트(Event)
 *  	- 키보드나 마우스를 클릭하거나 움직이는 등의 동작을 이벤트라고 한다.
 *  	- 이벤트가 발생했을 때 이를 처리하기 위한 객체로 Event Listener 또는 Event Adapter 가 있다.
 *  	- 대표적인 이벤트 종류
 *  		- ActionEvent	 : 컴포넌트가 활성화될 때 발생하는 이벤트
 * 	 		- ContainerEvent : 컨테이너에 컴포넌트가 추가/삭제될 때 발생하는 이벤트
 *  		- FocusEvent	 : 컴포넌트에 포커스가 들어오거나 나갈 때 발생하는 이벤트
 *  		- MouseEvent	 : 마우스를 움직이거나 클릭할 때 발생하는 이벤트
 *  		- KeyEvent		 : 키보드 입력에 의해 발생하는 이벤트
 *  		- WindowEvent	 : 윈도우 창의 활성 및 비활성화에 의해 발생하는 이벤트
 *  
 *  EventListener
 *  	- 발생된 이벤트를 실질적으로 처리하기 위한 코드가 들어간다.
 *  	- 인터페이스로 구현되어 있다.
 *  
 *  EventAdapter
 *  	- 발생된 이벤트를 실질적으로 처리하기 위한 코드가 들어간다.
 *  	- 리스너를 상속받아 추상 클래스로 구현되어 있다.
 */

class EventWindow1 {
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow1() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("이벤트 테스트용");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("라벨 1");
		btn_event = new JButton("버튼 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 익명 클래스로 이벤트를 즉석 생성 및 처리 -> 리스너 인터페이스 사용
		btn_event.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// 컴포넌트에서 마우스를 눌렀다가 땠을때.
				lbl_print.setText("마우스 릴리즈 이벤트 발생!!");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// 컴포넌트에서 마우스를 누룰때 동작
				lbl_print.setText("마우스 프레스 이벤트 발생!!" + e.getButton());
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// 컴포넌트에서 빠져나갈 때 동작
				lbl_print.setText("마우스 Exited 이벤트 발생!!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// 컴포넌트에 진입할 때 동작
				lbl_print.setText("마우스 진입 이벤트 발생!!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 컴포넌트에서 마우스 클릭 동작
				lbl_print.setText("마우스 클릭 이벤트 발생!!" + e.getX() + "|" + e.getY());
				
			}
		});
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


class EventWindow2 {
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow2() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("이벤트 테스트용");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("라벨 1");
		btn_event = new JButton("버튼 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 익명 클래스로 이벤트를 즉석 생성 및 처리 -> 어댑터 사용
		btn_event.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					lbl_print.setText(btn_event.getText() + "을 클릭하였습니다.");
		}
		});
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


class EventWindow3 {
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow3() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("이벤트 테스트용");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("라벨 1");
		btn_event = new JButton("버튼 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	// 내부 클래스로 생성 및 처리
	private class BtnClickAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
		lbl_print.setText("버튼 클릭 이벤트 발생!!!");
		}
	}
	
	private void addEvent() {
		// 내부 클래스로 생성 및 처리
		btn_event.addMouseListener(new BtnClickAdapter());
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


	//독립적인 클래스로 생성 및 처리
class BtnClickAdapter extends MouseAdapter{
	private JLabel lbl_print;
	
	public BtnClickAdapter(JLabel label) {
		lbl_print = label;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		lbl_print.setText("버튼 클릭 이벤트 발생!!!");
	}
}

class EventWindow4 {
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow4() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("이벤트 테스트용");
		frm_main.setSize(250, 200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("라벨 1");
		btn_event = new JButton("버튼 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 내부 클래스로 생성 및 처리
		btn_event.addMouseListener(new BtnClickAdapter(lbl_print));
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

public class Sample6 {

	public static void main(String[] args) {
		new EventWindow3().show();
	}

}

		
//		JPanel pan_input = new JPanel(new BorderLayout());
//		JPanel pan_button = new JPanel(new GridLayout());
//		frm_main.add(pan_input, BorderLayout.NORTH);
//		frm_main.add(pan_button, BorderLayout.CENTER);
//		
//		JPanel pan_putNumber = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
//		pan_input.add(pan_putNumber, BorderLayout.EAST);
//		
//		JTextField txt_putNumber = new JTextField();
//		
//		pan_input.add(txt_putNumber);
//		
//		JPanel pan_PutButton = new JPanel(new  GridLayout(6, 4));
//		pan_input.add(pan_PutButton, BorderLayout.WEST);
//		
//		JButton b1 = new JButton("%");
//		JButton b2 = new JButton("√");
//		JButton b3 = new JButton("x²");
//		JButton b4 = new JButton("¹/x");
//		JButton b5 = new JButton("CE");
//		JButton b6 = new JButton("C");
//		JButton b7 = new JButton("Del");
//		JButton b8 = new JButton("÷");
//		JButton b9 = new JButton("7");
//		JButton b10 = new JButton("8");
//		JButton b11 = new JButton("9");
//		JButton b12 = new JButton("x");
//		JButton b13 = new JButton("4");
//		JButton b14 = new JButton("5");
//		JButton b15 = new JButton("6");
//		JButton b16 = new JButton("-");
//		JButton b17 = new JButton("1");
//		JButton b18 = new JButton("2");
//		JButton b19 = new JButton("3");
//		JButton b20 = new JButton("+");
//		JButton b21 = new JButton("±");
//		JButton b22 = new JButton("0");
//		JButton b23 = new JButton(".");
//		JButton b24 = new JButton("=");
//		
//		pan_button.add(b1);	pan_button.add(b2);	pan_button.add(b3);	pan_button.add(b4);	pan_button.add(b5); pan_button.add(b6);
//		pan_button.add(b7);	pan_button.add(b8);	pan_button.add(b9);	pan_button.add(b10); pan_button.add(b11); pan_button.add(b12);
//		pan_button.add(b13); pan_button.add(b14); pan_button.add(b15); pan_button.add(b16);	pan_button.add(b17); pan_button.add(b18);
//		pan_button.add(b19); pan_button.add(b20); pan_button.add(b21); pan_button.add(b22); pan_button.add(b23); pan_button.add(b24);
//
//		Dimension s = pan_PutButton.getPreferredSize();
//		s.setSize(20, s.getHeight() + 8);
//		pan_PutButton.setPreferredSize(s);
//	}
