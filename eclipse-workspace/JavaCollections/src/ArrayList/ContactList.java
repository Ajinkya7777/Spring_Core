package ArrayList;

import java.util.ArrayList;

public class ContactList {

	private ArrayList<String> contactList = new ArrayList<String>();
	private ArrayList<String> nameList = new ArrayList<String>();

	public void displayContacts() {
		System.out.println(" you have " + contactList.size() + " contacts in your phone");
		if (contactList.size() != 0) {
			for (int i = 0; i < contactList.size(); i++) {
				System.out.println(" Contact Details: " + contactList.get(i));
			}

		}

	}

	public void addNewContact(String contact,String name) {
		this.contactList.add(contact);
		this.AddName(name);
		//this.contactList.add(name);
	}

	private void AddName(String name) {
		nameList.add(name);
		//String contact= nameOfContact(name);
		System.out.println(" The name of contact holder is " +name);//+" contact no :>" +contact);
		
	}

	public void removeContact(String contact) {
		int contactIndex = this.searchContact(contact);
		this.removecontact(contactIndex);
	}

	private void removecontact(int contactIndex) {
		contactList.remove(contactIndex);
	}

	public void modifyContact(String contactOld, String contactUpdated) {
		int contactIndex = this.searchContact(contactOld);
		this.modifyContact(contactIndex, contactUpdated);
	}

	private void modifyContact(int contactIndex, String contact) {
		contactList.set(contactIndex, contact);
	}

	public boolean searchContacts(String contact) {
		return contactList.contains(contact);
	}

	private int searchContact(String contact) {
		return contactList.indexOf(contact);
	}

	public String nameOfContact(String contact) {
		int contactIndex = this.searchContact(contact);
		String contactNo = contactList.get(contactIndex);
		System.out.println(contactNo);
		return contactNo;

	}

}
