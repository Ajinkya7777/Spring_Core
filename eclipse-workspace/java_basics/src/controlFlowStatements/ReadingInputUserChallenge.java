package controlFlowStatements;

import java.util.Scanner;

public class ReadingInputUserChallenge {

	public static void main(String[] args) {
		//int no=0;
		//int number=0;
		int sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println(" enter the 10 integer vlaues");
		 for(int i =1;i<=10;i++)
		 {
			 System.out.println("Enter the #"+i+" number: ");
			 if(input.hasNextInt())
			 {
				// System.out.println(" what happened");
				 int number = input.nextInt();
				  sum= sum +number;
				  
			 }			 
			 else {
				System.out.println( "Invalid Number");
				i--;
				//break;
			}
			 input.nextLine();
		 }
		 System.out.println("sum " +sum);
			 
		 input.close();
	}

}
