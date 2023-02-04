package ClassesAndConstructors;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		if (width<0 && length>0) {
			this.width=0;
			this.length=length;
		}
		else if ( length < 0 && width>0) {
			this.length=0;
			this.width=width;
		}
		else if (width<0 && length<00) {
			this.length=0;
			this.width=0;
		}
		else {
			this.length=length;
			this.width=width;
		}
		 
	}

	public double getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	public double getLength() {
		// TODO Auto-generated method stub
		return this.length;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;


	}
	}
