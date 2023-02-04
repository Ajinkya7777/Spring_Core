package java_arrays;

import java.util.Scanner;

import com.sun.jdi.Method;

public class System_Array_copy {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter the size of an array : ");
		int size=s.nextInt();
	System.out.println("enter the size of temp array : ");
		int tempsize=s.nextInt();
		int [] a=new int[size];
		int [] temp = new int[tempsize];

		for (int i = 0; i < a.length; i++) {
			
			a[i]=s.nextInt();
			//System.out.println(a[i]);
		}
		
		System.arraycopy(a,0,temp,0,a.length);
//		//while using SYSTEM.ARRAYCOPY METHOD length of the new or 
//		Copied array should be same as that of original array or 
//		size of an array should be same as that of original array.
		
		//we can increase the size of an array but can't able to decrease it means we can 
//		   give new array size or length can be more of original size array while using System.arraycopy(src, srcPos, dest, destPos, length);
//		Method .class and it can't be less like if we have 4 size of orignial array and we are declaring another array to copy from original so it's 
//		size can be more than 4 but not less if it's 3 then we will get an error like arrayoutofbountexception..
//		
		a=temp;
		temp=null;
		for (int i : a) {
			System.out.println(i);
		}
		

	}

}
