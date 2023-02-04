package variables;

public class OperatorChallenge {

	public static void main(String[] args) {
		
		double firstVariable= 20.0d;
		double secondVariable= 80.0d;
		
		double total = 100d*(firstVariable+secondVariable);
		double remainder = total%40.0d;

		
		if(remainder==0)
		{
			boolean b= true;
			System.out.println("boolean is "+ b );
		}
		else {
			boolean c= false;
			System.out.println("got some remainder" +remainder);
			System.out.println("boolean is " +c);
		}

	}

}
