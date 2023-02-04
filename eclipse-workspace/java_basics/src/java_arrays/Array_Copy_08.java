package java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Copy_08 {
	public static void main(String[] args) {

		// method 1. by using = operators
		/*
		 * int [] a1= {1,2 }; 
		 * int [] a2= a1;
		 *  System.out.println(" original array : "
		 * +Arrays.toString(a1)); 
		 * System.out.println(" copied array : "
		 * +Arrays.toString(a1));
		 * 
		 * 
		 * a1[0]= 11; 
		 * System.out.println(" original array : " +Arrays.toString(a1));
		 * System.out.println(" copied array : " +Arrays.toString(a2));
		 */
		 
		
		/* OUTPUT OF 1ST METHOD USING EQUALS OPERATOR
		 * original array : [1, 2] 
		 * copied array : [1, 2] 
		 * 
		 * AFTER CHANGE a[0]=11;
		 * 
		 * original array : [11, 2]
		 * copied array : [11, 2]  this copied array changed when we changed original arr
		 */

		
		
		

	
// method 2. by using for loop to copy elements of original array into copied array 	
		/*
		 * Scanner s = new Scanner(System.in);
		 * 
		 * System.out.print("enter array of size :"); int ar1 = s.nextInt(); int ar2 =
		 * ar1;
		 * 
		 * int[] a1 = new int[ar1]; int[] a2 = new int[ar2];
		 * 
		 * for (int i = 0; i < a1.length; i++) {
		 * 
		 * a1[i] = s.nextInt(); } if (ar1 == ar2) { for (int i = 0; i < a2.length; i++)
		 * { a2[i] = a1[i]; } System.out.println("Original array : " +
		 * Arrays.toString(a1)); System.out.println("Copied  array : " +
		 * Arrays.toString(a2)); } else { System.out.
		 * println(" array size should be equal otherwise it can not be copied "); }
		 * 
		 * a1[0] = 11; System.out.println(Arrays.toString(a1));
		 * System.out.println(Arrays.toString(a2));
		 */
		/*
		 * Original array : [1, 2] 
		 * Copied array : [1, 2]
		 * 
		 * AFTER CHANGE a[0]=11;
		 * 
		 * ORIGINAL ARRAY : [11, 2] 
		 * COPIED ARRAY :[1, 2]    this copied array didn't change when we changed original array
		 */
		
		
		//method 3. using arraycopy method of system class
		int [] a = new int[2];
		int [] newCopiedArray = new int[a.length];
	   Scanner s= new Scanner(System.in);
	   
	   System.out.println("length of array " +a.length);
	   
	   System.out.println("enter the array elements : ");
	   
	   for(int i =0; i<a.length;i++)
	   {
		   a[i] = s.nextInt();
	   }
	   
	   System.out.println("original created array " +Arrays.toString(a));
	   System.arraycopy(a, 0, newCopiedArray, 0, a.length);
	   
	   System.out.println("new created array " +Arrays.toString(newCopiedArray));
	   
    
	   a[0]=11; //after change
 
	   System.out.println("original created array " +Arrays.toString(a));
  
	   System.out.println("new created array " +Arrays.toString(newCopiedArray));
            
	   //AFTER CHANGE  a[0]= 11
		/* output
		 * length of array 2 
		 * enter the array elements : 1 2 
		 * original created array [1,2] 
		 * new created array [1, 2] 
		 * original created array [11, 2] 
		 * new created array
		 * [1, 2]
		 */
	   
	   }
	
}