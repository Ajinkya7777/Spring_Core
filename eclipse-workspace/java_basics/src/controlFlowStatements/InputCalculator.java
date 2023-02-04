package controlFlowStatements;

import java.util.Scanner;

/*Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading 
int numbers from the keyboard.

When the user enters something that is not an int then 
it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

*/

	
	public class InputCalculator {
		public static void inputThenPrintSumAndAverage()
		{
		Scanner input = new Scanner(System.in);
		int number=0;
		
          int sum=0;
          double roundAvg=0;
          int count=0;
          long avg;
          System.out.println(" enter the numbers ");
           while(true)
           {
        	   //System.out.println(" enter the numbers ");
        	   ;
        	   if(input.hasNextInt())
        	   {
        		   number=input.nextInt();
        		   sum= sum+number;
        		   //sum=sum+input.nextInt();
        		//  avg=  sum/count;
        		   count++;	
        	   }
        	  
           
		
           else {
        	   roundAvg=  (sum/count);
        	   break;
        	   //System.out.println(sum);
        	   //System.out.println(avg);
           }
        	  // input.nextLine();
           }
           
          avg=Math.round(roundAvg);
          System.out.println("sum = " +sum+" avg = " +avg);
          input.close();

	}

	}
	
//    int sum=0;
//
//    double avg=0;
//
//    boolean isInt=true;
//
//    int totalCount=0;
//
//    int i=0;
//
//    Scanner scanner = new Scanner(System.in);
//
//    if(scanner.hasNextInt()){
//
//    while(scanner.hasNextInt()){
//
//        totalCount +=scanner.nextInt();
//
//        i++;
//
//    }
//
//    avg=Math.round(Math.round(totalCount)/(double)i);
//
//    System.out.println("SUM = " + totalCount + " AVG = " + Math.round(avg));
//
//}else{
//
//        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
//
//    }


	

