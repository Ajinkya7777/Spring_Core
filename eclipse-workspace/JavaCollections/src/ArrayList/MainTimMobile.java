package ArrayList;

import java.util.Scanner;

public class MainTimMobile {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhoneTim mobile = new MobilePhoneTim("7972927427");

	public static void main(String[] args) {
		int actions = 0;
		boolean exit = false;
		printActions();
		while (!exit) {
			System.out.println(" enter the action :\r");
			actions = scanner.nextInt();
			switch (actions) {
			case 0:
				printActions();
				break;
			case 1:
				mobile.PrintContactList();
				break;
			case 2:
				remove();
				break;
			case 3:
				add();
				break;
			case 4:
				modify();
				break;
			case 5:
				query();
				break;
			case 6:
				exit=true;
				break;	

			}

		}

	}


	private static void query() {
		System.out.println(" enter the contact to find");
		String contact = scanner.nextLine();
		mobile.queryContact(contact);
	}

	private static void modify() {
		System.out.println(" enter the old contact name");
		String oldContactName= scanner.nextLine();
		ContactTim ExistContact=mobile.queryContact(oldContactName);
		if (ExistContact==null) {
			System.out.println( " contact not found");
		}
		System.out.println(" enter the new contact name");
		String newName= scanner.nextLine();
		System.out.println(" enter new  contact no");
		String newContact= scanner.nextLine();
		ContactTim contact= ContactTim.createContact(newName, newContact);
		//mobile.updateContact(oldContact, newContact);
		
	}

	private static void add() {
		System.out.println(" enter the name of new contact");
		String name= scanner.nextLine();
		System.out.println(" enter the phone No of new contact");
		String contact=scanner.nextLine();
		ContactTim newContact= ContactTim.createContact(name, contact);
		if (mobile.addNewNo(newContact)) {
			System.out.println(" added successfully");
		}
		else {
			System.out.println(" failed to add");
			}

	}

	private static void remove() {
		System.out.println(" enter the contact to remove/delete");
		String remove = scanner.nextLine();
//	    if (mobile.removeContact(remove)) {
//			
//		}
	}

	private static void printActions() {
		System.out.println(" 0: printActions \n"
				+ "1: printContactList\n"
				+ "2: remove\n"
				+ "3: add\n"
				+ "4: modify\n"
				+ "5: query\n"
				+ "6: find\n"
				+ "7: exit");
	}

}
