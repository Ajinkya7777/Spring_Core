import java.util.Scanner;

public class QuizTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String q11="c";
		String q22="a";
		String q33="d";
		String q44="a";
		int count =0;
		//String q55="c";
		
		System.out.println(" 1.which country held the 2016 summer Olympics?\n");
		System.out.println("\ta)China \n\tb)Ireland \n\tc)Brazil \n\td)Italy\n");
        String q1= scan.nextLine();
        
        System.out.println(" 2.which planet is hottest?");
        System.out.println("\ta)Venus \n\tb)Saturn \n\tc)Mercury \n\td)Mars\n");
          String q2 = scan.nextLine();
          
          System.out.println(" 3.what is the rarest blood type?");
		System.out.println(" \ta)O \n\tb)A \n\tc)B \n\td)AB-Negative");
		String q3 = scan.nextLine();
		
		System.out.println("4.Which one of these characters is friends with Harry Potter?");
		System.out.println("\ta)Ron \n\tb)Hermione \n\tc)Draco");
		String q4= scan.nextLine();
		
//		if ((q1.equals(q11))&&(q2.equals(q22))&&(q3.equals(q33))&&(q4.equals(q44))) {
//			System.out.println(" wow! you know your stuff!");
//		}
//		else {
//			System.out.println(" better luck next time");
//		}
		if ((q1.equals(q11))) {
			count +=5;
		}
		if ((q2.equals(q22))) {
			count +=5;
		}
		if ((q3.equals(q33))) {
			count +=5;
		}
		if ((q4.equals(q44))) {
			count +=5;
		}
	       String result = count>15?" you know your stuff":"better luck next time";
	       System.out.println(result+" your marks :"+count);
		
		scan.close();
	}

}
