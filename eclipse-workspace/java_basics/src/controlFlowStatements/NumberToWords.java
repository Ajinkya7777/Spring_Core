package controlFlowStatements;



/*Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:

Extract the last digit of the given number using the remainder operator. 

Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, 
those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, 
e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.

Remove the last digit from the number.

Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. For example, 
if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". 
To overcome this problem, write a second method called reverse.

The method reverse should have one int parameter and return the reversed number (int). 
For example, if the number passed is 234, then the reversed number would be 432. 
The method  reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). 
The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". 
To solve this problem, write a third method called getDigitCount. 

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method

getDigitCount(0); should return 1 since there is only 1 digit

getDigitCount(123); should return 3

getDigitCount(-12); should return -1 since the parameter is negative

getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

reverse(-121); should  return -121

reverse(1212); should return  2121*/
public class NumberToWords {

	public static void numberToWords(int number) {
		int revNo=NumberToWords.reverse(number);
		if(revNo<0)
		{
			System.out.println(revNo);
		}
		int count= NumberToWords.getDigitCount(revNo);
		//System.out.println("count" +count);
		int reminder=0;
		if(count>=1)
			while(revNo>0)
		{
			reminder = revNo%10;
			revNo=revNo/10;
			switch(reminder)
			{
			case 0:
				System.out.print("Zero\t");
				break;
				//return "Zero";
			case 1:
				System.out.print("One\t");
				break;
//				return "One";
			case 2:
				System.out.print("Two\t");
				break;
//				return "Two";
			case 3:
				System.out.print("Three\t");
				break;
			//	return "Three";
			case 4:
				System.out.print("Four\t");
				break;
//				return "Four";
			case 5:
				System.out.print("Five\t");
				break;
//				return "Five";
			case 6:
				System.out.print("Six\t");
				break;
//				return "Six";
			case 7:
				System.out.print("Seven\t");
				break;
//				return "Seven";
			case 8:
				System.out.print("Eight\t");
				break;
//				return "Eight";
			case 9:
				System.out.print("Nine\t");
				break;
//				return "Nine";
		    default:
				System.out.print("Invalid Value");
		    	//return "Invalid Value";
				
			}
			count=count-1;
			
			
			}
		//return "Invalid Value";
		
	}

	public static int reverse(int revNo) {
		int revNumber=0;
		if(revNo>0)
		{	
		while(revNo>0) {
			int reminder=revNo%10;
			 revNumber=(revNumber*10)+reminder;
			 revNo=revNo/10;
		}
	//	System.out.println(revNumber);
		return revNumber;}
		
		else {
			revNo=-1*revNo;
			while(revNo>0) {
				int reminder=revNo%10;
				 revNumber=(revNumber*10)+reminder;
				 revNo=revNo/10;
				
			}
			return -revNumber;
		}
	}

	public static int getDigitCount(int number) {
		//int reminder=0;
		int count=0;
		if(number>0) {
		while(number>=0)
		{
			 number=number/10;
			 count++;
		
		}
		return count;
		}
		return 1;
	
		
		
		
	}

}
