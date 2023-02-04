package java_arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArraySumAvg_4_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the array elements using scanner classes");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("elements present at " + i + " is " + array[i]);
		}

		int avg= ArraySumAvg_4_1.avgOfArray(array);
		System.out.println("avg of array elements is : " + avg);

	}

	public static int avgOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum= sum + a[i];

		}
		return sum/a.length;

	}

}
