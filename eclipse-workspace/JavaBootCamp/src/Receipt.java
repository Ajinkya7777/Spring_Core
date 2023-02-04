
public class Receipt {

	static double[] price= {1.99, 1.49, 1.29};
	public static void main(String[] args) {
		String[] apples = {"Gala", "Granny Smith", "Macintosh"};
		
		System.out.println(" Here's your receipt:\n\t");
		for (int i = 0; i < apples.length; i++) {
			System.out.println(apples[i]+":"+price[i]);
		}
	}

	

}
