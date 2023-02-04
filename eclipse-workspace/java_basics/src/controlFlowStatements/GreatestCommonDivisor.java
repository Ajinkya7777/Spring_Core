package controlFlowStatements;

/*Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each 
of the integers (i.e. without leaving a remainder).

*/

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int first, int second) {
		
		int reminderOfOne=0;
		int reminderOfSecond=0;
		int greatestCommondivisor=0;
		
		if((first<10) || (second<10))
		{
			return -1;
		}
		else{                                   
			
			  for(int i=1; i<=first && i<=second;i++) 
			  {
				 reminderOfOne=first%i; 
				 reminderOfSecond=second%i;
				 
                  
                  if(reminderOfOne==0 && reminderOfSecond == 0)
                  {
                	  greatestCommondivisor=i;
                  }
			  }
			
			 // System.out.println(" value of divisor" +i);	
		}
		return greatestCommondivisor;
		
	}

}
