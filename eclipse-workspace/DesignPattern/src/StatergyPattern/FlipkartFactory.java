package StatergyPattern;

public class FlipkartFactory {
	private static Courier courier = null;
	//private static Courier courier ;
	public static Flipkart createFlipkart(String courierType) {
		//create target class object 
		 
		Flipkart fp = new Flipkart();
		// Courier courier = null;
		//create dependent class object on given courier type like dtdc or bluedart
		
		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}
		else if (courierType.equalsIgnoreCase("bluedart")) {
			courier= new BlueDart();
			
		}
		else {
			throw new IllegalArgumentException("invalid courier type");
		}
		
		fp.setCourier(courier);
		return fp;
		
		
	}

}
