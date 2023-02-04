package java_arrays;

import java.util.Scanner;


public class Array_Max_Min_06 {

	public static void main(String[] args) {
		int index = 0;
		int max = 0;
		int min = 0;

		int[] array = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("enter the elements in array :");
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();

		}
		System.out.print("enterd array elements are :");
		max = array[0];
		min = array[0];

		for (int i : array) {
			System.out.print(" " + i);

		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			/*
			 * System.out.print("array element are : "
			 * +array[i]);System.out.println("element preset at index " +i+ "is " +array[i]
			 * )
			 */
			/* */

			if (max < array[i]) {
				max = array[i];
				index = i;
			}

			/*
			 * else { max=array[0]; }
			 */
		}
		System.out.println("max element is :" + max + " at index " + index);
		System.out.println(index);
		index=0;

		for (int i = 0; i < array.length; i++) {
			/*
			 * System.out.print("array element are : " +array[i]);
			 * System.out.println("element preset at index " +i+ "is " +array[i] )
			 */
			/* ; */

			if (min > array[i]) {
				min = array[i];
				index = i;
			}

			/*
			 * else { max=array[0]; }
			 */
		}
		System.out.println();
		System.out.println("min element is :" + min + " at index " + index);

	}

}