package java_arrays;

import java.util.Scanner;

public class ArraySum_4 {

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

		int sum = ArraySum_4.sumOfArray(array);
		System.out.println("sum of array elements is : " + sum);

	}

	public static int sumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		return sum;

	}

}
