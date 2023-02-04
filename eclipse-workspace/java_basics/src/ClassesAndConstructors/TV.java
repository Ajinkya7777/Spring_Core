package ClassesAndConstructors;

public class TV {

	private int width;
	private int height;
	private String company;
	private String type;
	public TV(int width, int height, String company, String type) {
		super();
		this.width = width;
		this.height = height;
		this.company = company;
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getCompany() {
		return company;
	}
	public String getType() {
		return type;
	}
	
	
}
