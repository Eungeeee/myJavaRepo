package com.kh.exam3;

/*
 *  GUI를 사용하여 자신의  Local PC의 파일 또는 디렉터리의 정보를 보여주는 프로그램
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

class MainWindow {
	private JFrame frm;
	private ArrayList<JLabel> lblList;

	public MainWindow() {
		init();
	}

	private void init() {
		frm = new JFrame("내 PC의 파일 & 디렉터리");
		
		// 박스 레이아웃 : Y_AXIS -> 세로축 방향으로 나열
		frm.setLayout(new BoxLayout(frm.getContentPane(), BoxLayout.Y_AXIS));
		frm.setSize(450, 250);
		
		lblList = new ArrayList<>();
	}
	
	public void addLabel(String text) {
		JLabel lbl = new JLabel(text);
		lblList.add(lbl);
		frm.add(lbl);
	}
	
	public void addBtnTxt() {
		JTextField txt = new JTextField("추가 할 내용을 기입 해 주세요.");
		JButton btn = new JButton("확인");
		
		btn.setSize(10, 25);
		txt.setSize(10, 70);
		
		this.frm.add(txt);
		this.frm.add(btn);
	}
	
	public void show() {
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
	
public class Sample3 {

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		
		File f = new File("/Users/moongjee/Desktop/java1/201228_김은지_backup.zip");
		if(f.exists()) {
			w.addLabel("절대 경로 : " + f.getAbsolutePath());
			w.addLabel("파일/디렉터리 : " + (f.isFile() ? "파일" : "디렉터리"));
			w.addLabel("숨김 : " + (f.isHidden() ? "예" : "아니오"));
			w.addLabel("읽기 : " + (f.canRead() ? "예" : "아니오"));
			w.addLabel("쓰기 : " + (f.canWrite() ? "예" : "아니오"));
			w.addLabel("실행 : " + (f.canExecute() ? "예" : "아니오"));
			
			if(f.isFile()) {
				w.addLabel("파일 크기 : " + f.length() + " 바이트 (" + (f.length() / 1024) + "KB)");
			}
			w.addLabel("수정일 : " + new SimpleDateFormat("YYYY년 MM월 dd일 a hh시 mm분 ss초").format(new Date(f.lastModified())));
		} else {
			w.addLabel("해당 파일 및 디렉터리가 존재하지 않습니다.");
		}
		w.addBtnTxt();
		w.show();
	}
}
