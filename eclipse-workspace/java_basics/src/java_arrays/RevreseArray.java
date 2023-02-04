package java_arrays;

import java.util.Arrays;

public class RevreseArray {
	
//	public static void reverse(int[] array) {
//		
//		int[] modifiedArray= new int[array.length];
//		
//		for (int i = 0; i <array.length; i++) {  
//			
//			
//			modifiedArray[(array.length-1)-i]=array[i];   //1st iteration (3-1)-0 2nd (3-1)-1 3rd (3-1)-2   4th condition false
//			                                              //        mA[2]            mA[1]           mA[0]
//		}
//		System.out.println(Arrays.toString(modifiedArray));
//		
//		
//		
////	
//		}
	
	public static void reverseArray(int[] array)
	{
		int maxIndexLength=array.length-1;
		int halfLength=(array.length-1)/2;
		System.out.println(" array max index length " +maxIndexLength);
		System.out.println(" array half length " +halfLength);
		for (int i = 0; i <=halfLength; i++) {
			
			
			int temp=array[i];
			array[i]=array[maxIndexLength-i];
			array[maxIndexLength-i]=temp;
			
		}
		System.out.println(Arrays.toString(array));
	}

}
