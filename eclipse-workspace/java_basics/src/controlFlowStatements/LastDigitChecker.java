package controlFlowStatements;
/*Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise,
 it should return false.
*/

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int no1, int no2, int no3) {
		int lastOfNo1 =0;
		int lastOfNo2 =0;
		int lastOfNo3 =0;

		
		if ((no1>=10 && no1<=1000) && (no2>=10 && no2<=1000) && (no3>=10 && no3<=1000)) {
			while(no1>0)
			{
				lastOfNo1=no1%10;
				System.out.println(lastOfNo1);
				break;
				
			}
			while(no2>0)
			{
				lastOfNo2=no2%10;
				System.out.println(lastOfNo2);
				break;
				
			}
			while(no3>0)
			{
				lastOfNo3=no3%10;
				System.out.println(lastOfNo3);
				break;
				
			}

         while(lastOfNo1==lastOfNo2)			
         {
        	 return true;
        	 
         }
         while(lastOfNo2==lastOfNo3)			
         {
        	 return true;
        	 
         }
         while(lastOfNo1==lastOfNo3)			
         {
        	 return true;
         }
         return false;
		}
		
		  return false;
	}
	public static boolean isValid(int no) {
		if((no>=10) &&(no<=1000))
		{
			return true;
		}
		return false;
		
	}

}
                 