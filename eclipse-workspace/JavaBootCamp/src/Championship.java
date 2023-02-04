
public class Championship {

	public static void main(String[] args) {
		int gryf = 100;
		int raven = 500;

		int margin = gryf - raven;
		
//		if (margin >= 300) {
//			System.out.println(" gryf won the championship");
//		} else {
//			if ((gryf > raven) && (margin < 300)) {
//				System.out.println(" gryf came at 2nd position");
//			} else if (/*(gryf < raven) &&*/ (margin <= 100)) {
//				System.out.println("gryf came at 3rd position");
//			} 
//			else if (/*(gryf<raven)&&*/(margin<=0)) {
//				
//				System.out.println("gryf came at 4th position");
//			}
//			else {
//			System.out.println(" invalid output");
//			}
//		}
		
		if (margin>=300) {
			System.out.println(" gryf won the championship");
		}
		else if (margin>=0) {
			System.out.println(" gryf came at 2nd position");
		}
		else if (margin>=-100) {
			System.out.println("gryf came at 3rd position");
		}
		else {
			System.out.println("gryf came at 4th position");
		}
	}

}
