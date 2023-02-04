import java.util.Arrays;

public class Weather {

	public static void main(String[] args) {
		//double[﻿] celsius = {﻿12.5﻿, 14.5﻿, 17.0﻿, 21.0﻿, 23.0﻿, 18.5﻿, 20.0﻿}﻿;
		
		double[] celsius= {12.5,14.5,17.0,21.0,23.0,18.5,20.0};
		
			double[] fahrenheit=celciusToFahrenheit(celsius);
			//System.out.println(Arrays.toString(fahrenheit));
			printTemperatures(celsius,"celsius");
			printTemperatures(fahrenheit,"fahrenheit");

	}

	private static void printTemperatures(double[] temprature,String tempType) {
		
	System.out.print(tempType+" :");
	 for (int i = 0; i < temprature.length; i++) {
		System.out.print(temprature[i]+" ");
	}
	 System.out.println("\n");
	}

	private static double[] celciusToFahrenheit(double[] celsius) {
		double[] fahrenheit=Arrays.copyOf(celsius, celsius.length);
		for (int i = 0; i < fahrenheit.length; i++) {
			//(F = (C/5 * 9) + 32)
			fahrenheit[i]=(celsius[i]/5 *9)+32;
			
		}
		return fahrenheit;
	}

}
