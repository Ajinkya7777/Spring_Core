
public class CarFactory {

     private static Car car;
	
		public static Car carFactory(String type) {
			
			if (type.equalsIgnoreCase("sportscar")) {
				car = new SportsCar();
				return car;
				//return new SportsCar();
				
			}
			else if (type.equalsIgnoreCase("LuxoryCar")) {
				     car = new LuxoryCar();
				return car;
			} 
			throw new IllegalArgumentException("car not found");
		}

	

	

	
}
