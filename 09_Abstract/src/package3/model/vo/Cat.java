package package3.model.vo;

public class Cat extends Animal{

	private String location;
	private String color;
	
	public Cat() {}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.color = color;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void speak(){
		System.out.print(super.toString() + this.location + "에 서식하며, 색상은 " + this.color + "입니다.\n");
	}
}
