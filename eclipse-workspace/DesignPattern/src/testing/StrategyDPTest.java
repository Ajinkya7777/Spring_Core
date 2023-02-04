package testing;

import StatergyPattern.Flipkart;
import StatergyPattern.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		try {
			Flipkart fpkt = FlipkartFactory.createFlipkart("dtdc");
			
			String result = fpkt.shopping(new String[]{"shirt"}, new double[] {2000});
			System.out.println(result);
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}

}
