import java.util.ArrayList;

public class ContactManager {

	ArrayList<Contact> contacts;

	public ContactManager() {
		this.contacts = new ArrayList<Contact>();
	}

	public void setContact(int index, Contact contact) {
		contacts.set(index, new Contact(contact));
	}

	public Contact getContact(int index) {

		return new Contact(contacts.get(index));
	}

	public void addContact(Contact contact) {

		contacts.add(new Contact(contact));

	}

	public void removerContact(String name) {
		if (contacts.isEmpty()) {
			throw new IllegalStateException("contact list is empty , unable to remove item");
		}

		if (!(name == null)) {
			for (int i = 0; i < contacts.size(); i++) {
				if (contacts.get(i).getName().equalsIgnoreCase(name)) {
					contacts.remove(i);
				}
			}

		}

	}
	
	
	public String toString() {
		String temp = "";
		for (int i = 0; i < contacts.size(); i++) {
			temp =temp+ contacts.get(i).toString();
			temp =temp+"\n\n";
		}
		return temp;
	}

}
