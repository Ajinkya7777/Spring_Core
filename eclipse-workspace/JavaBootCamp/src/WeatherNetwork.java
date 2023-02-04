
public class WeatherNetwork {

	public static void main(String[] args) {
		 int temp=12;
	        String forecast;

	        if (temp<=-1) {
	        	forecast="the forecast is  Freezing! stay home!";
				//System.out.println("the forecast is "+forecast+ "! stay home!");
			}
	        
	        else if (temp<=10) {
				forecast = " the forecast is chilly Wear a coat!";
				//System.out.println(" the forecast is " +forecast+ " Wear a coat!");
			}
	        else {
	        	forecast= " it's a warm . Go outside!";
			//	System.out.println(" it's a warm . Go outside!");
			}
	        System.out.println(forecast);
	}

}
