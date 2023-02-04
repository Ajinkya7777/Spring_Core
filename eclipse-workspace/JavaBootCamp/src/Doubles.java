
public class Doubles {

	public static void main(String[] args) {
		
		
		boolean same=true;
		while(same) {
			int diceNo1=rollDice();
			int diceNo2=rollDice();
			
			System.out.println(" Dice 1: " +diceNo1);
			System.out.println(" Dice 2: " +diceNo2+" \n ");
			if (diceNo1==diceNo2) {
				same = false;
			} 
		}
		System.out.println(" you rolled doubles!");
	}
	
	public static int rollDice() {
		int max=6;
		int min=1;
		int dice = (int) (Math.random()*(max-min+1)+min); 
		return dice;
	}

}
