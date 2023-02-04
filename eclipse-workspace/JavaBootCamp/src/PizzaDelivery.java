import java.util.Scanner;

public class PizzaDelivery {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" How many Pizza toppings you want?");
		int noOftoppings=scan.nextInt();
		System.out.println(" Great! Enter each toppings.");
		scan.nextLine();
		String[] toppings= new String[noOftoppings];
		 
		for (int i = 0; i < toppings.length; i++) {
			System.out.print(i+".");
		     toppings[i]=scan.nextLine();
		}
		System.out.println(" \nThank you! here are the toppings you ordered.");
		for(String top:toppings) {  
			System.out.println(top);
			
		}
		System.out.println(" Press enter to order :");
		scan.nextLine();
		System.out.println(" \n Thanks for ordering , Driver is on the way. ");
		scan.close();
	}

}
