import java.util.Scanner;

public class JavaMart {

	public static void main(String[] args) {
		double availableBalance = 100.0;
		double car = 20;
		double nikeShoes = 80;
		double toy =10;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kids: can you buy me car of " + car + " $ ?");
		if (availableBalance >= nikeShoes) {
			String response = scan.nextLine();
			System.out.println(" dad : " + response + " available balance " + availableBalance);
			availableBalance -= car;
			System.out.println(" Now we have " + availableBalance + " remaining in my wallet");

		} else {
			System.out.println(" sorry we can't buy this bcz we have only " + availableBalance + " $");
		}
		System.out.println(" \nkids : can you buy me nike shoes of  " + nikeShoes + " $ ?");
		if (availableBalance>=nikeShoes) {
			String response2 = scan.nextLine();
			System.out.println(" dad : " + response2 + " available balance " + availableBalance);
			availableBalance -= nikeShoes;
			System.out.println(" Now we have " + availableBalance + " remaining in my wallet");
			
		} else {

			System.out.println(" sorry we can't buy this bcz we have only " + availableBalance + " $");
		}
		
		// System.out.println(" dad : " + response2);
		System.out.println("\nkids: can you buy me toy of "+toy+" $ ?");
		
		 if (availableBalance>=toy) {
			
			 String response3 = scan.nextLine();
			 System.out.println(" dad : " + response3 + " available balance " + availableBalance);
		} else {
			System.out.println(" sorry we can't buy this bcz we have only " + availableBalance + " $");

		}
//		System.out.println(" dad: " +response3);
		scan.close();
	}

}
