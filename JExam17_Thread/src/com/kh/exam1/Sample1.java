package com.kh.exam1;

class ThreadSample1 extends Thread{
	private String name;
	private int max;
	
	public ThreadSample1(String name, int max) {
		this.name = name;
		this.max = max;
	}
	
	public void total(int max) {
		int tot = 0;
			for(int i = 0; i <= max; i++) {
				tot += i;
			}
			System.out.println(name + " : 1 ~ " + max + " 까지의 총 합은 " + tot + " 입니다.");
			}
	
	@Override
	public void run() {
		this.total(max);
	}
	
}

class ThreadSample2 implements Runnable{
	private String name;
	private int max;
	
	public ThreadSample2(String name, int max) {
		this.name = name;
		this.max = max;
	}
	
	public void total(int max) {
		int tot = 0;
			for(int i = 0; i <= max; i++) {
				tot += i;
			}
			System.out.println(name + " : 1 ~ " + max + " 까지의 총 합은 " + tot + " 입니다.");
			}
	
	@Override
	public void run() {
		this.total(max);
	}
	
}

public class Sample1 {

	public static void main(String[] args) {
		// 싱글스레드 : 하나씩 차례대로 결과를 산출
//		ThreadSample1 ts1 = new ThreadSample1("Non-Thread1");
//		ts1.exec();
//		
//		ThreadSample1 ts2 = new ThreadSample1("Non-Thread2");
//		ts2.exec();
		
		// 멀티스레드 : 동시에 결과를 산출(빨리 끝나는 것 부터 산출)
//		ThreadSample1 ts1 = new ThreadSample1("Thread1", 100);
//		ts1.start();
//		
//		ThreadSample1 ts2 = new ThreadSample1("Thread2", 200);
//		ts2.start();
//		
//		ThreadSample1 ts3 = new ThreadSample1("Thread3", 300);
//		ts3.start();
		
		// Runnable 인터페이스를 사용한 경우
		ThreadSample2 ts1 = new ThreadSample2("Thread1", 100);
		Thread t1 = new Thread(ts1);
		t1.setPriority(10);
		t1.start();
		
		ThreadSample2 ts2 = new ThreadSample2("Thread2", 200);
		Thread t2 = new Thread(ts2);
		t2.start();
		
		ThreadSample2 ts3 = new ThreadSample2("Thread3", 300);
		Thread t3 = new Thread(ts3);
		t3.setPriority(1);
		t3.start();
		

	}

}
