
public class AreaCalculator {

	public static void main(String[] args) {
		
		System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

		double square= areaOfSquare(2);
		  printArea(1,square);
		  double rectangle=areaOfRectangle(1, 2);
		  printArea(2,rectangle);
		  double triangle= areaOfTriangle(1, 2);
		  printArea(3,triangle);
		  double circle = areaOfCircle(2);
		  printArea(4,circle);
		
	}

	public static double areaOfSquare(double side) {
		if (side<=0) {
			System.out.println("impossible");
			return 0;
		}
		return side*side;
	}
	public static double areaOfTriangle(double base, double height) {
		
		if (base<=0 || height<=0) {
			System.out.println("impossible");
			return 0;
		}
		return base*height/2;
	}
	public static double areaOfRectangle(double length, double width) {
		if (length<=0 || width<=0) {
			System.out.println("impossible");
			return 0;
		}
		return length*width;
	}
	public static double areaOfCircle(double radius) {
		if (radius<=0) {
			System.out.println("impossible");
			return 0;
		}
		return 3.14*(radius*radius);
	}
	
	public static void printArea(int shape,double area)	{
		
		switch (shape) {
		case 1:
			System.out.println("Square area:" +area);
			break;
		case 2:
		System.out.println("Rectangle area:" +area);
			break;
		case 3:
		System.out.println("Triangle area:"+ area );
			break;
		case 4:
		System.out.println("Circle area: "+area );
			break;

		default:
			System.out.println("invalid input");
			break;
		} 
		
		
	     
		
	}
}
