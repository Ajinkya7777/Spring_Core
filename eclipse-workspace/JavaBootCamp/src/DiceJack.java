import java.util.Scanner;

public class DiceJack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rolldice1=rollDice();
		int rolldice2=rollDice();
		int rolldice3=rollDice();
		System.out.println("dice1:" +rolldice1);
		System.out.println("dice2:" +rolldice2);
		System.out.println("dice3:" +rolldice3);
		System.out.println("Enter the 3 integers values\n");
		int no1=scan.nextInt();
		int no2=scan.nextInt();
		int no3=scan.nextInt();
		System.out.println(" you chosen numbers:\nNo1:"+no1+"\nNo2:"+no2+"\nNo3:"+no3);
		
		if (no1>6 || no2>6 || no3>6) {
			System.out.println("Number is greater than 6 , We're shuttind down.");
			System.exit(0);
		}
		 if (no1<1 || no2<1 || no3<1) {
			System.out.println("Number is less than 1, We're shuttind down.");
			System.exit(0);
		}
		 
		 int sumOfNo=no1+no2+no3;
		 int sumOfDice=rolldice1+rolldice2+rolldice3;
		 int diff= (sumOfDice-sumOfNo);
		 System.out.println(" sum of Numbers: " +sumOfNo);
		 System.out.println(" sum of Dices: " +sumOfDice);
		
		 String result = result(sumOfNo,sumOfDice,diff);
		 System.out.println(" final result : " +result);
		scan.close();

	}

	private static String result(int sumOfNo, int sumOfDice,int diff) {
		//int diff= (sumOfDice-sumOfNo);
		if (diff<0) {
			diff=(-1*diff);
		}
		if (sumOfNo>sumOfDice && diff<3) {
			return "you won";
		}
		else {
			return "you lost";
		}
	}

	private static int rollDice() {
//		int min=0;
//		int max=6;
		//int dice = (int) (Math.random()*(max+1-min)+min);  
		 int dice = (int) (Math.random()*7);                                                            //int randomNumber = (int)(Math.random() * (max + 1 - min) + min);
		return dice;
	}

}
