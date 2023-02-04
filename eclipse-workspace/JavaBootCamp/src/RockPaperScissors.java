
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Let's play Rock Paper Scissors.");
		System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
		System.out.println("Are you ready? Write 'yes' if you are.");

		String yesOrNo = scan.nextLine();
		if (yesOrNo.equalsIgnoreCase("yes")) {
			System.out.println("Great");
			System.out.println("rock - paper - scissors, shoot!");
			String userChoice = scan.nextLine();
			System.out.println(" You chose : " + userChoice);

			String computerChoice = computerChoice();
			System.out.println(" Computer choice : " + computerChoice);
			String result = result(userChoice, computerChoice);
			System.out.println(" Final Result : " + result);
		} else {
			System.out.println("Darn, some other time...");
		}
		scan.close();

	}

	private static String result(String userChoice, String computerChoice) {

		if ((userChoice.equalsIgnoreCase("rock")) && (computerChoice.equalsIgnoreCase("scissors"))) {
			return "You win!";
		} else if ((userChoice.equalsIgnoreCase("paper")) && (computerChoice.equalsIgnoreCase("rock"))) {
			return "You win!";
		} else if ((userChoice.equalsIgnoreCase("scissors")) && (computerChoice.equalsIgnoreCase("paper"))) {
			return "You win!";
		} else if ((userChoice.equalsIgnoreCase("scissors")) && (computerChoice.equalsIgnoreCase("rock"))) {
			return "You Lose!";
		} else if ((userChoice.equalsIgnoreCase("rock")) && (computerChoice.equalsIgnoreCase("paper"))) {
			return "You Lose!";
		} else if ((userChoice.equalsIgnoreCase("paper")) && (computerChoice.equalsIgnoreCase("scissors"))) {
			return "You Lose!";
		} else {
			return "Invlaid Choice";
			//return "You Lose!";
		}
	
		
	}

	private static String computerChoice() {
		int max = 2;
		int min = 0;
		int choice = (int) (Math.random() * (max + 1 - min) + min);
		switch (choice) {
		case 0:
			return "rock";
		case 1:
			return "paper";
		case 2:
			return "scissors";
		default:
			return "invalid input";
		}

	}

}
