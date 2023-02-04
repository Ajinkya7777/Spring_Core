package variables;
/*Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.*/


public  class MinutesToYearsDaysCalculator {
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes>=0)
		{
			long year= (long)minutes / (365*24*60);
			long remainingMinutes= (long)minutes %(365*24*60);
			//int remainingMinutes= (int)minutes %(365*24*60);
			long remaingDays= (long)(remainingMinutes)/(24*60);
			//int hours= (int)minutes % 60;
			System.out.println(+minutes+ " min = " +year+ " y and " +remaingDays+ " d" );
		}
		else {
			System.out.println("Invalid Value ");;
		}
	}
	

}
