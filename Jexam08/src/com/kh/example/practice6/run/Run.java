package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		p.setpName("키보드");
		p.setBrand("레오폴드");
		p.setPrice(250000);

		p.information();
	}

}
