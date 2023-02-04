package controlFlowStatements;

/*First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 

The method needs to find the first and the last digit of the parameter number passed to the method, 
using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

*/
public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		int lastDigit=0;
		int firstDigit=0;
		int sum=0;
	
		int count=0;
		System.out.println(number);
		
		if(number>0) {
		while(number>0)
		{   
			if(count==0)
			{
			lastDigit=number%10;
			count++;
			}
			//System.out.println(lastDigit);
			if(number<10)
			{
				firstDigit=number;
				break;
			}
			else {
				number=number/10;
			}
			sum=firstDigit+lastDigit;
		}
		return sum;
	 
		}	
			return -1;
		
		
	}
 
	
}
