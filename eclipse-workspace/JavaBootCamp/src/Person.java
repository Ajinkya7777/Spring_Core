import java.util.Arrays;

public class Person {

	private String name;
	private String nationality;
	private String dateOfBirth;
	private String[] passport;

	private int seatNumber;

	public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.seatNumber = seatNumber;
		this.passport = new String[3];
	}

	public Person(Person twin) {
		this.name = twin.name;
		this.dateOfBirth = twin.dateOfBirth;
		this.nationality = twin.nationality;
		this.seatNumber = twin.seatNumber;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String[] getPassport() {
		return Arrays.copyOf(passport, passport.length);
	}

	public void setPassport() {
		
		passport[0]=name;
		passport[1]=nationality;
		passport[2]=dateOfBirth;
	}

	public boolean applyPassport() {
		int random = (int) (Math.random() * 2);
		if (random == 1) {
			return true;
		}
		return false;
	}

	public void chooseSeat() {
		int seatNo = (int) (Math.random() * 12);

		this.seatNumber = seatNo;

	}
	
	public String toString() {
		return "Name: " + this.name + "\n" + "Nationality: " + 
				this.nationality + "\n" + "Date of Birth: " + 
				this.dateOfBirth + "\n" + "Seat Number: " +
				this.seatNumber + "\n" + "Passport: " + 
				Arrays.toString(this.passport) + "\n";
	}

}
