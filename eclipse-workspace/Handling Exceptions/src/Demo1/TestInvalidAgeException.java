package Demo1;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String error) {
       
    super(error);
	}

}

public class TestInvalidAgeException {

	public static void validate(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("the age is not valid to vote");
		}

		else {
			System.out.println("you are welcome to vote  ");
		}

	}

	public static void main(String[] args) throws InvalidAgeException {
		try {
			validate(19);	
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}

}