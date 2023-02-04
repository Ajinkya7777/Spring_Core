
 /*//Program2:- Develop a Java program to define a method to receive 
               the number of integer values dynamically from another 
                method as an argument in this method. 
                Read and display all values.*/
package java_arrays;

public class Array_Method_2 {

	public static void main(String[] args) {

		int[] array= {10,20,30};
		Array_Method_2.passArray(array);
	}
	
		
	public static void passArray(int[] a)
	//there are two ways to print array one is using normal for loop and one is for each loop
	//1. for each loop
	//2. normal for loop
	{
		/*1. for each loop :-
		 * 
		 * //way to print array or loop array using for each loop i.e. enhanced loop
		 *
		 * System.out.println("array elements are : "); 
		 * for(int ia: a) 
		 * {
		 * System.out.print( " " +ia); 
		 * }
		 */
		
		//2. Normal for Loop
		System.out.println("array elements are : ");
		for(int i=0; i<a.length;i++)
		{
			//way to print or loop array using normal loop
			System.out.println(" " +a[i]);
		}
			
	}
	}


