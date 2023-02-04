package variables;

public class FeetInchesConversion {

	public static void main(String[] args) {
		
		System.out.println(FeetInchesConversion.calcFeetAndInchesIntoCentimeters(157));
	}

	public static double calcFeetAndInchesIntoCentimeters(double foot, double inches)
	{
	
	if(foot>=0 && inches>=0 && inches<=12)
	{
		
//		1 foot = 12 inches
//	    1 inch = 2.54c
		double inchInCm= inches*2.54;
		double footInCm= (foot*12)*(2.54);
		return  (inchInCm + footInCm);
		
		
	}

	else {
		
		System.out.println("invalid parameters");
		return -1;
	}
}
	
	public static double calcFeetAndInchesIntoCentimeters(double inches) {
		
		if(inches>=0)
		{
			double footInches= (int) ( inches/12);
			double inchesRemainder=(int)(inches%12);
			double cm =calcFeetAndInchesIntoCentimeters(footInches, inchesRemainder);
			return cm;
		}
		else {
			return -1;
		}
		
	}
}