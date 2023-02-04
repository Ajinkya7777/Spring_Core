package StatergyPattern;
//target class
import java.util.Arrays;
import java.util.Random;

final public class Flipkart {	
	private Courier courier;

	public Flipkart() {
		System.out.println(" Flipkart:: 0 param constructors");
	}

	public void setCourier(Courier courier) {
		
		System.out.println(" Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	
	public String shopping(String items[], double prices[]) {
		
		double billAmount=0.0f;
		for (int i = 0; i < items.length; i++) 
			billAmount=billAmount+prices[i];
			
			int oid = new Random().nextInt(100000);
			
			String status = courier.delivery(oid);
String finalStatus= Arrays.toString(items)+" are purchaed with prices "+ Arrays.toString(prices)+
   " the total bill amount is : "+billAmount;

	return finalStatus + " "+ status;
	}
	
	
	

}
