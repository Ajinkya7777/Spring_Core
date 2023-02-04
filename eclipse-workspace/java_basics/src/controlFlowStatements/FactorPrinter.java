package controlFlowStatements;

/*Write a method named printFactors with one parameter of type int named number. 

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number. 
A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

*/

public class FactorPrinter {

	public static void printFactors(int number) {
		int reminder=0;
		if (number>=1) {
			for(int i=1;i<=number;i++)
			{
			reminder=number%i;
			if(reminder==0) {
			System.out.println(" the number is wholly divisible by these numbers : " +i);
			}
			}
			
		}
		else
		{
	System.out.println(" Invalid Value");
		}
	}

}
