import java.util.Scanner;

public class RollsJava {
	  static int score =0;
	public static void main(String[] args) {
	System.out.println("Let's play Rolling Java. Type anything to start");
	Scanner scan = new Scanner(System.in);
	scan.nextLine();
	System.out.println(" Great! here are the rules");
	System.out.println("1. If you roll a 6, the game will stop");
	System.out.println("2. If you roll a 4, nothing happens");
	System.out.println("3. Otherwise you must Collect at least 3 points to win\n Enter anything to roll:");
    while (true) {
    	scan.nextLine();
		
    	int randomNo= rollDice();
    	System.out.println("you rolled a dice: " +randomNo);
    	if (randomNo==6) {
			System.out.println(" Yuu entered 6 . End of game\n");
			break;
		}
    	else if (randomNo==4) {
			System.out.println("zero points keep rolling\n");
			continue;
		}
    	else {
    		score++;
			System.out.println(" your score: " +score+" keep rolling\n");
			continue;
		}
	}
    if (score>=3) {
		System.out.println(" congrats! you won \n, final Score:"+score);
	}
    else {
		System.out.println(" tough luck! better luck next time");
	}
    scan.close();
	}

	
	private static int rollDice() {
		int randomNo=(int)(Math.random()*(6-1+1)+1);
		return randomNo;
	}

}
