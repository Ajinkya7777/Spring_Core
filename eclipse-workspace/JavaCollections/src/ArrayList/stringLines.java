package ArrayList;

import java.util.Scanner;

public class stringLines {
   private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		
//		int no= scanner.nextInt();
//		System.out.println(no);
//	//	scanner.nextLine();
//		String s= scanner.next();
//		System.out.println("pagal:"+s);
//		
//		for (int i = 0; i < 2; i++) {
//			System.out.println(" enter the string :\r");
//			String item= scanner.nextLine();
//			String itemm= scanner.next();
//			//String items= scanner.nextLine();
//		//scanner.nextLine();
//			System.out.println(item);
//			//System.out.println(items);}
System.out.println(" enter the age");
int itemNo= scanner.nextInt();
System.out.println("age " +itemNo);
System.out.println(" enter the first name");

System.out.println(" enter the mobile no");

int mobileNo= scanner.nextInt();
System.out.println(" my mobile no" + mobileNo);
  String firstName= scanner.next();
  System.out.println("first name: "+firstName);
  scanner.nextLine();
  System.out.println(" enter the middle name:" );
  String middleName= scanner.nextLine();
  System.out.println("middle name : " +middleName);
  System.out.println(" enter the full name");
  //scanner.nextLine();
  String fullName= scanner.nextLine();
  System.out.println("full name:"+firstName + middleName + fullName);
  

	}
}


//when we use scanner.next we can only take input once while if we want take any input 
