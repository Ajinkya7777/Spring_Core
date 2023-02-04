package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGrocery {

	private static Scanner scanner = new Scanner(System.in);

private static GroceryList groceryList = new GroceryList();
	
	

	public static GroceryList getGroceryList() {
		return groceryList;
	}

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println(" enter your choice :");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;

			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				processArray();
			case 7:
				quit = true;
				break;
			}
		}

	}

	private static void processArray() {
	ArrayList<String> newArray= new ArrayList<String>(groceryList.getGroceryList());
	System.out.println(newArray.toString());
	
	}

	private static void printInstructions() {
		
		System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - T0 copy the orignal ArrayList to newArrayList");
        System.out.println("\t 7 - To quit the application.");

	}

	private static void addItem() {
		
		System.out.println(" please enter the grocery item:	");
	   groceryList.addGroceryItm(scanner.nextLine());

	}

	private static void modifyItem() {
	System.out.println(" enter the item to be replaced :");
	String itemp= scanner.nextLine();
	//scanner.nextLine();
		System.out.println(" enter the replacement item in String:");
		String itemr=scanner.nextLine();
	//	groceryList.modifyGroceryItem(itemNo, newItem); //(itemNO-1 or itemNo) check
		groceryList.modifyGroceryItem(itemp,itemr); //(itemNO-1 or itemNo) check

	}

	private static void removeItem() {
		
		System.out.println(" enter item number:");
		String item= scanner.nextLine();
		groceryList.modifyRemoveGroceryItem(item);

	}

	private static void searchForItem() {

		System.out.println(" item to be searched for:");
		String Item= scanner.nextLine();
		groceryList.findGrocery(Item);
	}

}
