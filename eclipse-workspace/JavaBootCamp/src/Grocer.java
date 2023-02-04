import java.util.Scanner;

public class Grocer {

	public static void main(String[] args) {
		String[] aisle={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
		
		System.out.println(" welcome to java Grocers.");
		System.out.println(" What can I help you find?");
		Scanner scan = new Scanner(System.in);
		String needs = scan.nextLine();
		System.out.println(" \nDo you sell " +needs+ "?");
		
		for (int i = 0; i < aisle.length; i++) {
			if (aisle[i].equalsIgnoreCase(needs)) {
				System.out.println("\n We have that in aisle: "+i);
				break;
			}
			else {
				continue;
				
			}
		}

		scan.close();
	}

}
