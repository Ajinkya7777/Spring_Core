package controlFlowStatements;

/*Write a method named getEvenDigitSum with one parameter of type int called number. 

The method should return the sum of the even digits within the number. 

If the number is negative, the method should return -1 to indicate an invalid value.
example 	1234567890 = 2+4+6+8=20
*/

public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {
		int reminder = 0;
		int sum = 0;

		if (number > 0) {

			while (number > 0) {
				reminder = number % 10;
				if (reminder % 2 == 0) {
					System.out.println(" the number is even " + reminder);
					sum = sum + reminder;
				}
				number = number / 10;

			}
			return sum;
		} else {
			return -1;
		}

	}

}
