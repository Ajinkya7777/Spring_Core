

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("Ajinkya", "India", "21/01/1997", 777);

		boolean varify = person.applyPassport();
		person.chooseSeat();

//	   Person twin = new Person(person); // creates a copy of the first object.
//	    twin.setName("Jad Slim"); // updates name field of the second object.
//	    twin.setSeatNumber(3); 

//		System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
//				+ "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
		if (varify==true) {
			//System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
			person.setPassport()	;
		} 
		// System.out.println("Name: " +twin.getName() + "\n" + "Nationality: " +
		// twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() +
		// "\n" + "Seat Number: " + twin.getSeatNumber()+ "\n");

//		System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
//				+ "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n"
//				+ "Passport: " + Arrays.toString(person.getPassport()) + "\n");
		
		System.out.println(person);
	}

}
