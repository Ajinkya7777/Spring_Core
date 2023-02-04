import java.util.Scanner;

public class JavaSignin {

	public static void main(String[] args) {
		
		String uName= "Ajinkya";
		String pwd = "java";
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Welcome to JavaGram! Sign in below");
		 boolean success = true;
		 while (success) {
			 System.out.print(" Username: " );
			 String uname = scan.nextLine();
			 System.out.print(" Password: " );
			 String pwod = scan.nextLine();
			if (uname.equals(uName) && (pwod.equals(pwd))) {
				success=false;
			} 
			else {
				System.out.println(" Incorrect, please try again!");
			}
		}
		 System.out.println(" login successfully");
		 scan.close();
	}

}
