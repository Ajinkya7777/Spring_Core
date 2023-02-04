package java_arrays;

import java.util.Scanner;

public class Array_User_Input_3 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int[] marks= new int[8];
		int i;
		System.out.println("size of  array :" +marks.length);
		System.out.println("enter the elements present in array :" );
		for( i=0; i<marks.length;i++)
		{
			//this for loop is used for taking values from user
			marks[i]=s.nextInt();
		}
		System.out.println("the elements which are present in array are: ");
		for(int j=0; j<marks.length;j++)
		{
			//this for loop is used for printing values entered by userS
          System.out.println(marks[j]);
		}
		s.close();
		
	}
}
