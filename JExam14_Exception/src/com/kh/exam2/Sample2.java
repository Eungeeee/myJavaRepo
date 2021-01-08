package com.kh.exam2;

/*
 *  사용자 정의 Exception 만들기
 */

class NegativeException extends Exception{
	public NegativeException() {}
	public NegativeException(String msg) {
		super(msg);
	}
}

class NegativeExceptionCheck{
	public void check(int i) throws NegativeException{
		if(i < 0) {
		throw new NegativeException("음수 값을 사용하면 안됩니다.");
		}
	}
}

class SamClass{
	public int sum(int x, int y) throws NegativeException{
		new NegativeExceptionCheck().check(x);
		new NegativeExceptionCheck().check(y);
		return x + y;
	}
}

public class Sample2 {

	public static void main(String[] args) {
		SamClass sa = new SamClass();
		int res = 0;
		try {
			res = sa.sum(-1, 20);
		} catch(NegativeException e) {
			e.printStackTrace();
		}
		System.out.println("결과 : " + res);

	}

}
