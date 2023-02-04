package controlFlowStatements;

public class PrimeNoCount {

	public static void main(String[] args) {
		int primeCount=0;
		
		for (int i = 1; i < 10; i++) {
			
		
		boolean b=isPrime(i);
		if(b==true)
		{
			primeCount++;
			//System.out.println(primeCount);
			 if (primeCount==3) {
				 System.out.println("count : " +primeCount);
				 
				break;
			}
		}
		}

	}
	
	public static boolean isPrime(int n) {
		
		if(n==1)
			{
			//System.out.println("1 is not a prime number");
			return false;
		}
		
		
           for (int i = 2; i < n; i++) {
        	   
        	   if(n%i==0)
        	   {
        		  // System.out.println(" the number is not prime " +n);
        		   return false;
        	   }
        	   
			}
           
           System.out.println(" Number is prime " +n);
         	return true ;
			
		
		}
	}
	


