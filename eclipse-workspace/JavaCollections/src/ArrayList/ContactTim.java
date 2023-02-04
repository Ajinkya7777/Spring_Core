package ArrayList;

public class ContactTim {

	private String myNo;
	private String name;
	public ContactTim(String myNo, String name) {
		
		this.myNo = myNo;
		this.name = name;
	}
	
	public static ContactTim createContact(String myNo,String name) {
		return new ContactTim(myNo, name);
	}

	public String getMyNo() {
		return this.myNo;
	}

	public String getName() {
		return this.name;
	}
	
}
