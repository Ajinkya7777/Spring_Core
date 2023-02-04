package java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] twod = new int[4][4];
		System.out.println("enter the 2d array elements ");
		for (int i = 0; i < twod.length; i++) {
			for (int j = 0; j < twod.length; j++) {
				twod[i][j] = s.nextInt();
			}

		}

		for (int i = 0; i < twod.length; i++) {
			System.out.println(i);

			for (int j = 0; j < twod.length; j++) {
				System.out.println("elements present at index " + "twod["+i+"]["+j+"]" + " array is :" + twod[i][j]);
				System.out.println("elements present at index " + "twod"+"["+i+"]"+"["+j+"]"+ " array is :" + twod[i][j]);
				System.out.println("elements present at index " + "twod"+ "["+i+"]"+"["+j+"]" + " array is :" + twod[i][j]);
				System.out.println(Arrays.deepToString(twod));
			}
		}

	}

}
