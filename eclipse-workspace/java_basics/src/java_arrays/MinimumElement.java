package java_arrays;

import java.util.Scanner;


public class MinimumElement {
	
//private static	Scanner input = new Scanner(System.in);
	
	private static  int readIntegers() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number : \r");
		
		int no= input.nextInt();
		return no;
	}
	
	private static  int[] readElement(int no) {
		Scanner input = new Scanner(System.in);
		int[] array= new int[no];
		System.out.println(" enter the " +no+ " elemetns");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
			
		}
		return array;
		
	}

	private static int findMin(int[] array)
	{
		int min=0;
	          for (int i = 0; i < array.length; i++) {
				if (array[i]<min) {
		          			
		                 min=array[i];
				}
			}
	          return min;
	}
}
