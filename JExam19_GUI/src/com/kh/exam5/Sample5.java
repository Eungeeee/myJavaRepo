package com.kh.exam5;

import java.awt.*;

import javax.swing.*;

class MainWindow{
	private JFrame frm_main;
	
	public MainWindow() {
		init();
	}
	
	public void init() {
		frm_main = new JFrame("Login");
		frm_main.setSize(350, 110);
		frm_main.setLayout(new BorderLayout());
		
		JPanel pan_input = new JPanel(new BorderLayout());
		JPanel pan_button = new JPanel(new FlowLayout(FlowLayout.CENTER));
		frm_main.add(pan_input, BorderLayout.NORTH);
		frm_main.add(pan_button, BorderLayout.CENTER);
		
		JPanel pan_user = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		JPanel pan_pass = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		pan_input.add(pan_user, BorderLayout.NORTH);
		pan_input.add(pan_pass, BorderLayout.CENTER);
		
		JLabel lbl_username = new JLabel("Username : ");
		JTextField txt_username = new JTextField();
		JLabel lbl_password = new JLabel("Password : ");
		JTextField txt_password = new JTextField();
		
		pan_user.add(lbl_username);		pan_user.add(txt_username);
		pan_pass.add(lbl_password);		pan_pass.add(txt_password);
		
		JButton btn_login = new JButton("Login");
		JButton btn_cancel = new JButton("Cancel");
		pan_button.add(btn_login);		pan_button.add(btn_cancel);
		
		Dimension s = txt_username.getPreferredSize();
		s.setSize(275, s.getHeight() + 2);
		txt_username.setPreferredSize(s);
		txt_password.setPreferredSize(s);
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setResizable(false);
		frm_main.setVisible(true);
	}
}

public class Sample5 {

	public static void main(String[] args) {
		MainWindow loginview = new MainWindow();
		loginview.show();

	}

}
