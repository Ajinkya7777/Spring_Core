package ArrayList;

import java.util.ArrayList;

public class MobilePhoneTim {

	private String myNo;
	private ArrayList<ContactTim> contactList;
	public MobilePhoneTim(String myNo) {
		super();
		this.myNo = myNo;
		this.contactList = new ArrayList<ContactTim>();
		
	}
	public boolean updateContact(ContactTim oldContact,ContactTim newContact) {
		int foundPosition=findContact(oldContact);
		if (foundPosition<0) {
			System.out.println(oldContact.getName()+" the contact is not found");
			return false;
		}
		else if (findContact(newContact.getName())!=-1) {
			System.out.println(" the new contact to updated is alredy exist in contactlist");
			return false;
		} 
		this.contactList.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+" updated with " + newContact.getName() );
		return true;
	}
	
	public boolean addNewNo(ContactTim contact) {
		if (findContact(contact.getName())>=0) {
			System.out.println(" contact is already on contact list:");
			return false;
		}
		contactList.add(contact);
		return true;
	}
	
	private int findContact(ContactTim contact) {
		return contactList.indexOf(contact);
		
	}
	private int findContact(String name) {
		for (int i = 0; i < contactList.size(); i++) {
			ContactTim contact=this.contactList.get(i);
			if (name.equals(contact)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean removeContact(ContactTim contact) {
		int position=findContact(contact);
		if (position>=0) {
			contactList.remove(position);
			return true;
		}
		return false;
	}
	public void PrintContactList() {
		System.out.println("contact List:");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println((i+1)+ "." +contactList.get(i).getName()+" ->" +contactList.get(i).getMyNo() );
		}
	}
	public String queryContact(ContactTim contact) {
		if (findContact(contact)>=0) {
			return contact.getName();
		}
		return null;
	}
	public ContactTim queryContact(String name) {
		int position=findContact(name);
		if (position>=0) {
			return contactList.get(position);
		}
		return null;
	}
	
}
