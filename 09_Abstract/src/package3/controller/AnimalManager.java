package package3.controller;

import package3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[5];
		
		animal[0] = new Cat("나비","브리티쉬숏헤어","나비네","고등어");
		animal[1] = new Dog("멍돌이","말티즈",3);
		animal[2] = new Cat("도토리","코리안숏헤어","우리집","치즈");
		animal[3] = new Dog("콩떡이","푸들",2);
		animal[4] = new Cat("메밀이","페르시안","미소네","회색");
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}

}
