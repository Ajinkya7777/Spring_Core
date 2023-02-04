package controlFlowStatements;

import java.util.Scanner;

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the number :");
		int no= s.nextInt();
		if(no>=10)
		{
		System.out.println("sum of digit :" +sumDigit(no));
		}
		else
		{
			
			System.out.println("number is less than 10");
		}
		s.close();

	}
	
	public static int sumDigit(int no) {
		int reminder=0;
		//int eliminatedDigit=0;
		int sum=0;
		int temp=no;
		while ((temp>0 )) {
			reminder=temp%10;
			sum= sum+reminder;
			temp= temp/10;
			
		}
		
		return sum;
	
	}

}
