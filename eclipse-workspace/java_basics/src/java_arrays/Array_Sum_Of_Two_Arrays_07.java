package java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum_Of_Two_Arrays_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] sumArray = new int[5];
		System.out.println("enter the elements for array1 : ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = s.nextInt();
		}

		System.out.print("array1: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}
		System.out.println();

		System.out.println("enter the elements for array2 : ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = s.nextInt();
		}
		System.out.print("array2: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}

		for (int i = 0; i < sumArray.length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}
		System.out.println(" array created by additing two arrays is  : ");

		System.out.print(Arrays.toString(sumArray) + " ");

	}
}
