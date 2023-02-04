package variables;

public class SpeedConverter {

	public static void main(String[] args) {
		
		printConversion(10.5);
		//System.out.println(toMilesPerHour(10.5));
		
		
	}
	
	public static long toMilesPerHour(double kiloMeterPerHour) {
		
		if(kiloMeterPerHour<0)
			
		{
			return -1;
		}
		else
		{
			return Math.round(kiloMeterPerHour / 1.609);
			
		}
		
	
	}
	
	
	public static void printConversion(double kiloMeterPerHour) {
		if(kiloMeterPerHour < 0)
		{
			System.out.println("invalid value");
		}
		else
		{
			//System.out.println(" conversion of speed is " +toMilesPerHour(1));
			long milesPerHour = toMilesPerHour(kiloMeterPerHour);
			System.out.println(kiloMeterPerHour + " km/ph = " + milesPerHour + " mi/hr");
		}
		
	}

}
