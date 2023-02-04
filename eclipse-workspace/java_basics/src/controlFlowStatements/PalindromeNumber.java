package controlFlowStatements;

public class PalindromeNumber {

	public static boolean isPalindrome(int number) {
		int reminder = 0;
		int sum = 0;
		System.out.println(number);
		if (number < 0) {
			number = -(number);
			System.out.println(number);
		}

		int temp = number;
		
			
		
		while (temp > 0) {
			reminder = temp % 10; // 121
			sum = (sum * 10) + reminder;
			temp = temp / 10;

		}

		if (sum == number) {
			return true;
		}

		return false;

	}

}
