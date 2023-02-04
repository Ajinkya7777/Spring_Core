import java.util.Arrays;

public class Car {

	private String name;
	private double price;
	private String color;
	private String make;
	private String[] parts;

	public Car(String name, double price, String color, String make,String[] parts) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.make = make;
		this.parts=parts;

	}

	public Car(Car type) {
		this.name = type.name;
		this.color = type.color;
		this.price = type.price;
		this.make = type.make;
		this.parts=type.parts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void drive(String name) {
		System.out.println(" I'm driving " + name);
	}
	
	public  String[] getParts() {
		return this.parts=Arrays.copyOf(this.parts, this.parts.length);
	}
	public void setParts(String[] parts) {
		this.parts=Arrays.copyOf(parts, parts.length);
	}
	
//	@Override
//	public String toString(String name,String color,String make,double price) {
//		
//		return "name : " +this.name+" color : "+this.color+"Make :"+this.make+" price : "+this.price;
//	}
}
