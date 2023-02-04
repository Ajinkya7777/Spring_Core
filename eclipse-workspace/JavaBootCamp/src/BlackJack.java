import java.util.Scanner;

public class BlackJack {

	static int userPoint = 0;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" Welcome to Java Casino!");
		System.out.println(" Do you have a knack for Black Jack?");
		System.out.println(" We shall see..\n");
		System.out.println(" ..Ready? Press anything to begin!\n");
		scan.next();

		System.out.println(" Get two random cards.");
		int firstCard = drawRandomCard();

		int secondCard = drawRandomCard();

		System.out.println(" you get a \n" + cardString(firstCard) + " \n and a \n" + cardString(secondCard));

		int total = (Math.min(firstCard, 10)) + (Math.min(secondCard, 10));
		System.out.println(" \nyour total is : \n" + total);

		int randomCard1 = drawRandomCard();
		int randomCard2 = drawRandomCard();
		System.out.println(
				"\nThe dealer shows\n" + cardString(randomCard1) + " \nand has a card facing down\n" + faceDown());
		int dealerTotal = (Math.min(randomCard1, 10)) + (Math.min(randomCard2, 10));
		System.out.println(" \ndealer total is hidden\n");

		// System.out.println(" user wants to " + hitOrStay);

		while (true) {
			String hitOrStay = hitOrStay();
			if (hitOrStay.equalsIgnoreCase("stay")) {
				break;
			}
			int newCard = drawRandomCard();
			System.out.println("\n your new card is \n" + cardString(newCard));
			total += Math.min(newCard, 10);
			System.out.println(" your total is : " + total);
		}
		if (total > 21) {
			System.out.println("\nbust! you loses.\n");
			System.exit(0);
		}
		System.out.println(" \nnow dealer's turn : \n");
		System.out.println(
				" The dealer's card are \n" + cardString(randomCard1) + "\n and a \n " + cardString(randomCard2));
		System.out.println(" dealer's total is : " +dealerTotal);
		
		
		while (dealerTotal<=17) {
			 int newDealCard= drawRandomCard();
			 System.out.println(" \n dealers gets \n" +cardString(newDealCard));
			 dealerTotal +=newDealCard;
		}
		if (dealerTotal>21) {
			System.out.println( " Bust! dealer loses. \n");
			System.exit(0);
		}
		if (total>dealerTotal) {
			System.out.println(" \nplayer wins!");
		}
		else {
			System.out.println(" \ndealer wins!");
		}
		scan.close();
	}

	public static String cardString(int randomCard) {

		switch (randomCard) {
		case 1:
			return "   _____\n" + "  |A _  |\n" + "  | ( ) |\n" + "  |(_'_)|\n" + "  |  |  |\n" + "  |____V|\n";
		case 2:
			return "   _____\n" + "  |2    |\n" + "  |  o  |\n" + "  |     |\n" + "  |  o  |\n" + "  |____Z|\n";
		case 3:
			return "   _____\n" + "  |3    |\n" + "  | o o |\n" + "  |     |\n" + "  |  o  |\n" + "  |____E|\n";
		case 4:
			return "   _____\n" + "  |4    |\n" + "  | o o |\n" + "  |     |\n" + "  | o o |\n" + "  |____h|\n";
		case 5:
			return "   _____\n" + "  |5    |\n" + "  | o o |\n" + "  |  o  |\n" + "  | o o |\n" + "  |____S|\n";
		case 6:
			return "   _____\n" + "  |6    |\n" + "  | o o |\n" + "  | o o |\n" + "  | o o |\n" + "  |____6|\n";
		case 7:
			return "   _____\n" + "  |7    |\n" + "  | o o |\n" + "  |o o o|\n" + "  | o o |\n" + "  |____7|\n";
		case 8:
			return "   _____\n" + "  |8    |\n" + "  |o o o|\n" + "  | o o |\n" + "  |o o o|\n" + "  |____8|\n";
		case 9:
			return "   _____\n" + "  |9    |\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |____9|\n";
		case 10:
			return "   _____\n" + "  |10  o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |___10|\n";
		case 11:
			return "   _____\n" + "  |J  ww|\n" + "  | o {)|\n" + "  |o o% |\n" + "  | | % |\n" + "  |__%%[|\n";
		case 12:
			return "   _____\n" + "  |Q  ww|\n" + "  | o {(|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%O|\n";
		case 13:
			return "   _____\n" + "  |K  WW|\n" + "  | o {)|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%>|\n";

		default:
			return "";
		}
	}

	public static String faceDown() {
		return "_____\n" + "  |     |\n" + "  |  J  |\n" + "  | JJJ |\n" + "  |  J  |\n" + "  |_____|\n";
	}

	private static int drawRandomCard() {
		int randomNo = (int) (Math.random() * (13 - 1 + 1) + 1);
		return randomNo;

	}

	public static String hitOrStay() {

		System.out.println(" Do you like to hit or stay?\n");
		// scan.nextLine();
		String hitOrStay = scan.nextLine();
		while (true) {
			if ((hitOrStay.equalsIgnoreCase("hit")) || (hitOrStay.equalsIgnoreCase("stay"))) {
				break;
			}
			System.out.println(" please enter hit or stay");
			hitOrStay = scan.nextLine();
		}
		return hitOrStay;

	}
}
