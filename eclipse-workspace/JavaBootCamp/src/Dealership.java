import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to java Dealership");
		System.out.println(" \n. select option 'a' to buy a car\n");
		System.out.println(" \n. select option 'b' to sell a car\n");
		String option = scan.nextLine();
		switch (option) {
		case "a":
			System.out.println(" Great! May I know,what is your budget?\n");
			// System.out.println("\tenter your budget here: "+scan.nextInt());
			int budget = scan.nextInt();
			if (budget > 10000) {
				System.out.println(" WoW! you're elligible to buy a car.");
				System.out.println("\n Do you have insurance: \t'yes' or 'no' ");
				String insurance = scan.next();
				System.out.println("\n Do you have driving license : \t'yes' or 'no'");
				String license = scan.next();
				System.out.println(" \n enter your credit score ");
				int credit = scan.nextInt();
				if ((insurance.equals("yes"))&& (license.equals("yes"))&& (credit > 500)) {
					System.out.println(" \tCongrats! for new car");
				} else {
					System.out.println(" sorry you're not able to buy a car");
				}

			} else {
				System.out.println(" we are sorry , we don't sell car below 10000");
			}

			break;
		case "b":
			System.out.println("\nwhat is your car valued at?");
			int value=scan.nextInt();
			System.out.println("\nwhat is your selling price?");
			int sellingPrice=scan.nextInt();
			if ((value>sellingPrice)&&(sellingPrice<30000)) {
				System.out.println(" we will buy your car");
			} else {
				System.out.println("sorry we are not interested");
			}
			break;

		default:
			System.out.println(" choose valid option");
			break;
		}

		scan.close();
	}

}
