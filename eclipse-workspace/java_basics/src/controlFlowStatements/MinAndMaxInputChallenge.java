package controlFlowStatements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		int max=0;
		int min=0;
		boolean first=true;
		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println(" Enter Number");
			if(input.hasNextInt())
			{
				int number=input.nextInt();
				if(first)
				{
					first=false;
					min=number;
					max=number;
				}
				if(number>max)
				{
					max=number;
				}
				if(number<min) 
				{
					min=number;
				}
				input.nextLine();
				
			}
			else
			{
				break;
			}
			
		}
		System.out.println(" min = " + min + " max = " +max);
	     
		input.close();

	}

}
