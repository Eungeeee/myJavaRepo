package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	
	private int lotto[] = new int[6];
	
	{
		// 중복하지 않은 1~45까지의 난수로 lotto배열 초기화
		int num;	boolean dup = false;
		Random rand = new Random();
		for(int i = 0; i < this.lotto.length;) {
			num = rand.nextInt(45) + 1;
			for(int k = 0; k < i; k++) {
				if(this.lotto[k] == num) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				this.lotto[i] = num;
				i++;
			}
			dup = false;
		}
	}
	
	public void information() {
		for(int i = 0; i < this.lotto.length - 1; i++) {
			System.out.print(this.lotto[i]+", ");
		}
		System.out.println(this.lotto[this.lotto.length-1]);
	}
	
}
