package controlFlowStatements;

public class DayOfTheWeekChallengeUsingSwitchCase {

	public static void main(String[] args) {
		
		printDayOfTheWeek(0);

	}
	
	public static void printDayOfTheWeek(int day) {
		
		switch (day) {
		case 1:
			System.out.println("it's Monday");
			break;
		case 2: 
			System.out.println("it's Tuesday");
			break;
		case 3: 
			System.out.println("it's Wednesday");
			break;
		case 4: 
			System.out.println("it's Thursday");
			break;
		case 5: 
			System.out.println("it's Friday");
			break;
		case 6: 
			System.out.println("it's Saturday");
			break;
		case 0: 
			System.out.println("it's Sunday");
			break;

		default:
			System.out.println("invalid day");
			break;
		}
		
		
	}

}
