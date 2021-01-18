package com.kh.exam2;

class ThreadSample1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println(i);
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		ThreadSample1 ts1 = new ThreadSample1();
		Thread t1 = new Thread(ts1);
		t1.start();
		
		while(true) {
			if(Thread.State.NEW == t1.getState()) {
				System.out.println("스레드 생성이 되었습니다.");
			} else if(Thread.State.RUNNABLE == t1.getState()) {
				System.out.println("스레드 동작 중 또는 동작 준비중");
			} else if(Thread.State.TIMED_WAITING == t1.getState()) {
				System.out.println("일시 정지");
			} else if(Thread.State.TERMINATED == t1.getState()) {
				System.out.println("동작 완료!");
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
