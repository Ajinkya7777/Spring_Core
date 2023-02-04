package ClassesAndConstructors;

public class Dog extends Animal {
	private int eyes;
	private int teeth;
	private int tail;
	private int legs;
	private String color;
	//private boolean vegan;

	public Dog(String name, int weight, int size,int eyes,int teeth,int tail,int legs,boolean vegan,String color) {
		super(name, 1, 1, weight, size,vegan);
		
		this.color=color;
		this.legs=legs;
		this.eyes=eyes;
		this.tail=tail;
		this.teeth=teeth;
		
		//this.vegan=vegan;
		
	}
	

//	public int setEyes(int eyes) {
//		this.eyes = eyes;
//		return this.eyes;                        we can initialize a instance of a class either 
//	}                                              by using SETTERS or using CONSTRUCTORS
//                                                   in case of constructors we avoid duplicate coding.
//	public int setTeeth(int teeth) {                and in case of setters we do duplicate code.
//		this.teeth = teeth;
//		return this.teeth;
//	}
//
//	public int setTail(int tail) {
//		this.tail = tail;
//		return this.tail;
//	}
//
//	public int setlegs(int legs) {
//		this.legs = legs;
//		return this.legs;
//	}

	public int getEyes() {
		return eyes;
	}

	public int getTeeth() {
		return teeth;
	}

	public int getTail() {
		return tail;
	}

	public int getLegs() {
		return legs;
	}
	
	
@Override
public boolean getVegan() {
	
	System.out.println(" Dog.vegan() is called: is "+getName()+ " vegan :" +getVegan() ); 
	return super.getVegan();
}

public void getColor() {
	System.out.println("Dog.getColor() is called: " +color);
}
	
	
}
