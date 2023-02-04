
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {

	private String name;
	private String dob;
	private int age;
	private String phoneNO;

	public Contact(String name, String dob, String phoneNO) throws ParseException{
		
		if (name==null || name.isBlank() || dob==null || dob.isBlank() || phoneNO.length()<5 || phoneNO.isBlank() || phoneNO==null) {
			throw new IllegalArgumentException(" Invalid input,Can not be null or left blank");
		}
		this.name = name;
		this.dob = dob;
		String dobString = dob;
		SimpleDateFormat simple = new SimpleDateFormat("MM-dd-yyyy");
		simple.setLenient(false);
		Date dateOfBirth = simple.parse(dobString);
		Date todayDate = new Date();
		long todayDateMS = todayDate.getTime();
		long dateOfBirthMS = dateOfBirth.getTime();
		long diffInAgeMS = todayDateMS - dateOfBirthMS;
		long days = TimeUnit.MILLISECONDS.toDays(diffInAgeMS);
		int age = (int) days / 365;
		this.age = age;
		this.phoneNO = phoneNO;
	}
	public Contact(Contact contact) {
		this.name= contact.name;
		this.dob=contact.dob;
		this.age=contact.age;
		this.phoneNO=contact.phoneNO;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name==null || name.isBlank()) {
			throw new IllegalArgumentException(" Name can't be null or left blank");
		}
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) throws ParseException {

		SimpleDateFormat simple = new SimpleDateFormat("MM-dd-yyyy");
		simple.setLenient(false);
		Date dateOfBirth = simple.parse(dob);
		Date todayDate = new Date();
		long todayDateMS = todayDate.getTime();
		long dateOfBirthMS = dateOfBirth.getTime();
		long diffInAgeMS = todayDateMS - dateOfBirthMS;
		long days = TimeUnit.MILLISECONDS.toDays(diffInAgeMS);
		int age = (int) days / 365;
		this.setAge(age);
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		
		if (phoneNO==null || phoneNO.isBlank() || phoneNO.length()<5) {
			throw new IllegalArgumentException(" Name can't be null or left blank");
		}
		this.phoneNO = phoneNO;
	}

	@Override
	public String toString() {

		return "Name: " + name + "\n" +

				"Phone number: " + phoneNO + "\n" +

				"Birth Date: " + dob + "\n" +

				"Age: " + age + " year old\n";
	}

}
