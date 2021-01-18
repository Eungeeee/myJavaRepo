package com.kh.exam3;

class Bank implements Runnable{
	private String name;
	private int money;
	private String who;
	private int outMoney;
	
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// synchronized 를 사용하지 않으면 멀티스레드 동작에 공유자원에 대한 접근이
	// 동시에 이루어져 if 문의 조건 테스트가 모두 참으로 보게 되는 경우 후속 스레드에서
	// 이미 변경된 값에 대해 1차 스케쥴에 의해 실행된 조건식 결과로 판단하여 2차 스케쥴에 의해 실행될 때 문제가 발생.
	public synchronized void moneyOut(String who, int money) {
		// 누가 내 통장에 돈을 출금했나?
		if(this.money - money > 0) {
			System.out.println(who + " 이(가) " + name + " 님의 통장에서 " + money + "원을 출금했습니다.");
			this.money -= money;
		} else {
			System.out.println("통장의 잔액이 부족합니다. 현재 잔액 : " + this.money);
		}
	}
	
	public void setWho(String who) {
		this.who = who;
	}
	
	public void setOutMoney(int money) {
		this.outMoney = money;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
		moneyOut(who, outMoney);
		}
	}
}

public class Sample3 {

	public static void main(String[] args) {
		Bank b1 = new Bank("홍길동", 50000);
		
		b1.setWho("홍길동");
		b1.setOutMoney(8000);
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		
		t1.start();
		t2.start();
		
		while(true) {
			if(Thread.State.RUNNABLE == t1.getState()) {
				System.out.println(t1.getState() + " | " + t2.getState());
			} else if(Thread.State.BLOCKED == t1.getState()) {
				System.out.println(t1.getState() + " | " + t2.getState());
			} else if(Thread.State.TERMINATED == t1.getState()) {
				System.out.println("thread-1 : " + t1.getState());
				break;
			} else if(Thread.State.TERMINATED == t2.getState()) {
				System.out.println("thread-2 : " + t2.getState());
				break;
			}
		}
	}
}
