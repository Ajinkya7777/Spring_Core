package variables;
/*  Equality Printer
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".*/

public class IntEqualityPrinter {
	
	public static void  printEqual(int no1,int no2,int no3) {
		if (no1<0 || no2<0 || no3<0) {
			System.out.println("Invalid Value");
		}
	else if(no1==no2 && no2==no3 && no1==no3)
		{
			System.out.println("All numbers are equal");
		}
		else if (no1!=no2 && no2!=no3 && no1!=no3) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
	}

}
