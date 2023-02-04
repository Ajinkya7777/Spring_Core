package ClassesAndConstructors;

public class Animal {

	private String name;
	private int brain;
	private int body;
	private int weight;
	private int size;
	private boolean vegan;

	public Animal(String name, int brain, int body, int weight, int size,boolean vegan) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.weight = weight;
		this.size = size;
		this.vegan=vegan;
	}
	
	public void eat() {

		System.out.println(" Animal.eat() is called : Animal is eating");
	}

	public void move() {
		System.out.println(" Animal is moving");

	}

	public void sleep() {
		System.out.println("Animal is sleeping");
	}

	public String getName() {
		return name;
	}

	public int getBrain() {
		System.out.println("Animal.getBrain() is called : ");
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getWeight() {
		return weight;
	}

	public int getSize() {
		return size;
	}
	public boolean getVegan() {
		System.out.println("Animal.isVegan() is called : animal is vegan: " +this.vegan );
		return vegan;
	}

}