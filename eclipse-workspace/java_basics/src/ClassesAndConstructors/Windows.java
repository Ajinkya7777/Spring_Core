package ClassesAndConstructors;

public class Windows {
	
	private String size ;
	private int height; 
	private int width;
	public Windows(String size, int height, int width) {
		super();
		this.size = size;
		this.height = height;
		this.width = width;
	}
	public String getSize() {
		return size;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	

}
