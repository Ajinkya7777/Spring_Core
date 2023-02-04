import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 System.out.print(" 1. Pick a number to count by: ");
		  int steps= scan.nextInt();
		  System.out.print(" 2. Pick a number to start counting from: ");
		  int startNo= scan.nextInt();
		  System.out.print(" 3. Pick a number to count to: ");
		  int stopNo= scan.nextInt();
		  
		  for (int i = startNo; i <=stopNo; i+=steps) {
			  
			  if (i%2==0) {
				
				System.out.println(i + " - even ");
			}
			  else {
				
				  System.out.println(i+" - odd ");
			}
			scan.close();
		}

	}

}
