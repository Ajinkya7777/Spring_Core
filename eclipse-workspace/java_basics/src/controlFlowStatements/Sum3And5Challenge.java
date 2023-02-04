package controlFlowStatements;

public class Sum3And5Challenge {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				

				
				System.out.println(" the number which is divisible by 3 & 5 = " + i);
				sum = sum + i;
				count = count+1;
				if(count==5)
				{
					break;
				}
				

				}

			}
			
		System.out.println("count = "+count);
		
		System.out.println(" the sum of 5 numbers which are divisible by 3 & 5 both = " + sum);
	}

}
