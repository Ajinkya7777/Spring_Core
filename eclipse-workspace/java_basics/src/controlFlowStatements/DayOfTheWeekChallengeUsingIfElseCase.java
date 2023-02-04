package controlFlowStatements;

public class DayOfTheWeekChallengeUsingIfElseCase {

	public static void main(String[] args) {

		printDayOfTheWeek(5);

	}

	private static void printDayOfTheWeek(int day) {
		if (day == 1) {
			System.out.println("it's Monday");

		} else if (day == 2) {
			System.out.println("it's Tuesday");
		} else if (day == 3) {
			System.out.println("it's Wednesday");
		} else if (day == 4) {
			System.out.println("it's Thursday");
		} else if (day == 5) {
			System.out.println("it's Friday");
		} else if (day == 6) {
			System.out.println("it's Saturday");
		} else if (day == 0) {
			System.out.println("it's Sunday");
		} else {
			System.out.println("invalid day");
		}
		

	}

}
