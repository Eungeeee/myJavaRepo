package com.kh.exam2;
/*
 * 동물 슈퍼 클래스 생성
 * 개, 고양이, 호랑이, 소, 쥐, 말 등등 서브클래스 생성
 * 
 * 멤버 필드
 * 	나이, 신장, 몸무게
 * 멤버 메서드
 * 	달리기, 걷기, 먹기, 울음소리
 */
class Animal{
	private int age;
	private double tall;
	private double weight;
	
	public Animal(int age, double tall, double weight) {
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	
	public void running(){
		System.out.println("동물이 달립니다.");
	}
	
	public void walking() {
		System.out.println("동물이 걷습니다.");
	}
	
	public void eating() {
		System.out.println("동물이 음식을 먹습니다.");
	}
	
	public void crying() {
		System.out.println("동물이 울음소리를 내고 있습니다.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

class Dog extends Animal {
	private String name = "개";
	public Dog(int age, double tall, double weight) {
		super(age, tall, weight);
	}
	@Override
	public void running() {
		super.running();
		System.out.println(this.name + "가 신나게 달립니다.");
	}
	@Override
	public void walking() {
		super.walking();
		System.out.println(this.name + "가 주인과 함께 걷고 있습니다.");
	}
	@Override
	public void eating() {
		super.eating();
		System.out.println(this.name + "가 밥을 챱챱 먹고 있습니다.");
	}
	@Override
	public void crying() {
		super.crying();
		System.out.println(this.name + "가 멍멍 울고 있습니다.");
	}
	public void sitDown() {
		System.out.println(this.name + "가 앉았습니다.");
	}
	@Override
	public String toString() {
		// Object 클래스의 메서드 재정의 해서 출력을 할 때 원하는 문자열로 출력할 수 있게 만들 수 있다.
		return this.name + " 나이 : " + this.getAge() + " | 신장 : " + this.getTall() +
				" | 몸무게 : " + this.getWeight();
	}
}
class Cat extends Animal {
	private String name = "고양이";
	public Cat(int age, double tall, double weight) {
		super(age, tall, weight);
}
	@Override
	public void running() {
		super.running();
		System.out.println(this.name + "가 재빠르게 달립니다.");
	}
	@Override
	public void walking() {
		super.walking();
		System.out.println(this.name + "가 사뿐사뿐 걷고 있습니다.");
	}
	@Override
	public void eating() {
		super.eating();
		System.out.println(this.name + "가 밥을 냠냠 먹고 있습니다.");
	}
	@Override
	public void crying() {
		super.crying();
		System.out.println(this.name + "가 야옹야옹 울고 있습니다.");
	}
	public void box() {
		System.out.println(this.name + "가 박스에 들어갔습니다.");
	}
	@Override
	public String toString() {
		// Object 클래스의 메서드 재정의 해서 출력을 할 때 원하는 문자열로 출력할 수 있게 만들 수 있다.
		return this.name + " 나이 : " + this.getAge() + " | 신장 : " + this.getTall() +
				" | 몸무게 : " + this.getWeight();
	}
}
class Tiger extends Animal {
	private String name = "호랑이";
	public Tiger(int age, double tall, double weight) {
		super(age, tall, weight);
}
	@Override
	public void running() {
		super.running();
		System.out.println(this.name + "가 재빠르게 달립니다.");
	}
	@Override
	public void walking() {
		super.walking();
		System.out.println(this.name + "가 사뿐사뿐 걷고 있습니다.");
	}
	@Override
	public void eating() {
		super.eating();
		System.out.println(this.name + "가 밥을 냠냠 먹고 있습니다.");
	}
	@Override
	public void crying() {
		super.crying();
		System.out.println(this.name + "가 야옹야옹 울고 있습니다.");
	}
}
class Mouse extends Animal {
	private String name = "쥐";
	public Mouse(int age, double tall, double weight) {
		super(age, tall, weight);
}
	@Override
	public void running() {
		super.running();
		System.out.println(this.name + "가 재빠르게 달립니다.");
	}
	@Override
	public void walking() {
		super.walking();
		System.out.println(this.name + "가 사뿐사뿐 걷고 있습니다.");
	}
	@Override
	public void eating() {
		super.eating();
		System.out.println(this.name + "가 밥을 냠냠 먹고 있습니다.");
	}
	@Override
	public void crying() {
		super.crying();
		System.out.println(this.name + "가 야옹야옹 울고 있습니다.");
	}
}
class Horse extends Animal {
	private String name = "말";
	public Horse(int age, double tall, double weight) {
		super(age, tall, weight);
}
	@Override
	public void running() {
		super.running();
		System.out.println(this.name + "가 재빠르게 달립니다.");
	}
	@Override
	public void walking() {
		super.walking();
		System.out.println(this.name + "가 사뿐사뿐 걷고 있습니다.");
	}
	@Override
	public void eating() {
		super.eating();
		System.out.println(this.name + "가 밥을 냠냠 먹고 있습니다.");
	}
	@Override
	public void crying() {
		super.crying();
		System.out.println(this.name + "가 야옹야옹 울고 있습니다.");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		
		Animal[] aniArray= new Animal[3];
		aniArray[0] = new Dog(1,100.0,2.5);
		aniArray[1] = new Cat(2,65.5,1.5);
		aniArray[2] = new Dog(1,100.0,2.5);
		
		Dog dog = new Dog(1,100.0,2.5);
		Cat cat = new Cat(2,65.5,1.5);
		
		dog.running();	dog.walking(); 	dog.sitDown();
		cat.running();	cat.walking(); 	cat.box();
		
		System.out.println(dog);
		System.out.println(cat);

	}

}
