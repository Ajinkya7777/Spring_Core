package StatergyPattern;

public class Singelton {
	
	// creating private static object of singleton class to store variable
	private static Singelton single;
	private Singelton() {
		
		System.out.println("Singelton: inside private 0-param constructor");
	}
	
	//making static factory method to create the single object
	
	public static Singelton createInstance() {
		if (single==null) {
			single=new Singelton();
		}
		return single;
	}
		
}
