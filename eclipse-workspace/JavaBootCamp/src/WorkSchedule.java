public class WorkSchedule {
	
	public static void main(String[] args) {
		int day = 6;
		boolean holiday=false;
		
//		switch (day) {
//		case 1:
//			System.out.println(" it's Monday , wake up at 7.00 AM");
//			break;
//		case 2:
//			System.out.println(" it's Tuesday , wake up at 7.00 AM");
//			break;
//		case 3:
//			System.out.println(" it's Wednesday (Holiday), wow! no work");
//			break;
//		case 4:
//			System.out.println(" it's Thursday, wake up at 7.00 AM");
//			break;
//		case 5:
//			System.out.println(" it's Friday, wake up at 7.00 AM");
//			break;
//		case 6:
//			System.out.println(" it's Saturday and weekend, wow! no work");
//			break;
//		case 0:
//			System.out.println(" it's Sunday and weekend, wow! no work");
//			break;
//
//		default:
//			System.out.println(" enter the valid day")}
		
		if (holiday) {
			System.out.println(" wow! no work");
		}
		else if ((day==6)||(day==0)) {
			System.out.println(" it's weekend , Wow! no work");
			
		}
		else {
			System.out.println(" wake up at 7 AM");
		}
	}
}