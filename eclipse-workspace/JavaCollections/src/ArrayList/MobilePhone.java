package ArrayList;

import java.util.Scanner;

public class MobilePhone {
	public  static Scanner input = new Scanner(System.in);
	private static ContactList mobile = new ContactList();

	public static void main(String[] args) {
		boolean exit = false;
		int choice=0;
		options();
		

		while (!exit) {
			System.out.println("enter choice from options menu:");
			choice=input.nextInt();
			input.nextLine();

			switch (choice) {
			
			case 0:
				options();
				break;
			case 1:
				mobile.displayContacts();
				break;
			case 2:
				searchContactByNo();
				break;
			case 3:
				addNo();
				break;
			case 4:
				removeNo();
				break;
			case 5:
				modifyNo();
				break;
			case 6:
				searchContactByName();
				break;
			case 7:
				exit = true;

			}

		}
	}

	private static void options() {
		System.out.println("\t 0:Following are the options");
		System.out.println("\t 1: Display contacts");
		System.out.println("\t 2:Search contact");
		System.out.println("\t 3:Add new Number");
		System.out.println("\t 4:Remove Existing Number");
		System.out.println("\t 5:Modify Existing Number");
		System.out.println("\t 6:Name of contact");
		System.out.println("\t 7:Exit");

	}

	

	private static void searchContactByNo() {
		System.out.println(" enter the contact to search ");
		String contact = input.nextLine();
		mobile.searchContacts(contact);
	}

	private static void addNo() {
		System.out.println(" enter the contact to add");
		String contact= input.nextLine();
		System.out.println(" enter the Name of contact");
		String name= input.nextLine();
		mobile.addNewContact(contact,name);
	}

	private static void removeNo() {
		System.out.println(" enter the contact to Remove");
		String contact= input.nextLine();
		mobile.removeContact(contact);
	}

	private static void modifyNo() {
		System.out.println(" enter the contact to Modify");
		String contactOld= input.nextLine();
		String contactUpdated= input.nextLine();
		mobile.modifyContact(contactOld, contactUpdated);
	}

	private static void searchContactByName() {
		System.out.println(" enter the contact to get Name");
		String contact= input.nextLine();
		mobile.nameOfContact(contact);
	}

}
