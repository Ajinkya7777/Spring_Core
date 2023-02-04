import java.text.ParseException;

public class ContactMain {

	public static void main(String[] args) {

		try {

			ContactManager manager = new ContactManager();
			manager.addContact(new Contact(" Ajinkya ", "01-21-1950", "7972927427"));
			manager.addContact(new Contact("Ryan", "01-11-1992", "6477092344"));
			manager.addContact(new Contact("Gio", "01-11-1993", "8192256979"));
			manager.addContact(new Contact("Thomas", "01-11-1994", "7972927427"));

			System.out.println(manager);

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println(" Process completed");
		}

	}

	/**
	 * Name: manageContacts
	 *
	 * Inside the function: • 1. Starts a new instance of Scanner; • 2. In an
	 * infinite loop, the user can choose to a) add b) remove a contact c) exit. •
	 * case a: ask for the name, phone number and birthDate. • case b: ask who
	 * they'd like to remove. • case c: break the loop. • 3. close Scanner.
	 */

	/**
	 * Name: loadContacts
	 * 
	 * @param fileName (String)
	 * @throws FileNotFoundException
	 *
	 *                               Inside the function: • 1. loads contacts from
	 *                               <fileName>; • 2. From the manager object, it
	 *                               adds all contacts to the contacts list. Hint:
	 *                               use scan.next to grab the next String separated
	 *                               by white space.
	 */

}
