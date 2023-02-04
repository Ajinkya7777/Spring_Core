package java_arrays;

import java.util.Arrays;

//import java.util.Scanner;

public class Array_Fundamentals_And_Concepts {

	public static void main(String[] args) {
//		
//		1. array declaration and initialization
//		2.array default values
//		3.array reference variable is always zero bcz in java, array is considered as Object.
//		4.common mistakes while declaring and initialization of an array.
		int [] aj= {1,2};    //two ways to initialize array and               
		int [] aja=aj;     // this will copy the reference or address of aj to aja and copy the elements also and they 
		              //will point out to the same array object(object will be one ) and but the reference will be two aj and aja .
		
		aja[0]=5;
		
			System.out.println("aj array "+Arrays.toString(aj));
			System.out.println("aja array "+Arrays.toString(aja));
			
			aja=new int[] {2,10};  //this will create new reference bcz of new keyword
			
			System.out.println("after change aj array "+Arrays.toString(aj));
			System.out.println("after change aja array "+Arrays.toString(aja));
			
			
		
		System.out.println(aj);
		System.out.println(aja);
		int[] quiz = null ;
		System.out.println(quiz);  //array reference quiz is null bcz it holds the reference of an object.
		int[] quiz1= new int[4];   //new array reference is created by using new keyword
		System.out.println(" will give us the reference or address of quiz1 : " +quiz1);  //will give us the reference or address of quiz1
		System.out.print("quiz1");
		for (int i = 0; i < quiz1.length; i++) {
			System.out.print( " " +quiz1[i]); //0 0 0 0 output 
		}
		System.out.println();
		
		int[] quiz2= {1,2,3,4};
		System.out.print("quiz2");
		for (int i = 0; i < quiz2.length; i++) {
			System.out.print( " " +quiz2[i]);
		}
		System.out.println();
//		int quiz3[] ;
//       quiz3=new int[4];
//       System.out.print("quiz3");
//       Scanner s= new Scanner(System.in);
//       for (int i = 0; i < quiz3.length; i++) {
//		quiz3[i]= s.nextInt();
//		System.out.print(" " +quiz3[i]);
//		
//	}
		int [] quiz4= new int[4];
       System.out.println();
        quiz1=quiz2; //copying address but not actual elements in array
       System.out.println(quiz2);
       
       System.out.println(quiz1.equals(quiz4));
       System.out.println();
       for (int i = 0; i < quiz1.length; i++) {
		System.out.println( " " +quiz1[i]);
		
	}
       quiz2[0]=12;
       System.out.println();
       
       System.out.println(" " +quiz1[0]);
       System.out.println(" " +quiz2[0]);
       System.out.println();
       
       int[] quiz5= quiz2;
       System.out.println(quiz5[0]);
       System.out.println(" " +quiz2[0]);
       quiz2[0]=13;
       System.out.println(" " +quiz5[0]);
       System.out.println(" " +quiz2[0]);
       
       
       //array iterations
//       1. traditional for loop
//       2. enhanced for loop 
//       by using for each or enhanced for loop we can not get revrese 
//       order of elements of an Array .
//       and also we can't print index of an array .

       System.out.println("iterating array using traditional for loop in forward direction");
       int[] a1= {10,20,30,40};   
       
       for (int i = 0; i < a1.length; i++) {
		System.out.println("\na1[" +i+ "] = " + a1[i]);
	}
       System.out.println("iterating array using traditional for loop in reverse direction");
       for (int i=a1.length-1;i>=0;i--) {
    	   System.out.println("\na1[" +i+ "] = " + a1[i]);
       }
       
       for (int i : a1) {
    	   System.out.println(i);
		
	}
	}

}
