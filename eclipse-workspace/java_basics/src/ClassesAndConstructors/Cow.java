package ClassesAndConstructors;

public class Cow extends Dog {
	
	private String color;
public Cow(String name, int weight, int size, int eyes, int teeth, int tail, int legs, boolean vegan,
			String color) {
		super(name, weight, size, eyes, teeth, tail, legs, vegan, color);
		this.color=color;
		
	}

	
	@Override
	public boolean getVegan() {
		System.out.println(" Cow.getVegan() is called: " );
		//return super.getVegan();
		return true;
	}
	@Override
		public void getColor() {
		
			System.out.println("Cow.getColor() is called: " +color);
			super.getColor();
		}
	
	

}
