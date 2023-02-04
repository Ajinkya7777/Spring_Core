package ClassesAndConstructors;

public class FlowerPots {
 
	 private int flowers;
	 private String color;
	public FlowerPots(int flowers, String color) {
		super();
		this.flowers = flowers;
		this.color = color;
	}
	
	private void flowers(String flowers)
	{
		System.out.println(" flowers are " +flowers + " are having color " + this.color);
	}
	public int getFlowers(String flower) {
		this.flowers(flower);
		return flowers;
	}
	public String getColor() {
		return color;
	}
	 
}
