import java.util.Scanner;

public class Delimiters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		System.out.println(" enter two integers\n");
//		
//		int no1= scan.nextInt();
//		int no2 = scan.nextInt();
//		
//	
//		System.out.println(" enter two very big decimals");
//		
//		int no11 = scan.nextInt();
//		int no22 = scan.nextInt();
//		
//		System.out.println(" enter two decimals (on the same line)");
//
//		double no111= scan.nextDouble();
//		double no222= scan.nextDouble();
//		
//		System.out.println(" enter two strings on same line");
//
//		String str1 = scan.next();
//		String str2 = scan.next();
//		
//		
//		System.out.println(" first two small Numbers\t"+no1+"\t"+no2);
//		System.out.println(" first two large Numbers\t"+no11+"\t"+no22);
//		System.out.println(" first two double Numbers\t"+no111+"\t"+no222);
//		System.out.println(" first two Strings\t\t"+str1+"\t"+str2);
		
		//=====================	ACTUAL ISSUE WITH "SCAN.NEXTLINE()=========================
		//WHEN WE USE SCAN.NEXTLINE AFTER NEXTINT,NEXTDOUBLE,NEXTLONG,NEXTFLOAT,NEXT WE NEED TO USE ONE THROW AWAY
		//LINE BY ADDING THE ONE EXTRA SCAN.NEXTLINE EXTRA BCZ WHEN WE TOOK INT ,FLOAT , LONG ,STRING VALUE FROM 
		//SCANNER BY USING ABOVE METHODS THE CURSOR WILL REMAIN ON SAME LINE AND THEN WHEN WE HIT ENTER IT WILL 
		//TAKE THAT LINE AS SCAN.NEXTLINE SO IT WILL SKIP THAT LINE. SO ALWAYS ADD EXTRA SCAN.NEXTLINE AFTER NEXTINT
		//NEXTLONG NEXTFLOAT NEXT NEXTDOUBLE ETC....
		
		
		System.out.println("enter the sample no to test nextLine issue ");
		  int a1 = scan.nextInt();
		  System.out.println(a1);
		  scan.nextLine();
		  
		  System.out.println("enter the string");
		  String what = scan.nextLine();
		  System.out.println(what);
		  
		  System.out.println(" enter another string");
		  String yes = scan.nextLine();
		  System.out.println(yes);
		  System.out.println("anoter one");
		  String no = scan.nextLine();
		  System.out.println(no);
		  
		  scan.close();
	}

}
