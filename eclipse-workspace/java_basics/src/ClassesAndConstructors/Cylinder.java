package ClassesAndConstructors;

public class Cylinder extends Circle{
	private double height;
	
	
//public Cylinder(double radius, double height) {
//		super(radius);
//		this.height = height;
//	}
	public Cylinder(double radius,double height) {
		
		super(radius);
		
		if (height<0) {
			this.height=0;
		} else {
			this.height=height;
		}

	}
	
	public double getHeight() {
		
		return this.height;
	}
	public double getVolume() {
		
		double area=super.getArea();
		return area*(this.height);
	}
	

}
