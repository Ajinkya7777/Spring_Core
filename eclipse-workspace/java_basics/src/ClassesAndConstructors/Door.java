package ClassesAndConstructors;

public class Door {
	
	private String type;
	private String color ;
	public Door(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	
	public void openDoor() {
		
		System.out.println(" the door is open");
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	

}
