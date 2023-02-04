import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n ===ROYAL BANK OF JAVA====");
		System.out.println(" \nare you here to get a mortgag:(yes or no)");
		String request = scan.nextLine();
		if (request.equals("yes")) {
			System.out.println("Great! In one line\n"+" \nHow much money do you have in your savings?"+"\nAnd how much owe in credit card debt?");
			int savings = scan.nextInt();
			int creditDebt= scan.nextInt();
			System.out.println("How many years have ypu worked for?");
			int noOfYears= scan.nextInt();
			scan.nextLine();
			System.out.println("what is your name?");
			String name= scan.nextLine();
			
			if ((savings>=10000)&&(creditDebt<5000)&&(noOfYears>2)) {
				System.out.println("Congrats! " + name + " you have been approved!");
				
			} else {

				System.out.println("Sorry, you're not elligible for mortgage");
			}
			
		}
		
		else {
			System.out.println(" \nokay have a nice day");
		}
		
		
		scan.close();
	}

}
