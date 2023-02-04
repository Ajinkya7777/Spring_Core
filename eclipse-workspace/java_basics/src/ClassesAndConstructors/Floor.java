package ClassesAndConstructors;


public class Floor {

	private double length;
	private double width;
	public Floor(double length, double width) {
		
		if(width<0 || length<0)
		{
			this.length=0;
			this.width=0;
		}
		else if (width<0) {
			this.length=length;
			this.width=0;
		}
		else if (length<0) {
			this.length=0;
			this.width=width;
		}
		else {
			
			this.length = length;
			this.width = width;
		}
	}
	
	public double getArea()
	{
		return this.length*this.width;
	}
	
}