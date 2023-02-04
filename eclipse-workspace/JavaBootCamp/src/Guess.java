import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		System.out.print(" I chose a number between 1 and 5. Try to guess it: ");

		int i = 1;
		Scanner scan = new Scanner(System.in);
		while ((i == 1)) {
			int guess = scan.nextInt();
			if (guess != 1) {
				System.out.print("guess again: ");
			}
			else {
				break;
			}

		}
		System.out.println(" congrats!");
		scan.close();
	}

}
